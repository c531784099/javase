package com.sxt.annotation.测试注解;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

// target是针对多个程序元素的目标设置
@Target(value={ ElementType.TYPE })
//这里 注解的生命周期的设置
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ClassInfo {
//	定义注解对的两个成员变量
	String type1() default "cheng";//对变量设置默认值
	String type2() default "wang";

}
