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
 * ���룺�ַ�������ֽ�����
 * 
 * 
 * ���룺�ֽ��������ַ���
 * 
 * 
 * String-->byte[]    str.getBytes(charsetName);
 * byte[]-->String    new String(byte[],charsetName);
 * 
 * 
 */


public class EncodeStreamTest_42 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		EncodeStreamTest();
	}

	private static void EncodeStreamTest() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "��ͨ";
		byte[] b1 = s.getBytes();
		byte[] b2 = s.getBytes("utf-8");
		for (byte b : b1){
			sop("b1:"+Integer.toBinaryString(b&255));   //��ͨ��gbk��������Ʒ���utf-8�������
		}
		for (byte b : b2){
			sop("b2:"+Integer.toBinaryString(b&255));
		}
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		sop("gbk:"+new String(b1,"gbk"));
		sop("utf-8:"+new String(b1,"utf-8"));
		sop("gbk:"+new String(b2,"gbk"));
		sop("utf-8:"+new String(b2,"utf-8"));
				
	}




	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}