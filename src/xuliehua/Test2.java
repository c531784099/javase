package xuliehua;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
	static File file=new File("D:/aaa");
	
	
	public  static void run1() throws Exception{
		if(!file.exists()){		
			file=new File("D:/aaa");
		}
		
		File file2=new File(file,"person2.txt");
		//		�ļ������
		FileOutputStream fos=new FileOutputStream(file2);
		
		//���������  ����������л�������
		ObjectOutputStream   oos=new ObjectOutputStream(fos);
		
//		������Ҫ���л��Ķ���
		Person2 p1=new Person2();
		p1.setAddress("zhonguo");
		p1.setAge(32);
		p1.setPname("chengxiangfeng");
		
		oos.writeObject(p1);
		
		oos.flush();
		fos.close();
		System.out.println("���л��ɹ�");
		
	}
	
//	�����л�����
	
	public static void  run2() throws IOException, Exception{
//		��ȡ�ļ�
		File file1=new File("D:/aaa/person2.txt");
//		�ļ�������
		FileInputStream  fis=new FileInputStream(file1);
//		����������
		ObjectInputStream  ois=new ObjectInputStream(fis);
//		��ȡ����
		Person2 p1=(Person2) ois.readObject();
		System.out.println(p1.getAddress()+"{  }"+p1.getAge()+"[   ]"+p1.getPname()+"---");
	    p1.run();
	}
	
	public static void main(String[] args) throws Exception {
		
//		���л�����
		run1();
//		�̵߳ȴ�
		System.out.println("��ʼ�����л���������������");
		Thread.sleep(3000);
//		�����л�����
		run2();
		

	}

}
