package dongtaidaili;

import java.lang.reflect.Proxy;

public class TestProxy {
public static void main(String[] args) {
	Target tar=new Target();
	MyInvocationHandler  myin=new MyInvocationHandler(tar);
//	�����Ƕ���ӿ� ��������ѡ��ʹ�����
//	��һ���ӿڵĴ�����
	HellonWord  proxy=(HellonWord) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), 
			new Class[]{HellonWord.class,HelloWord2.class}, myin);
	//ʵ�ֵڶ����ӿڵĴ�����
	HelloWord2 proxy1=(HelloWord2)Proxy.newProxyInstance(TestProxy.class.getClassLoader(), 
			new Class[]{HellonWord.class,HelloWord2.class}, myin);
//	��һ���ӿڵķ���
	proxy.sayHellon();
	System.out.println("))))))");
	proxy.sayHellon("cheng");
//	�ڶ����ӿڵķ���
	proxy1.run();
	
}
}
