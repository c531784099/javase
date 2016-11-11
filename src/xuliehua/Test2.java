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
		//		文件输出流
		FileOutputStream fos=new FileOutputStream(file2);
		
		//对象输出流  用来输出序列化的数据
		ObjectOutputStream   oos=new ObjectOutputStream(fos);
		
//		创建需要序列化的对象
		Person2 p1=new Person2();
		p1.setAddress("zhonguo");
		p1.setAge(32);
		p1.setPname("chengxiangfeng");
		
		oos.writeObject(p1);
		
		oos.flush();
		fos.close();
		System.out.println("序列化成功");
		
	}
	
//	反序列化对象
	
	public static void  run2() throws IOException, Exception{
//		读取文件
		File file1=new File("D:/aaa/person2.txt");
//		文件输入流
		FileInputStream  fis=new FileInputStream(file1);
//		对象输入流
		ObjectInputStream  ois=new ObjectInputStream(fis);
//		获取对象
		Person2 p1=(Person2) ois.readObject();
		System.out.println(p1.getAddress()+"{  }"+p1.getAge()+"[   ]"+p1.getPname()+"---");
	    p1.run();
	}
	
	public static void main(String[] args) throws Exception {
		
//		序列化对象
		run1();
//		线程等待
		System.out.println("开始反序列化。。。。。。。");
		Thread.sleep(3000);
//		反序列化对象
		run2();
		

	}

}
