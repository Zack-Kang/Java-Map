package com.study.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * ����
 * �ϴ�ͼƬ
 * 
 * 
 * �ͻ��ˣ�
 * 1������˵�
 * 2����ȡ�ͻ������е�ͼƬ�ļ�
 * 3��ͨ��socket����������ݷ��͸������
 * 4����ȡ����˷�����Ϣ
 * 5���ر�
 * 
 * 
 * ����ˣ�
 * 
 * 
 * 
 * 
 * 
 */
public class UploadPicClient_12 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		if (args.length!=1){
			System.out.println("��ѡ��һ��jpg��ʽͼƬ");
			return;
		}
		
		File file = new File(args[0]);
		if (file.exists()||file.isFile()){
			System.out.println("ͼƬ�����ڻ��߲���һ���ļ�");
			return;
		}
		if (file.getName().endsWith(".jpg")){
			System.out.println("����jpg��ʽ");
			return;
		}
		if (file.length()>1024*1024*8){
			System.out.println("ͼƬ����");
			return;
		}
		
		Socket client = new Socket("127.0.0.1",10007);
		FileInputStream fis = new FileInputStream("D:\\javain.jpg");
		OutputStream out = client.getOutputStream();
		byte[] buff = new byte[1024];
		int len = 0;
		while ((len=fis.read(buff))!=-1){
			out.write(buff, 0, len);
		}
		//���߷����������д��
		client.shutdownOutput();
		InputStream in = client.getInputStream();
		byte[] buffin = new byte[1024];
		int num = in.read(buffin);
		System.out.println(new String(buff,0,num));
		
		fis.close();
		client.close();
	}

}
