package �̲߳���;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Logger1.Test1;

public class TestThread {
	final static Logger logger1 = LoggerFactory.getLogger(TestThread.class);
	public static void main(String[] args) {
		logger1.debug("����һ���߳�");
		Stack stack=new Stack();
		Thread1 t1=new Thread1(stack);
		Thread2 t2=new Thread2(stack);
//		�����߳�
		
		t1.start();
		t2.start();

	}

}
