package statictest;

public class T2 extends T1 {
	
	public static int  b=1;
	static {
		
		System.out.println(++b);
	}
	public T2() {
		super();
		System.out.println("=====");
	}
	
	public int d=44;
	{
		
		System.out.println(++d);
	}

}
