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
 * �����ı����
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
	}
	
	private static void writeText() {
		// TODO Auto-generated method stub
		
	}

	public static void ByteArrayStream() throws FileNotFoundException, IOException{
		//����Դ
		ByteArrayInputStream bis = new ByteArrayInputStream("abcdefg".getBytes());
		//����Ŀ��
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		sop(bos.size());
		
		int by = 0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		
		sop(bos.size());
		sop(bos.toString());
		
		bos.writeTo(new FileOutputStream("ByteArrayOutput.txt"));
	}
	
	
	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
