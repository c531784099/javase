package ava.se.test;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		Map  map1=new HashMap();
//		�������Ҫʹ�� object���еķ�����Ҫ��HashMap����ʹ��super���������á�
//		һ�������ʵ�ֶ���ӿڡ�
// һ���ӿڿ��Ա������ͬ��ʵ����ʵ�֡�
//		java�е��쳣���ƣ����� ���ǿ����쳣ȫ����java�����׳���Ԥ����Ķ�������ͨ���﷨����ȡ��Ȼ����
//		���ǿ����Զ����쳣��Ҫʵ��Ԥ����Ľӿڡ�ͨ��Ԥ����Ľӿ������������Ϣ�������Ͼ������ϲ㴫�ݳ������Ϣ���� ���������ֵ����⡣
		System.out.println("����ֻ���� �ӿ��еķ�����������Object�ķ���");
		HashMap map2=new HashMap();
		System.out.println("�������ʹ��object�еķ���"+map2.clone());
		

	}

}
