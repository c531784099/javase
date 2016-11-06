package ava.se.test;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		Map  map1=new HashMap();
//		这里如果要使用 object类中的方法需要在HashMap类中使用super方法来调用。
//		一个类可以实现多个接口、
// 一个接口可以被多个不同的实现类实现。
//		java中的异常机制：首先 我们看到异常全部是java主动抛出的预定义的对象。我们通过语法来获取、然后处理。
//		我们可以自定义异常需要实现预定义的接口、通过预定义的接口来处理程序信息、基本上就是向上层传递程序的消息或者 处理程序出现的问题。
		System.out.println("这里只含有 接口中的方法、不含有Object的方法");
		HashMap map2=new HashMap();
		System.out.println("这里可以使用object中的方法"+map2.clone());
		

	}

}
