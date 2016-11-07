package socket编程;

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
//		创建客户端访问服务器端的套接字
		Socket  ss=new Socket(InetAddress.getLocalHost(),5678);
//从套接字中获取输入流
		InputStream  in=ss.getInputStream();
		InputStreamReader  isr=new InputStreamReader(in);
		BufferedReader  br=new BufferedReader(isr);
//套接字中 获取输出流
		OutputStream  os=ss.getOutputStream();
		PrintWriter  pw=new PrintWriter(os);
//		从输入端获得数据
		BufferedReader  buff=new BufferedReader(new InputStreamReader(System.in));
		while(true){
//			获得数据输出到服务端
			String  str=buff.readLine();
			pw.println(str);
			pw.flush();
//			输入bad 终止客户端  输入end 服务端终止
			if(str.equals("bad")){
				break;	
			}
			System.out.println(br.readLine());
			
	
		}
		
		
		
		
	}

}
