package socket���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class socketserver {
/**
 * 
 * ���Ƿ�������
 * ���ǵ��ͻ��������ˡ�
 * 
 * ����һ��Ȼ�����ֹ�ˡ�
 * 
 * 
 * */
	public static void main(String[] args) throws Exception {
		ServerSocket  ss=new ServerSocket(5678);
		Socket s1=ss.accept();
//		�ַ�������
		BufferedReader  br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
//		�ַ������
		PrintWriter  pw=new PrintWriter(s1.getOutputStream());
//		ѭ��ʼ�յȴ��ͻ��˵����ݡ�ֱ����ֹ��ʶ��
		while(true){
			String str=br.readLine();
			System.out.println(str);
//			�����Ӧ��Ϣ���ͻ���
			pw.println("has recive...");
			pw.flush();
			if(str.equals("end")){
				
				break;
			}
	
		}
		
		pw.close();

	}

}
