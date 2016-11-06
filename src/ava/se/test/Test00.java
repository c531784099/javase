package ava.se.test;

public class Test00 {

	public static void main(String[] args) {
//		抽象类  继承了 object类
//		抽象类可以继承实体类、
//		抽象类可以没有抽象方法、但不能实例化。
//		可以有构造器、子类可以调用抽象类定义的不同的构造器。
		Test5_1  t1=new Test5_1("cheng");
		t1.kk();
		t1.tt();
		t1.getClass();

	}

}
