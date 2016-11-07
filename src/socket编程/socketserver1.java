package socket编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class socketserver1 {
	/**
	 * 
	 * 这是服务器端 这是单客户服务器端、
	 * 
	 * 启动一次然后就终止了。
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// 创建固定位置的服务套接字
		ServerSocket ss = new ServerSocket(5678);
		// 始终等待客户端的连接
		while (true) {
			Socket s1 = ss.accept();
			// 字符缓冲流
			BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			// 字符输出流
			PrintWriter pw = new PrintWriter(s1.getOutputStream());
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
			System.out.println("数据输出完成。。。。");
//			客户端处理完数据   关闭连接。
			pw.close();

		}
	}

}
