package com.sxt.annotation;
@TableSql()
public class User {
	@TableColumnSQL(value="ID",constraint=@Constraint(allowNull=false,isPrimary=true))
	String id;
//	注解的默认值是主键非空
	@TableColumnSQL(value="NAME")
	String name;

}
