package com.study.io;

import java.io.*;

/**
 * ��ȡ����¼��
 * System.out:��Ӧ��׼������豸������̨
 * System.in:��Ӧ��׼�������豸������
 * 
 * ����ͨ������¼�����ݣ���¼��һ�����ݺ�ͽ��������ݽ��д�ӡ
 * ���¼���������over,��ôֹͣ¼��
 * 
 * ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��
 * Ҳ����readLine����
 * 
 * �ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�
 * readLine������BufferedReader���еķ���
 * ������¼���read�������ֽ���InputStream�ķ���
 * ��ô�ܲ��ܽ��ֽ���ת�����ַ�������ʹ���ַ���������readLine����
 */

public class WriterOut_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test1();
		//Test2();
		//Test3();
		Test4();
	}
	
	private static void Test4() {
		// TODO Auto-generated method stub
		//��ȡ����¼�����
		InputStream in = System.in;
		//���ֽ�������ת�����ַ�������ʹ��ת������InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);
		//���ַ��������ַ���������
		BufferedReader br = new BufferedReader(isr);
		String str;
		try {
			while((str = br.readLine())!=null){
				if ("over".equals(str)){
					break;
				}
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void Test3() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = 0;
			StringBuilder sb = new StringBuilder();
			while(true){
				int ch = in.read();
				if (ch=='\r'){
					continue;
				}
				if (ch=='\n'){
					String str = sb.toString();
					if ("over".equals(str)){
						break;
					}
					System.out.println(str.toUpperCase());
					sb.delete(0, sb.length());
				}
				sb.append((char)ch);
				//System.out.println(by1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test2() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = 0;
			while((by1=in.read())!=-1){
				System.out.println(by1);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test1() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = in.read();
			int by2 = in.read();
			int by3 = in.read();
			System.out.println(by1);
			System.out.println(by2);
			System.out.println(by3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
