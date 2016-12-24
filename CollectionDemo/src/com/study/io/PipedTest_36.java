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
 * �� IO���������� RandomAccessFile ��������ļ�������߱���д�ķ��� ͨ��skipBytes(int x),seek(int
 * x)���ﵽ�������
 * 
 * �ܵ��� PipedOutputStream��PipedInputStream �����������ֱ�ӽ������ӣ�ͨ������߳�ʹ��
 * 
 * ���ӷ�ʽ�� PipedInputStream(PipedOutputStream piped) ����
 * PipedInputStream.connect(PipedOutputStream piped)
 * 
 */

class Read implements Runnable {
	private PipedInputStream in;
	Read(PipedInputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] buff = new byte[1024];
		int len;
		try {
			System.out.println("��ȡǰû�����ݣ������߳�");
			len = in.read(buff);
			System.out.println("�������ݣ���������");
			String s = new String(buff,0,len);
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("�ܵ�������ʧ��");
		}
		
	}

}

class Write implements Runnable {
	private PipedOutputStream out;
	Write(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("��ʼд�����ݵȴ�����");
			Thread.sleep(6000);
			out.write("guandaolaile".getBytes());
			out.close();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("�ܵ������ʧ��");
		}
	}

}

public class PipedTest_36 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		pipedStreamTest();
	}

	private static void pipedStreamTest() throws IOException {
		// TODO Auto-generated method stub
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		in.connect(out);
		Read r = new Read(in);
		Write w = new Write(out);
		new Thread(r).start();
		new Thread(w).start();
		
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
