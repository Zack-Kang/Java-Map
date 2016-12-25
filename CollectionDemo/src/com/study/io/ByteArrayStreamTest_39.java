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
 * IO����������������
 * ����������������
 *     DataInputStream��DataOutputStream
 * �����ֽ�����
 *     ByteArrayInputStream��ByteArrayOutputStream
 * �����ַ�����
 *     CharArrayReader��CharArrayWrite
 * �����ַ���
 *     StringReader��StringWriter
 * 
 * 
 * �����ֽ�����
 * ByteArrayInputStream��ByteArrayOutputStream
 * ByteArrayInputStream����һ���ڲ����������û��������������ж�ȡ���ֽڣ��ڲ�����������read����Ҫ�ṩ����һ���ֽڡ�
 * �ر�ByteArrayInputStream��Ч������ķ����ڹرմ������Կɱ����ã�����������κ�IOException
 * �ڹ����ʱ����Ҫ��������Դ����������Դ��һ������
 * 
 * ByteArrayOutputStream����ʵ����һ������������е����ݱ�д��һ��byte���飬���������������ݵĲ���д����Զ���������ʹ��toByteArray()��toString()��ȡ����
 * �ر�ByteArrayOutputStream��Ч�������еķ����ڹرմ������Կɱ����ã�����������κ�IOException
 * �ڹ����ʱ���ö�������Ŀ�ģ���Ϊ�ö������Ѿ��ڲ���װ�˿ɱ䳤���ֽ����飬��������ݵ�Ŀ�ĵ�
 * 
 * ��Ϊ������������double���������ݣ�û��ʹ��ϵͳ��Դ�����Բ��ý���close�ر�
 * 
 * 
 * 
 * �����������ɽ���ʱ��
 * Դ�豸��
 *    ����System.in  Ӳ��FileStream   �ڴ�ByteArrayInputStream
 * Ŀ���豸
 *    ����̨System.out  Ӳ��FileStream   �ڴ�ByteArrayOutputStream
 *   
 * �����Ķ�д˼������������
 */


public class ByteArrayStreamTest_39 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ByteArrayStream();
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
