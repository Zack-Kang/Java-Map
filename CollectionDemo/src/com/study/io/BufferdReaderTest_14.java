package com.study.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * д�뻺����
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ
 * 
 * �û������ṩ��һ��һ�ζ�һ�еķ�����readLine(����������ֹ��)��������ı��Ķ�ȡ
 * 
 * ������nullʱ����ʾ�����ļ�ĩβ
 * 
 * readLine����ֻ���ػس���֮ǰ�����ݣ��������ػس���
 * �����Ƕ�һ�л��Ƕ�ȡ����ַ�����ʵ���ն�����Ӳ����һ��һ����ȡ����������ʹ�õĻ���read����һ�ζ�ȡһ���ķ���
 *
 */
public class BufferdReaderTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//����һ����ȡ��������ļ������
			fr = new FileReader("buf.txt");
			//Ϊ�����Ч�ʣ����뻺�漼�������ַ���ȡ��������Ϊ�������ݸ�����������Ĺ��캯��
			br = new BufferedReader(fr);
			String s1 = null;
			while((s1 = br.readLine())!=null){  //��������
				System.out.println(s1);
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (br!=null){
					br.close();	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
