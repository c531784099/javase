package com.sxt.annotation;
@TableSql()
public class User {
	@TableColumnSQL(value="ID",constraint=@Constraint(allowNull=false,isPrimary=true))
	String id;
//	ע���Ĭ��ֵ�������ǿ�
	@TableColumnSQL(value="NAME")
	String name;

}
