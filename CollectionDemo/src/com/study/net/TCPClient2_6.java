package com.study.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ��ʾTCP����Ŀͻ��������˻���
 * ���󣺿ͻ��˸�����˷������ݣ�������յ��󣬸��ͻ��˷�����Ϣ
 * 
 * 
 * �ͻ��ˣ�
 * 1������socket����ָ��Ҫ���ӵ������Ͷ˿�
 * 2����ȡsocket���е��������������д���������У�ͨ�����緢�͸������
 * 3����ȡSocket���е���������������˷��������ݻ�ȡ������ӡ
 * 4���رտͻ�����Դ
 * 
 */



public class TCPClient2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ͻ��˵�Socket����
		Socket client = null;
		try {
			client = new Socket("127.0.0.1", 10002);
			//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е������
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			out.write("����ˣ���ã�".getBytes());
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			System.out.println(new String(buf,0,len));
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
