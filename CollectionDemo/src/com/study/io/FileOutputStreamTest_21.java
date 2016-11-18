package com.study.io;

import java.io.*;

/**
 * ����һ��ͼƬ ˼·�� 1�����ֽڶ�ȡ�������ͼƬ���� 2�����ֽ�д��������һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ���� 3��ѭ����д��������ݴ洢 4���ر���Դ
 * 
 * 
 */

public class FileOutputStreamTest_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\javain.jpg");
			fos = new FileOutputStream("D:\\javaout.jpg");

			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				fos.write(buf,0,len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("�����ļ�ʧ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();throw new RuntimeException("�����ļ�ʧ��");
			}
		}
	}

}
