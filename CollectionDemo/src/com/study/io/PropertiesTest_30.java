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
 * 
 * 
 * 
 * 
 */

public class PropertiesTest_30 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
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
