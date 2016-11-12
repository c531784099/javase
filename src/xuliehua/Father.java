package xuliehua;

import java.io.Serializable;

public class Father implements Serializable {
	private String name="cheng";
	private int age1=100;

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
