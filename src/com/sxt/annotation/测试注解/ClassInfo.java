package com.sxt.annotation.����ע��;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

// target����Զ������Ԫ�ص�Ŀ������
@Target(value={ ElementType.TYPE })
//���� ע����������ڵ�����
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ClassInfo {
//	����ע��Ե�������Ա����
	String type1() default "cheng";//�Ա�������Ĭ��ֵ
	String type2() default "wang";

}
