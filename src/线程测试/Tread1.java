package 线程测试;

public class Tread1 implements Runnable {
	
//线程结束就是执行完毕 run()方法。
	@Override
	public void run() {
//		这是原子操作
		synchronized (this){
			
		int a=0;
		while(a<10){
		a+=1;
		System.out.println("==="+a);
		}
		}
	}

}
