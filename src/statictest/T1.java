package statictest;

public class T1 {
	
	public T1() {
		super();
		System.out.println("������");
	}
	public  static  int  a=5;
	static {
		
		System.out.println(++a);
		
	}
	
    public int c=9;
    {
    	
    	
    	System.out.println(++c);
    }
}
