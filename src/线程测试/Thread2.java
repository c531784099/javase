package �̲߳���;
// ���ݵ��µ�
public class Thread2 extends Thread {
	Stack stack;
	public Thread2(Stack stack){
		
		this.stack=stack;
	}
	@Override
	public  void run() {
		for (int i = 0; i < 50; i++) {
//			����Ĳ�����Ժ�Ӳ���
			stack.push();
			Thread.yield();
			try {
//				���߳�˯��1����  �ȴ������̻߳��ִ�л���
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	

}
