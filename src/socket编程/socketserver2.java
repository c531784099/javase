package socket���;

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
	 * ���̵߳�����
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// �����̶�λ�õķ����׽���
		ServerSocket ss = new ServerSocket(5678);
		// ʼ�յȴ��ͻ��˵�����
		while (true) {
//			���һ���׽��ֶ���
			Socket s1 = ss.accept();
//			����һ���߳�  
			socketserver2  ss2=new socketserver2(s1);
//			����   �������µ��߳�ջ �߳�ջ�ĵ�һ��������run����ջ
			ss2.start();

		}
	}

	@Override
	public void run() {
	
		// �ַ�������
		BufferedReader br;
		PrintWriter pw ;
		try {
			br = new BufferedReader(new InputStreamReader(sst.getInputStream()));
			// �ַ������
		    pw = new PrintWriter(sst.getOutputStream());
			// ѭ��ʼ�յȴ��ͻ��˵����ݡ�ֱ����ֹ��ʶ��
			while (true) {
				String str = br.readLine();
				System.out.println(str);
				// �����Ӧ��Ϣ���ͻ���
				pw.println("has recive...");
				pw.flush();
				if (str.equals("end")) {
					break;
				}
			}
			System.out.println(Thread.currentThread()+"���������ɡ�������");
//			�ͻ��˴���������   �ر����ӡ�
			pw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			
			
			
			
		}
		
		
	}

}
