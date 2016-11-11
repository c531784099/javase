package 线程测试;
// 数据的下调
public class Thread2 extends Thread {
	Stack stack;
	public Thread2(Stack stack){
		
		this.stack=stack;
	}
	@Override
	public  void run() {
		for (int i = 0; i < 50; i++) {
//			这里的操作是院子操作
			stack.push();
			Thread.yield();
			try {
//				该线程睡眠1秒钟  等待其他线程获得执行机会
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	

}
