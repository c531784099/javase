package socket编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class socketserver2 extends Thread{
	Socket sst;
	
	public socketserver2(Socket sst) {
		super();
		this.sst = sst;
	}

	/**
	 * 
	 * 
	 * 
	 * 多线程的启动
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// 创建固定位置的服务套接字
		ServerSocket ss = new ServerSocket(5678);
		// 始终等待客户端的连接
		while (true) {
//			获得一个套接字对象
			Socket s1 = ss.accept();
//			启动一个线程  
			socketserver2  ss2=new socketserver2(s1);
//			启动   开启了新的线程栈 线程栈的第一个方法是run方法栈
			ss2.start();

		}
	}

	@Override
	public void run() {
	
		// 字符缓冲流
		BufferedReader br;
		PrintWriter pw ;
		try {
			br = new BufferedReader(new InputStreamReader(sst.getInputStream()));
			// 字符输出流
		    pw = new PrintWriter(sst.getOutputStream());
			// 循环始终等待客户端的数据、直到终止标识符
			while (true) {
				String str = br.readLine();
				System.out.println(str);
				// 输出响应信息到客户端
				pw.println("has recive...");
				pw.flush();
				if (str.equals("end")) {
					break;
				}
			}
			System.out.println(Thread.currentThread()+"数据输出完成。。。。");
//			客户端处理完数据   关闭连接。
			pw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			
			
			
			
		}
		
		
	}

}
