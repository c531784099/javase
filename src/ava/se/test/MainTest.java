package ava.se.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
	Test1 t1=new Test3();
	Test2 tt=(Test2)t1;
	tt.say();
	tt.run();
	tt.eat();
	
	System.out.println(t1.toString()+tt.toString()+"");
	
	System.out.println(t1.getClass().getName());//����������
	Class<?> cls=Class.forName("ava.se.test.Test3");
	System.out.println("*********************************************************************");
	//������е����еĹ�����
	Constructor<?> [] cons=cls.getConstructors();
	for (int  i= 0;  i< cons.length; i++) {
		System.out.println(cons[i]);
	}
	//���ָ�������Ĺ�����
	Constructor<?> con1=cls.getConstructor(int.class);
	System.out.println(con1);
	//ͨ����������������  ��������
	Object obj=con1.newInstance(30);
	System.out.println(obj);
	
	//���ָ�����е����еķ�������
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println("******************************************************************");
	Class<?> cls1=Class.forName("ava.se.test.Test3");
//	*****
	Method [] method=cls1.getMethods();
	
	for (int i = 0; i < method.length; i++) {
		System.out.println(method[i]);
	}
	//���ָ���ķ���
	Method me1=cls1.getMethod("run");
	System.out.println(me1);
	//ͨ��������Ƶ��÷���
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	//�����newinstance()��Ҫ���� ����޲������췽����
	Object obj1=cls1.newInstance();
	//��÷�������
	Method  me2=cls1.getMethod("say",String.class);
	//ͨ���������� ���÷�����
    me2.invoke(obj1,"cheng");		
	
	//������ԵĲ���
	System.out.println("0000000000000000000000000000000000000000000000000000000000");
	Class<?> cls2=Class.forName("ava.se.test.Test3");
	Object obj3=cls2.newInstance();
	//Field����
	Field namefield=cls2.getDeclaredField("name");
	
//	namefield.setAccessible(true);//������ȡ��Ȩ�޿��Ƽ��
	//�����Ը�ֵ
	namefield.set(obj3, "wang");
	//ͨ��Field���� ���  ���Ե�ֵ��
	System.out.println(namefield.get(obj3));
	
//������Ҫͨ���ĸ�����ʵ�֡�Field��Method��Constructor��Class����
	}

}
