package Logger1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// ����ʹ��  slf4j  ���ܿ��
public class Test1 {
	final static Logger logger1 = LoggerFactory.getLogger(Test1.class);
	
	public static void main(String[] args) {
		int a=34;
//		��־����  �ɵ͵���  debug--info--warn--error 
		
		logger1.debug("good");		
		logger1.info("info====");
		logger1.error("cuowu");
		logger1.warn("goood");
		
		

	}

}
