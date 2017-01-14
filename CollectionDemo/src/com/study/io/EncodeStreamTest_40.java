package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

/**
 * 
 * �ַ�����
 * �ַ����ĳ�����Ϊ�˷�������ַ�
 * ����Ҫ���Ǽ����˱���ת��
 * ͨ������ת���������   
 *    InputStreamWriter
 *    OutputStreamReader
 * �����������ڽ��й����ʱ����Լ����ַ���
 * 
 * �����������
 * �����ֻ��ʶ����������ݣ����������ǵ��ź�
 * Ϊ�˷���Ӧ�ü��������������ʶ��������ҵ�����
 * �ͽ��������ҵ���������������ʾ����һһ��Ӧ���γ�һ�ű�
 * ����Ǳ����
 * 
 * 
 * �����ı������
 * ASCII:������׼��Ϣ������
 *    ��һ���ֽڵ�7λ���Ա�ʾ
 * ISO8859-1:������� �� ŷ�����
 *    ��һ���ֽڵ�8λ��ʾ
 * GB2312:�й������ı����
 * GBK:�й������ı�����������ں��˸�����������ַ���
 * Unicode:���ʱ�׼���ں��˶�������
 *    ���е����ֶ��������ֽ�����ʾ��java����ʹ�õľ���unicode
 * UTF-8:����������ֽ�����ʾһ���ַ�
 * 
 */


public class EncodeStreamTest_40 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeText();
		readText();
	}
	
	private static void readText() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf8.txt"),"gbk");
		char[] buff = new char[10];
		int len = isr.read(buff);
		sop(new String(buff,0,len));
		isr.close();
	}

	private static void writeText() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"),"utf-8");
		osw.write("���");
		osw.close();
	}

	
	
	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}