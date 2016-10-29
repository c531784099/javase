package daili.com;
//静态代理类的实现
//代理类和被代理类共同实现同一个接口。装饰器模式和代理模式
public class DLImpl implements Count {
	
	private CountImpl ci;
	
	public DLImpl(CountImpl cmp){
		this.ci=cmp;
	}

	@Override
	public void say() {
	System.out.println("我是代理--say--");
	ci.say();
	System.out.println("我是代理++say++");

	}

	@Override
	public void run() {
		System.out.println("我是代理--run--");
		ci.run();
		System.out.println("我是代理++run++");

	}

}
