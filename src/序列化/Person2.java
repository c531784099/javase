package ���л�;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Person2 implements Externalizable {
//	���л��İ汾����
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
		
		System.out.println("����person��=====");
	}
//ָ�����л�ϸ�� ע����У����л��ֶεĵ�˳��  �����л�ִ�еķ���
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(getAddress());
	out.writeObject(getPname());
	System.out.println(getAge());
	
}
//����ͨ�����췽���Ժ��Ե����л��ֶ�  ���и�ֵ 
public Person2() {
	super();
	this.age=100;
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	setAddress((String)in.readObject());
	setPname((String)in.readObject());
//��ȡ����
	System.out.println(getAge());
	
}   

}
