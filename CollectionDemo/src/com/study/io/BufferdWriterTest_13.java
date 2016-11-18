package com.study.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ����Ļ�����
 * �������ĳ�������˶����ݵĶ�дЧ��
 * ��Ӧ��
 *     -BufferedWriter
 *     -BufferedReader
 * ������������ſ���ʹ��
 * �����Ļ����϶����Ĺ��ܽ�������ǿ
 * 
 * 
 * �������ĳ�����Ϊ��������Ĳ���Ч�ʶ�����
 * �����ڴ���������֮ǰ������Ҫ����������
 * �û������ṩ��һ����ƽ̨�Ļ��з�
 * newLine()
 *
 */
public class BufferdWriterTest_13 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ȴ���һ���ַ�д��������
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("buf.txt");
			//Ϊ������ַ�д����Ч�ʣ����뻺�漼��
			//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������
			bw = new BufferedWriter(fw);
			//
			for (int i=0;i<5;i++){
				bw.write("abcde"+i);
				bw.newLine();//д��һ���зָ���
				bw.write("ghik"+i);
				bw.newLine();//д��һ���зָ���
				bw.flush();   //��ֹ�ϵ��������ݶ�ʧ
			}
			//��סֻҪ�õ���������Ҫ�ǵ�ˢ��
			bw.flush();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//��ʵ�رջ����������ǹرջ������е�������,����ر����Ƕ����
				if (bw!=null){
					bw = null;
				}
				if (fw!=null){
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
