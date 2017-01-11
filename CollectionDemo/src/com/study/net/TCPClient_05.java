package com.study.net;

import java.io.IOException;
import java.io.OutputStream;
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
 * ����
 * ������˷���һ���ı�����
 * 
 * 
 * ���裺
 * 1������Socket����ָ��Ҫ���������Ͷ˿�
 * 2��
 * 
 * 
 * 
 * ����ˣ�
 * 1����������˵�socket����ServerSocket()
 *    ������һ���˿�
 * 2����ȡ�����ӹ����Ŀͻ��˶���
 *    ͨ��ServerSocket��Accpet������û�����Ӿ͵ȴ��������������������ʽ��
 * 3���ͻ���������������ݣ���ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶��󣬲���ȡ���ÿͻ��˶���Ķ�ȡ������ȡ������������
 *    ����ӡ�ڿ���̨
 * 4���رշ��񣨿�ѡ��
 * 
 * 
 * ����
 * ����˵�������ݣ�����ӡ�ڿ���̨��
 * 
 * 
 */



public class TCPClient_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ͻ��˵�Socket����
		Socket client = null;
		try {
			client = new Socket("127.0.0.1", 10001);
			//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е������
			OutputStream out = client.getOutputStream();
			out.write("tcp client".getBytes());
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
