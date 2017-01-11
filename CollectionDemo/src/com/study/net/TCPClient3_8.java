package com.study.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ���󣺽���һ���ı�ת��������
 * �ͻ��˸�����˷����ı�������˻Ὣ�ı�ת���ɴ�д���ٷ��ظ��ͻ��ˣ�
 * ���ҿͻ��˿��Բ��ϵĽ����ı�ת�������ͻ�������overʱ��ת������
 * 
 * ������
 * �ͻ��ˣ�
 * ��Ȼ�ǲ����豸�ϵ����ݣ���ô�Ϳ���ʹ��io������������io�Ĳ���������˼��
 * Դ������¼��
 * Ŀ�ģ������豸�����������
 * ���Ҳ��������ı�����,����ѡ���ַ���
 * 
 * 
 * ���裺
 * 1����������
 * 2����ȡ����¼��
 * 3�������ݷ��������
 * 4����ȡ����˷��صĴ�д����
 * 5������������Դ
 * 
 * 
 * �����ı����ݿ���ʹ���ַ������в�����ͬʱ���Ч�ʼ��뻺��
 * 
 * 
 * 
 * �����ӳ��ֵ�����
 * ���󣺿ͻ��˺ͷ���˶���Ī���ĵȴ�
 * Ϊʲô�أ�
 * ��Ϊ�ͻ��˺ͷ���˶���������������Щ����û�ж���������ǣ���ô��һֱ��
 * ���������˶��ڵȴ�
 * 
 */



public class TCPClient3_8 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		TransClient();
	}

	private static void TransClient() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client = new Socket("127.0.0.1", 10003);
		//�������������
		//�����ȡ���̵�������
		BufferedReader sendbr = new BufferedReader(new InputStreamReader(System.in));
		//����Ŀ�ģ�������д�뵽socket����������͸�������
		BufferedWriter sendbw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		//�������������
		//����һ��socket��ȡ������ȡ���������صĴ�д��Ϣ
		BufferedReader recvbr = new BufferedReader(new InputStreamReader(client.getInputStream()));
		//PrintWriter out = new PrintWriter(client.getOutputStream());
		
		String line = null;
		while ((line=sendbr.readLine())!=null){
			sendbw.write(line);
			sendbw.newLine();  //��Ҫ   ��ֹ�޷��յ�����
			sendbw.flush();   //��Ҫ
			//out.println(line);
			if ("over".equals(line)) break;
			String readLine = recvbr.readLine();
			System.out.println("recv:"+readLine);
		}
		recvbr.close();
		sendbr.close();
		sendbw.close();
		client.close();
		System.out.println("client closed");
		
	}

}
