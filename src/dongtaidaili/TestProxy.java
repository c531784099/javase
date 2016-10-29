package dongtaidaili;

import java.lang.reflect.Proxy;

public class TestProxy {
public static void main(String[] args) {
	Target tar=new Target();
	MyInvocationHandler  myin=new MyInvocationHandler(tar);
//	可以是多个接口 根据需求选择使用情况
//	第一个接口的代理类
	HellonWord  proxy=(HellonWord) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), 
			new Class[]{HellonWord.class,HelloWord2.class}, myin);
	//实现第二个接口的代理类
	HelloWord2 proxy1=(HelloWord2)Proxy.newProxyInstance(TestProxy.class.getClassLoader(), 
			new Class[]{HellonWord.class,HelloWord2.class}, myin);
//	第一个接口的方法
	proxy.sayHellon();
	System.out.println("))))))");
	proxy.sayHellon("cheng");
//	第二个接口的方法
	proxy1.run();
	
}
}
