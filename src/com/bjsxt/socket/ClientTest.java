package com.bjsxt.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) {
		try {
			Socket s1=new Socket("127.0.0.1", 9999);
			Writer  w1=new OutputStreamWriter(s1.getOutputStream());
			
			w1.write("Hello Word");
			
			w1.flush();
			w1.close();
			s1.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
