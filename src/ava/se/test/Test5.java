package ava.se.test;

public abstract class Test5 {
	public String ss;
	public Test5(String ss) {
		super();
		this.ss = ss;
	}
	public Test5() {
		super();
		System.out.println("----");
	}
	public  void  tt(){
		System.out.println("=====1"+ss);
		
	} 
    public abstract void kk();
}
