package com.sxt.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
//这是运行时注解的使用、还有一种编译时注解
public class AnnMain {
	public static void main(String[] args) {
		// 获得Class对象
		Class userclass = User.class;
		// Class userclass1=Class.forName("注解.User");
		// 获得类所有的注解
		Annotation[] annotations = userclass.getAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			System.out.println("注解" + (i + 1) + annotations[i].toString());
		}
		// 根据需要检查是否有TableSql注解
		if (userclass.isAnnotationPresent(TableSql.class)) {
			String sql = "\n creat table   ";
			// 获得指定的注解
			TableSql ts = (TableSql) userclass.getAnnotation(TableSql.class);
			// 获得注解中的值
			String tablename = ts.value();
			// 判断注解是否 设置成员变量的值
			if ("".equals(tablename)) {
				// 如果没有设置 就使用类名作为表名
				tablename = userclass.getSimpleName().toLowerCase();
			}
			// 输出类名和表名的对应关系
			System.out.println("[ ]" + userclass.getName() + "===" + tablename);
			sql += tablename + "(\n   ";
			// 从user类中获得 所有非继承字段
			Field[] fields = userclass.getDeclaredFields();
			// 创建一个主键集合\联合主键
			ArrayList<String> list = new ArrayList<String>();
			// 判断字段上的注解
			for (int i = 0; i < fields.length; i++) {
				Field ff = fields[i];
				if (ff.isAnnotationPresent(TableColumnSQL.class)) {
					TableColumnSQL tcs = ff.getAnnotation(TableColumnSQL.class);
					// 获得注解值
					String filename = tcs.value();
					// 获得约束
					Constraint cons = tcs.constraint();
					// 获得约束的值
					boolean b1 = cons.allowNull();
					boolean b2 = cons.isPrimary();
					// 拼接sql
					sql += "\t" + filename + "  varchar(10)";
					// 判断是否为空
					if (!b1) {
						sql += "\t NOT NULL, \n";
					}
					// 判断是否为主键 需要一个集合 因为有联合主键
					if (b2) {
						list.add(filename);
					}
				} else {
					System.out.println("字段上不存在注解");
				}
			}
			// 设置主键
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
			// ====> 打印SQL
			System.out.println("生成的SQL：" + sql);
		} else {
			System.out.println("警告：" + userclass.getName() + "未使用@TableSQL注解！");
		}

	}

}
