package xuliehua;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	static File file=new File("D:/aaa");
	
	
	public  static void run1() throws Exception{
		if(!file.exists()){		
			file=new File("D:/aaa");
		}
		
		File file2=new File(file,"person.txt");
		//		�ļ������
		FileOutputStream fos=new FileOutputStream(file2);
		
		//���������  ����������л�������
		ObjectOutputStream   oos=new ObjectOutputStream(fos);
		
//		������Ҫ���л��Ķ���
		Person p1=new Person();
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
		File file1=new File("D:/aaa/person.txt");
//		�ļ�������
		FileInputStream  fis=new FileInputStream(file1);
//		����������
		ObjectInputStream  ois=new ObjectInputStream(fis);
//		��ȡ����
		Person p1=(Person) ois.readObject();
//		���ö����  ����
		System.out.println(p1.getAddress()+"{  }"+p1.getAge()+"[   ]"+p1.getPname()+"---"+p1.getName()+p1.getAge1());
	    p1.run();
	    System.out.println(p1.getClass());
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
