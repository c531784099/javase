package socket���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class socket2 {

	public static void main(String[] args) throws Exception, IOException {
//		�����ͻ��˷��ʷ������˵��׽���
		Socket  ss=new Socket(InetAddress.getLocalHost(),5678);
//���׽����л�ȡ������
		InputStream  in=ss.getInputStream();
		InputStreamReader  isr=new InputStreamReader(in);
		BufferedReader  br=new BufferedReader(isr);
//�׽����� ��ȡ�����
		OutputStream  os=ss.getOutputStream();
		PrintWriter  pw=new PrintWriter(os);
//		������˻������
		BufferedReader  buff=new BufferedReader(new InputStreamReader(System.in));
		while(true){
//			�����������������
			String  str=buff.readLine();
			pw.println(str);
			pw.flush();
//			����bad ��ֹ�ͻ���  ����end �������ֹ
			if(str.equals("bad")){
				break;	
			}
			System.out.println(br.readLine());
			
	
		}
		
		
		
		
	}

}
