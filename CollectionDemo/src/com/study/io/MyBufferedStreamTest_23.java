package com.study.io;

import java.io.*;

/**
 * ����һ��ͼƬ ˼·�� 
 * 1�����ֽڶ�ȡ�������ͼƬ����
 * 2�����ֽ�д��������һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ���� 
 * 3��ѭ����д��������ݴ洢
 * 4���ر���Դ
 * 
 * ͨ�����渴���ļ�
 * 
 */

public class MyBufferedStreamTest_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_01();
	}
	public static void Copy_01(){

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("D:\\javain.jpg"));
			
			bos = new BufferedOutputStream(new FileOutputStream("D:\\javaout.jpg"));
			
			int by = 0;
			while ((by=bis.read())!=-1){
				bos.write(by);
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
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();throw new RuntimeException("�����ļ�ʧ��");
			}
		}
	}

	public static void Copy_02(){
		
	}
}
