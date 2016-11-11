package 数组集合测试;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		一维数组
		String [] str=new String[10];
		//初始化方式一
		String [] sst=new String[]{"cheng","xiang","feng"};
//		初始化方式二
		String [] sst2={"feng","huo","tian","xia"};
//		初始化方式三
		str[3]="cheng";
		
		
//		输出信息
		for (int i = 0; i < str.length; i++) {
			System.out.println(i+"==="+str[i]);
		}
//*********************************************************************************************************		
		
//		二维数组
		String [][] str3=new String[3][4];
		str3[0]=new String[]{"wang",""};
		
//		str3[0][2]="cheng";
		
		
		
		String [][] str2={{"cheng","wang"},{"ddddddd","dd","dfsfsfsfs"},{"ewew","llll"}};
		System.out.println(str2.length);
//		输出
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
//			类型转换  字符型转换为整型
			System.out.print((int)char1[i]+"_");
			
		}
		System.out.println();
//		将整数转化为字符型
		int  a=120;
		int b=121;
		int v=122;
		System.out.println((char)a+"_"+(char)b+"_"+(char)v);
//*********************************************************************************************************	
//		将字节数组转化为 字符串   共33个非打印字符属于控制字符包括127 字符{delete}
		byte[] byte_1={100,5,56,78,127,-1}; //单字节类型 0-127  超出范围就会显示 ？ 不识别标志
		String gni=new String(byte_1);
		System.out.println(gni);
//*********************************************************************************************************	
//		十六进制书写方式。底层就是十六进制翻译后的二进制数。
		byte[] b1={(byte)0xae,(byte)0xaf};
		
		System.out.println(b1[0]);
//		unicode是一种规范、utf-8是一种unicode的实现。存储方式的实现。
		
//*********************************************************************************************************	
		List list=new ArrayList();
		String s="wang";
		list.add(s);
//*********************************************************************************************************	
		String [] tt=new String[10];
		
		tt[0]="cheng";
		tt[1]="wang";
//		只能是相同类型的数据
//		tt[2]=34;
		
		
		
//*********************************************************************************************************	
		LinkedList  list1=new LinkedList();//stack的 替代类
//		这是堆栈、先进后出
		list1.push("cheng");
		list1.push("xiang");
		list1.push("feng");
		System.out.println(list1.pop());
		System.out.println(list1.pop());
		System.out.println(list1.pop());
		
		
		
//*********************************************************************************************************	
	
		
	}

}
