package ���鼯�ϲ���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		һά����
		String [] str=new String[10];
		//��ʼ����ʽһ
		String [] sst=new String[]{"cheng","xiang","feng"};
//		��ʼ����ʽ��
		String [] sst2={"feng","huo","tian","xia"};
//		��ʼ����ʽ��
		str[3]="cheng";
		
		
//		�����Ϣ
		for (int i = 0; i < str.length; i++) {
			System.out.println(i+"==="+str[i]);
		}
//*********************************************************************************************************		
		
//		��ά����
		String [][] str3=new String[3][4];
		str3[0]=new String[]{"wang",""};
		
//		str3[0][2]="cheng";
		
		
		
		String [][] str2={{"cheng","wang"},{"ddddddd","dd","dfsfsfsfs"},{"ewew","llll"}};
		System.out.println(str2.length);
//		���
		for (int i = 0; i < str3.length; i++) {
//			
			System.out.println("***********"+i+"*******************");
			for (int j = 0; j < str3[i].length; j++) {
				System.out.println("***"+str3[i][j]);
			}			
			System.out.println("************"+i+"******************");
		}
		
//*********************************************************************************************************		
		
		String ss="chengxiangfeng";
		char[] char1=ss.toCharArray();
		for (int i = 0; i < char1.length; i++) {
			System.out.print(char1[i]+"_");
			
		}
		System.out.println();
		for (int i = 0; i < char1.length; i++) {
//			����ת��  �ַ���ת��Ϊ����
			System.out.print((int)char1[i]+"_");
			
		}
		System.out.println();
//		������ת��Ϊ�ַ���
		int  a=120;
		int b=121;
		int v=122;
		System.out.println((char)a+"_"+(char)b+"_"+(char)v);
//*********************************************************************************************************	
//		���ֽ�����ת��Ϊ �ַ���   ��33���Ǵ�ӡ�ַ����ڿ����ַ�����127 �ַ�{delete}
		byte[] byte_1={100,5,56,78,127,-1}; //���ֽ����� 0-127  ������Χ�ͻ���ʾ �� ��ʶ���־
		String gni=new String(byte_1);
		System.out.println(gni);
//*********************************************************************************************************	
//		ʮ��������д��ʽ���ײ����ʮ�����Ʒ����Ķ���������
		byte[] b1={(byte)0xae,(byte)0xaf};
		
		System.out.println(b1[0]);
//		unicode��һ�ֹ淶��utf-8��һ��unicode��ʵ�֡��洢��ʽ��ʵ�֡�
		
//*********************************************************************************************************	
		List list=new ArrayList();
		String s="wang";
		list.add(s);
//*********************************************************************************************************	
		String [] tt=new String[10];
		
		tt[0]="cheng";
		tt[1]="wang";
//		ֻ������ͬ���͵�����
//		tt[2]=34;
		
		
		
//*********************************************************************************************************	
		LinkedList  list1=new LinkedList();//stack�� �����
//		���Ƕ�ջ���Ƚ����
		list1.push("cheng");
		list1.push("xiang");
		list1.push("feng");
		System.out.println(list1.pop());
		System.out.println(list1.pop());
		System.out.println(list1.pop());
		
		
		
//*********************************************************************************************************	
	
		
	}

}
