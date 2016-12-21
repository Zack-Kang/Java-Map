package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

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
 * ��������
 * SequenceInputStream��
 * ��ʾ�������������߼����������������������򼯺Ͽ�ʼ�����ӵ�һ����������ʼ��ȡ��ֱ�������ļ�ĩβ��
 * �ڶ�����������ȡ���Դ����ƣ�ָ��������������һ�����������ļ�ĩβ
 * ���캯����
 * 1��SequenceInputStream(InputStream is1,InputStream is2);
 * 
 * 
 * 
 * 
 */

public class SequenceInputStreamTest_33 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
	}
	

	


	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		Vector<FileInputStream> v = new Vector<>();
		v.add(new FileInputStream("a.txt"));
		v.add(new FileInputStream("info.txt"));
		v.add(new FileInputStream("javafile.txt"));
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		FileOutputStream fout = new FileOutputStream("collect.txt");
		
		byte[] buff = new byte[1024];
		int len = 0;
		while((len=sis.read(buff))!=-1){
			fout.write(buff,0,len);
			sop(len);
		}
		fout.close();
		sis.close();
		
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
