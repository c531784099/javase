package 序列化;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Person2 implements Externalizable {
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
	
	public  void run(){
		
		System.out.println("我是person类=====");
	}
//指定序列化细节 注意点有：序列化字段的的顺序  、序列化执行的方法
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(getAddress());
	out.writeObject(getPname());
	System.out.println(getAge());
	
}
//这里通过构造方法对忽略的序列化字段  进行赋值 
public Person2() {
	super();
	this.age=100;
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	setAddress((String)in.readObject());
	setPname((String)in.readObject());
//获取不到
	System.out.println(getAge());
	
}   

}
