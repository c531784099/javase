package 序列化;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Person1 implements Serializable {
//	序列化的版本控制
	private static final long serserialVersionUID = -682707297088912201L; 
	
	private String pname;
	private String address;
	private transient int age;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void run(){
		
		System.out.println("我是person类=====");
	}
//	序列化时会执行该方法、通过该方法序列化指定的数据。
	 private void writeObject(ObjectOutputStream out) throws IOException{  
	        HashMap<String, String> map = new HashMap<String, String>();  
	        map.put("ll", "小明");  
	        out.writeObject(map);  
	    }  
//	 反向序列化时会调用该方法。
	 private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{  
	        HashMap<String, String> map = (HashMap<String, String>) in.readObject();  
	        System.out.println(map.get("ll"));  
	       
	    }
	public Person1() {
		super();
		this.age=300;
	}   

}
