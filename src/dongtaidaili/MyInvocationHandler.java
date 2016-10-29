package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	public MyInvocationHandler(Object obj){
		
		this.target=obj;
	}
/**1\创建接口
 * 2、目标类实现接口
 * 3、创建自己的MyInvocationHandler  关联被代理的类、处理类、在invoke（）方法的周围添加要添加的功能。
 * 4、在主代码中 通过Proxy类的静态方法newProxyHandler()方法、获得代理类。
 * 5、通过代理类 调用目标中的方法、就会在目标方法的周围添加  在invocationhandler中添加的功能。
 * 
 * 
 * 1、创建接口
 * 2、实现类
 * 3、自己的代理类{添加功能、关联实现类}
 * 4、在主代码中生成代理类、
 * 5、使用代理类调用方法
 * */
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
	
	System.out.println("before method");
	
	arg1.invoke(target, arg2);
	
	System.out.println("after method");
	
	return null;
	}

}
