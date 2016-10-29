package cglib;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		目标类
		TestCglib  tt=new TestCglib();
//		实现MethodInterceptor  的代理类
		CglibImp  ci=new CglibImp();
//		生成的新类
		TestCglib tc=(TestCglib) ci.getInstance(tt);
//		调用新生成的类的方法。
		tc.sayHello();

	}

}
