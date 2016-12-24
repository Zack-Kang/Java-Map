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
 * IO���������� RandomAccessFile ��������ļ�������߱���д�ķ��� ͨ��skipBytes(int x),seek(int
 * x)���ﵽ�������
 * 
 * �ܵ��� PipedOutputStream��PipedInputStream �����������ֱ�ӽ������ӣ�ͨ������߳�ʹ��
 * 
 * ���ӷ�ʽ�� PipedInputStream(PipedOutputStream piped) ����
 * PipedInputStream.connect(PipedOutputStream piped)
 * 
 * 
 * 
 * RandomAccessFile:���ݵķֶ�д�루���߳������ļ���
 * �����ʵ������֧����������ļ��Ķ�ȡ��д�룬��������ļ�����Ϊ���ƴ洢���ļ�ϵͳ�е�һ������byte���飬����ָ������������
 * ������������Ϊ�ļ�ָ�룻����������ļ�ָ�뿪ʼ��ȡ�ֽڣ��������ֽڵĶ�ȡ���ƴ��ļ�ָ�롣�����������ļ��Զ�ȡ/д��ģʽ����
 * ���������Ҳ�����ã�����������ļ�ָ�뿪ʼд���ֽڣ������Ŷ��ֽڵ�д���ǰ�ƴ��ļ�ָ�롣д����������ĵ�ǰĩβ֮����������
 * ���¸�������չ�����ļ�ָ�����ͨ��geiFilePoint������ȡ����ͨ��seek��������
 * ͨ������������е����ж�ȡ�����ڶ�ȡ�����������ֽ�֮ǰ�Ѵﵽ�ļ�ĩβ�����׳�EOFException(��һ��IOException)��
 * �������ĳЩԭ���޷���ȡ�κ��ֽڣ��������ڶ�ȡ�����������ֽ�֮ǰ�Ѵﵽ�ļ�ĩβ�����׳�IOException��������EOFException��
 * ��Ҫ�ر�ָ�����ǣ�������ѹرգ�������׳�IOException
 * 
 * 
 * ���಻����IO��ϵ�е����࣬����ֱ�Ӽ̳���Object
 * ��������IO���еĳ�Ա����Ϊ���߱�����д���ܣ�
 * �ڲ���װ��һ�����飬����ͨ��ָ��������е�Ԫ�ؽ��в�����
 * ����ͨ��getFilePoint��ȡָ��λ�ã�ͬʱ����ͨ��seek�ı�ָ���λ��
 * 
 * ��ʵ��ɶ�д��ԭ������ڲ���װ���ֽ��������������
 * ͨ�����캯�����Կ���������ֻ�ܲ����ļ�
 * ���Ҳ����ļ�����ģʽ:ֻ��r,��дrw
 * 
 * ���ģʽΪrֻ�������ᴴ���ļ�����ȥ��ȡһ�����ڵ��ļ���������ļ��������������쳣
 * ���ģʽΪrw,Ҫ�������ļ������ڣ����Զ�����(��rֻ��ģʽ)��������ڲ��Ḳ��
 * 
 * 
 * 
 */


public class RandomAccessFileTest_37 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//RandomAccessFileTest();
		//readFile();
		writeFile();
		
	}
	
	public static void writeFile() throws IOException{
		RandomAccessFile accessFile = new RandomAccessFile("ran.txt", "rw");
		accessFile.seek(8*2);
		accessFile.write("����".getBytes());
		accessFile.writeInt(120);
		accessFile.close();
		
	}
	
	private static void readFile() throws IOException{
		RandomAccessFile accessFile = new RandomAccessFile("ran.txt", "r");
		byte[] buf = new byte[4];
		int len = 0;
		len = accessFile.read(buf);
		String name = new String(buf,0,len);
		sop(name);
		int age = accessFile.readInt();
		sop(age);
		
		//��������ָ��
		//accessFile.seek(8);
		
		//����ָ�����ֽ���
		accessFile.skipBytes(8); //ֻ����ǰ��������������
		len = accessFile.read(buf);
		String name1 = new String(buf,0,len);
		sop(name1);
		int age1 = accessFile.readInt();
		sop(age1);
		accessFile.close();
	}

	private static void RandomAccessFileTest() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rAccessFile = new RandomAccessFile("ran.txt", "rw");
		rAccessFile.write("����".getBytes());
		rAccessFile.writeInt(97);
		rAccessFile.write("����".getBytes());
		rAccessFile.writeInt(99);
		rAccessFile.write("����".getBytes());
		rAccessFile.writeInt(110);
		rAccessFile.close();
		
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
