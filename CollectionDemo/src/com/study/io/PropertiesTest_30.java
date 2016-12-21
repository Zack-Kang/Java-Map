package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**��
 * Properties��hashMap������
 * Ҳ����˵���߱�map���ϵ��ص㣬����������洢�ļ�ֵ�Զ����ַ���
 * 
 * �Ǽ����к�IO�������ϵļ�������
 * 
 * �ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ�
 * 
 * ��ô�ڼ�������ʱ����Ҫ�����й̶���ʽ����=ֵ
 * 
 * 
 * 
 */

public class PropertiesTest_30 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Test1();
		Test2();
		Test3();
	}
	

	private static void Test3() throws IOException {
		// TODO Auto-generated method stub
		Properties proper = new Properties();
		FileInputStream fis = new FileInputStream("info.txt");
		proper.load(fis);
		sop(proper);
		proper.setProperty("wangwu", "55");
		proper.list(System.out);
		FileOutputStream fos = new FileOutputStream("info.txt");
		proper.store(fos, "haha");
	}
	


	//��ʾ����ν����е����ݴ洢��������
	//��Ҫ��info.txt�еļ�ֵ���ݴ洢�������н��в���
	/*
	 * 1����һ������info.txt�ļ�����
	 * 2����ȡһ�����ݣ�������������"="�����и�
	 * 3��"="�����Ϊ�����ұ���Ϊֵ�����뵽Properties���ϼ���
	 */
	private static void Test2() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("info.txt"));
		Properties proper = new Properties();
		String line = null;
		while((line=br.readLine())!=null){
			
			String[] arr = line.split("=");
			
			proper.setProperty(arr[0], arr[1]);
		}
		br.close();
		sop(proper);
	}


	//���úͻ�ȡԪ��
	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		Properties proper = new Properties();
		proper.setProperty("����", "zhangsan");
		proper.setProperty("����", "lisi");
		sop(proper);
		sop(proper.getProperty("����"));
		proper.setProperty("����", "С����");
		Set<String> names = proper.stringPropertyNames();
		for (String name:names){
			sop(name+" "+proper.getProperty(name));
		}
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
	
	
}

//log4j 
