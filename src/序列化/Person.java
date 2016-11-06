package 序列化;

import java.io.Serializable;

public class Person implements Serializable {
//	序列化的版本控制
	private static final long serserialVersionUID = -682707297088912201L; 
	
	private String pname;
	private String address;
	private transient int age;
	public Person() {
		super();
		this.age=500;
	}
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

}
