package com.study.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * ��ʾ���ͻ��˺ͷ����
 * 1��
 * �ͻ���:�����(telnet)
 * �����:�Զ���
 * 
 * 2��
 * �ͻ��ˣ������
 * ����ˣ�Tomcat������
 * 
 * 3��
 * �ͻ��ˣ��Զ���
 * ����ˣ�Tomcat������
 */


public class WebServer_17 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(10009);
		Socket client = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String line = null;
		while ((line=in.readLine())!=null){
			System.out.println(line);
		}
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		out.println("�ͻ��ˣ����");
		client.close();
		server.close();
		
	}

}
