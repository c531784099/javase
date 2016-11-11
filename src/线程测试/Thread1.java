package 线程测试;

// 这是一个添加线程
public class Thread1 extends Thread {
	Stack stack;
	public Thread1(Stack stack){
	this.stack=stack;	
		
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
//			这里的操作是原子操作
			stack.pop();
//			让出cpu 进入可运行池中等待调度
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
