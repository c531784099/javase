package �̲߳���;

public class Stack {
//	����һ��������
	int a=0;
//	�����ķ���ֵ���̻߳��Ƶ�ǰ��
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
