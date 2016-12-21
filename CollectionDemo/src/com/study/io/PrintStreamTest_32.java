package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**��
 * ��ӡ��
 * PrintWriter��PrintStream
 * ����ֱ�Ӳ�����������ļ�
 * 
 * ������
 * SequenceInputStream
 * �Զ�������кϲ�
 * 
 * ��������
 * ObjectInputStream��ObjectOutputStream
 * �������Ķ�����Ҫʵ��Serializable(��ǽӿ�)
 * 
 * 
 * 
 * ��ӡ������
 * ���������һ����ӡ���������Խ������������͵����ݶ�ԭ����ӡ
 * 
 * �ֽڴ�ӡ��
 * PrintStream:
 * ���캯�����Խ��ܵĲ������ͣ�
 * 1��File����,File
 * 2���ַ���·����String
 * 3���ֽ������ OutputStream
 * 
 * �ַ���ӡ��
 * PrintWriter��
 * ���캯�����Խ��ܵĲ������ͣ�
 * 1��File����,File
 * 2���ַ���·����String
 * 3���ֽ������ OutputStream
 * 4���ַ������
 * 
 * 
 * 
 */

public class PrintStreamTest_32 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Test1();
		Test2();
	}
	

	private static void Test2() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter("a.txt");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("a.txt")),true);  //println(),printf,format�����Զ�ˢ�»�����
		String line = null;
		while( (line=br.readLine())!=null){
			if ("over".equals(line)){
				break;
			}
			out.println(line);
			//out.write(line.toUpperCase());
			//out.flush();
		}
		out.close();
		br.close();
	}


	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(System.out);
		PrintWriter out = new PrintWriter(System.out,true);  //println(),printf,format�����Զ�ˢ�»�����
		String line = null;
		while( (line=br.readLine())!=null){
			if ("over".equals(line)){
				break;
			}
			out.println(line);
			//out.write(line.toUpperCase());
			//out.flush();
		}
		out.close();
		br.close();
		
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
	
	
}
/*
 * dom for java
 * 
 * dom4j
 * <Persions>
 * 		<Persion id = "111">
 * 			<name>name</name>
 * 			<age>12</age>
 * 		</Persion>
 * </Persions>
 */
//log4j 
