package �̲߳���;

// ����һ������߳�
public class Thread1 extends Thread {
	Stack stack;
	public Thread1(Stack stack){
	this.stack=stack;	
		
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
//			����Ĳ�����ԭ�Ӳ���
			stack.pop();
//			�ó�cpu ��������г��еȴ�����
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
