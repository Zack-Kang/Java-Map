package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**��
 * ���ڼ�¼Ӧ�ó������еĴ���
 * ���ʹ�ô����ѵ�����ô����ע����ʾ
 * 
 * �����뵽��������
 * ���Ǹü����������ڳ��������ų�������ж����ڴ��д��ڣ��������������������Ÿ�Ӧ�ó�����˳����ü�����Ҳ���ڴ�����ʧ��
 * 
 * �´������������¿�ʼ����������ⲻ��������Ҫ��
 * 
 * ����ʹ�������ü�������ֵҲ���ڣ��´������������ȼ��ظü�������ֵ������1�������´洢����
 * ����Ҫ����һ�������ļ������ڼ�¼�������ʹ�ô���
 * 
 * �������ļ�ʹ�ü�ֵ�Ե���ʽ�����������Ķ�����������
 * 
 * 
 * ��ֵ��������map����
 * 
 * ���������ļ���ʽ�洢��ʹ��io����
 * ��ômap+io -->properties
 * 
 * �����ļ�����ʵ��Ӧ�ó������ݵĹ���
 * 
 */

public class PropertiesTest_31 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
		
	}
	

	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		Properties proper = new Properties();
		File file = new File("count.ini");
		if (!file.exists()){
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream(file);
		proper.load(fis);
		int count = 0;
		String value = proper.getProperty("times");
		if (value!=null){
			count = Integer.parseInt(value);
			if (count>=5){
				sop("���ã�ʹ�ô����ѵ���");
				return;
			}
		}
		count++;
		proper.setProperty("times", count+"");
		FileOutputStream fos = new FileOutputStream(file);
		proper.store(fos, "");
		fis.close();
		fos.close();
		
		
		
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
