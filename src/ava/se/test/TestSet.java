package ava.se.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {
//	泛型就是类型的参数化。
	
	public static void main(String[] args) {
		Set  s1=new HashSet();
		List<String> list=new ArrayList<String>();
		list.add("cheng");
		list.get(0);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(4);
		list2.get(0);
	}

}
