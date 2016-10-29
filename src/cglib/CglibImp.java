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
//		���ø���
		enhancer.setSuperclass(this.target.getClass());
		//���ûص�����
		enhancer.setCallback(this);
		//�����������{�����ɵĶ���}
		return enhancer.create();
		
		
		
	}				
	
//�ص�����
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		System.out.println("����֮ǰ����Ϊ===");
		
		arg3.invokeSuper(arg0, arg2);
		
		System.out.println("����֮�����Ϊ====");
		
		return null;//�����������Ҫ�ͻ᷵��  �����Ľ����
	}

}
