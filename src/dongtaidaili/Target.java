package dongtaidaili;

public class Target implements HellonWord ,HelloWord2{

	@Override
	public void sayHellon() {
		System.out.println("我是你最美的风景。。。。");

	}

	@Override
	public void sayHellon(String name) {
		
		System.out.println("hellon"+"<><>"+name);
		
	}

	@Override
	public void run() {
	System.out.println("我是run=====");
		
	}

}
