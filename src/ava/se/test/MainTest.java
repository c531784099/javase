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
	
	System.out.println(t1.getClass().getName());//包名和类名
	Class<?> cls=Class.forName("ava.se.test.Test3");
	System.out.println("*********************************************************************");
	//获得类中的所有的构造器
	Constructor<?> [] cons=cls.getConstructors();
	for (int  i= 0;  i< cons.length; i++) {
		System.out.println(cons[i]);
	}
	//获得指定参数的构造器
	Constructor<?> con1=cls.getConstructor(int.class);
	System.out.println(con1);
	//通过给构造器传参数  创建对象。
	Object obj=con1.newInstance(30);
	System.out.println(obj);
	
	//获得指定类中的所有的方法集合
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println("******************************************************************");
	Class<?> cls1=Class.forName("ava.se.test.Test3");
//	*****
	Method [] method=cls1.getMethods();
	
	for (int i = 0; i < method.length; i++) {
		System.out.println(method[i]);
	}
	//获得指定的方法
	Method me1=cls1.getMethod("run");
	System.out.println(me1);
	//通过反射机制调用方法
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	//这里的newinstance()需要调用 类的无参数构造方法。
	Object obj1=cls1.newInstance();
	//获得方法对象
	Method  me2=cls1.getMethod("say",String.class);
	//通过方法对象 调用方法。
    me2.invoke(obj1,"cheng");		
	
	//获得属性的操作
	System.out.println("0000000000000000000000000000000000000000000000000000000000");
	Class<?> cls2=Class.forName("ava.se.test.Test3");
	Object obj3=cls2.newInstance();
	//Field对象
	Field namefield=cls2.getDeclaredField("name");
	
//	namefield.setAccessible(true);//这里是取消权限控制检查
	//对属性赋值
	namefield.set(obj3, "wang");
	//通过Field对象 获得  属性的值。
	System.out.println(namefield.get(obj3));
	
//反射主要通过四个类来实现、Field、Method、Constructor、Class对象。
	}

}
