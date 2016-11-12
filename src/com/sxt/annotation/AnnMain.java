package com.sxt.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
//��������ʱע���ʹ�á�����һ�ֱ���ʱע��
public class AnnMain {
	public static void main(String[] args) {
		// ���Class����
		Class userclass = User.class;
		// Class userclass1=Class.forName("ע��.User");
		// ��������е�ע��
		Annotation[] annotations = userclass.getAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			System.out.println("ע��" + (i + 1) + annotations[i].toString());
		}
		// ������Ҫ����Ƿ���TableSqlע��
		if (userclass.isAnnotationPresent(TableSql.class)) {
			String sql = "\n creat table   ";
			// ���ָ����ע��
			TableSql ts = (TableSql) userclass.getAnnotation(TableSql.class);
			// ���ע���е�ֵ
			String tablename = ts.value();
			// �ж�ע���Ƿ� ���ó�Ա������ֵ
			if ("".equals(tablename)) {
				// ���û������ ��ʹ��������Ϊ����
				tablename = userclass.getSimpleName().toLowerCase();
			}
			// ��������ͱ����Ķ�Ӧ��ϵ
			System.out.println("[ ]" + userclass.getName() + "===" + tablename);
			sql += tablename + "(\n   ";
			// ��user���л�� ���зǼ̳��ֶ�
			Field[] fields = userclass.getDeclaredFields();
			// ����һ����������\��������
			ArrayList<String> list = new ArrayList<String>();
			// �ж��ֶ��ϵ�ע��
			for (int i = 0; i < fields.length; i++) {
				Field ff = fields[i];
				if (ff.isAnnotationPresent(TableColumnSQL.class)) {
					TableColumnSQL tcs = ff.getAnnotation(TableColumnSQL.class);
					// ���ע��ֵ
					String filename = tcs.value();
					// ���Լ��
					Constraint cons = tcs.constraint();
					// ���Լ����ֵ
					boolean b1 = cons.allowNull();
					boolean b2 = cons.isPrimary();
					// ƴ��sql
					sql += "\t" + filename + "  varchar(10)";
					// �ж��Ƿ�Ϊ��
					if (!b1) {
						sql += "\t NOT NULL, \n";
					}
					// �ж��Ƿ�Ϊ���� ��Ҫһ������ ��Ϊ����������
					if (b2) {
						list.add(filename);
					}
				} else {
					System.out.println("�ֶ��ϲ�����ע��");
				}
			}
			// ��������
			if (list.size() > 0) {
				StringBuilder keys = new StringBuilder();
				for (int k = 0; k < list.size(); k++) {
					keys.append(list.get(k));
					if (k < list.size() - 1)
						keys.append(",");
				}
				sql += ",\n\tPRIMARY KEY " + keys.toString();
			}
			sql += "\n) DEFAULT CHARSET=utf8";
			// ====> ��ӡSQL
			System.out.println("���ɵ�SQL��" + sql);
		} else {
			System.out.println("���棺" + userclass.getName() + "δʹ��@TableSQLע�⣡");
		}

	}

}
