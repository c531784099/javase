package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	public MyInvocationHandler(Object obj){
		
		this.target=obj;
	}
/**1\�����ӿ�
 * 2��Ŀ����ʵ�ֽӿ�
 * 3�������Լ���MyInvocationHandler  ������������ࡢ�����ࡢ��invoke������������Χ���Ҫ��ӵĹ��ܡ�
 * 4������������ ͨ��Proxy��ľ�̬����newProxyHandler()��������ô����ࡣ
 * 5��ͨ�������� ����Ŀ���еķ������ͻ���Ŀ�귽������Χ���  ��invocationhandler����ӵĹ��ܡ�
 * 
 * 
 * 1�������ӿ�
 * 2��ʵ����
 * 3���Լ��Ĵ�����{��ӹ��ܡ�����ʵ����}
 * 4���������������ɴ����ࡢ
 * 5��ʹ�ô�������÷���
 * */
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
	
	System.out.println("before method");
	
	arg1.invoke(target, arg2);
	
	System.out.println("after method");
	
	return null;
	}

}
