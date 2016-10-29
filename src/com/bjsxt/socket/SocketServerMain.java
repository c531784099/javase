package com.bjsxt.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(9999);
			Socket s1=ss.accept();
			Reader reader=new InputStreamReader(s1.getInputStream());
			char[] chars=new char[64];
			
			int len=0;
			
			StringBuilder  sb=new StringBuilder();
			while((len=reader.read(chars))!=-1){
				sb.append(new String(chars,0,len));
				
				
			}
			
			System.out.println(sb);
			
			reader.close();
			s1.close();
			ss.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	

	}

}
