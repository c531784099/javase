package cglib;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ŀ����
		TestCglib  tt=new TestCglib();
//		ʵ��MethodInterceptor  �Ĵ�����
		CglibImp  ci=new CglibImp();
//		���ɵ�����
		TestCglib tc=(TestCglib) ci.getInstance(tt);
//		���������ɵ���ķ�����
		tc.sayHello();

	}

}
