package com.study.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP����
 * Socket��ServerSocket
 * �����ͻ��˺ͷ����
 * �������Ӻ�ͨ��Socket�е�IO���������ݵĴ���
 * �ر�Socket
 * ͬ���ͻ��˺ͷ����������������Ӧ�ó���
 * 
 * 
 * ��ʾTCP����
 * 1��TCP�ֿͻ��˺ͷ����
 * 2���ͻ��˶�Ӧ�Ķ�����Socket
 *    ����˶�Ӧ�Ķ�����ServerSocket
 *    
 * 
 * 
 * 
 * �ͻ��ˣ�
 * ͨ������Socket�������ڸö�����ʱ�Ϳ�������ָ������
 * ��ΪTCP���������ӵģ������ڽ���Socket����ʱ����Ҫ�з���˴��ڣ������ӳɹ����γ�ͨ·���ڸ�ͨ���������ݴ���
 * 
 * 
 * 
 *
 * 
 * 
 */



public class TCPServer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//��������˵�Socket���񣬲�����һ���˿�
			ServerSocket server = new ServerSocket(10001);
			//ͨ��Accept������ȡ���ӹ����Ŀͻ��˶���
			Socket client = server.accept();
			System.out.println(client.getInetAddress().getHostAddress()+" connected");
			//��ȡ�ͻ��˷����������ݣ���ôҪʹ�ÿͻ��˶���Ķ�ȡ������ȡ����
			InputStream in = client.getInputStream();
			byte[] buff = new byte[1024];
			int len = in.read(buff);
			System.out.println(new String(buff,0,len));
			//�رտͻ���
			client.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
