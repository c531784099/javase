package �̲߳���;

public class Tread1 implements Runnable {
	
//�߳̽�������ִ����� run()������
	@Override
	public void run() {
//		����ԭ�Ӳ���
		synchronized (this){
			
		int a=0;
		while(a<10){
		a+=1;
		System.out.println("==="+a);
		}
		}
	}

}
