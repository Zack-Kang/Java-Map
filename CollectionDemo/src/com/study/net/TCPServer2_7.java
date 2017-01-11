package com.study.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * 
 *
 * 
 * 
 */



public class TCPServer2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//��������˵�Socket���񣬲�����һ���˿�
			ServerSocket server = new ServerSocket(10002);
			//ͨ��Accept������ȡ���ӹ����Ŀͻ��˶���
			Socket client = server.accept();
			System.out.println(client.getInetAddress().getHostAddress()+" connected");
			//��ȡ�ͻ��˷����������ݣ���ôҪʹ�ÿͻ��˶���Ķ�ȡ������ȡ����
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			byte[] buff = new byte[1024];
			int len = in.read(buff);
			System.out.println(new String(buff,0,len));
			out.write("�ͻ��ˣ���ã�".getBytes());
			//�رտͻ���
			client.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
