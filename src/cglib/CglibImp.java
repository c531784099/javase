package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibImp  implements MethodInterceptor{
	private Object target;
	
	public Object getInstance(Object obj){
		this.target=obj;
		
		Enhancer enhancer=new Enhancer();
//		设置父类
		enhancer.setSuperclass(this.target.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//创建代理对象{新生成的对象}
		return enhancer.create();
		
		
		
	}				
	
//回调方法
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		System.out.println("方法之前的行为===");
		
		arg3.invokeSuper(arg0, arg2);
		
		System.out.println("方法之后的行为====");
		
		return null;//这里如果有需要就会返回  方法的结果。
	}

}
