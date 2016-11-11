package 线程测试;

public class Stack {
//	这是一个数据类
	int a=0;
//	方法的返回值在线程机制的前面
	public synchronized void pop(){
		int i=0;
		while(i<10){
		++a;
		i++;
		System.out.println(Thread.currentThread()+"pop"+a);
		}
	}
	
	
	public synchronized void push(){
		int i=0;
		while(i<20){		
		--a;
		i++;
		System.out.println(Thread.currentThread()+"push"+a);
		}
	}

}
