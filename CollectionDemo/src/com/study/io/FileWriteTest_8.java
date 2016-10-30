package com.study.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * IO�����ַ������ֽ���
 * IO���û���
 *
 * �ֽ����ĳ�����
 * InputoutStream,OutputStream
 * 
 * 
 * 
 * �ַ����ĳ������
 * Reader,Writer
 *
 *
 *
 *	��ѧϰ�ַ���
 *	������Ӳ���ϴ���һ���ļ�����д��һЩ��������
 *	ר�Ų����ļ����������FileWriter   ��׺���Ǹ�������ǰ׺���Ǹ�����Ĺ���
 *	
 *
 */
public class FileWriteTest_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����һ��FileWriter����,�ö���һ����ʼ���ͱ�����ȷ���������ļ�,
		//���Ҹ��ļ��ᱻ������ָ����Ŀ¼��,�����Ŀ¼������ͬ���ļ�����������
		FileWriter fw = null;
		try {
			//��ʵ�ò�������ȷ����Ҫ��ŵ�Ŀ¼
			fw = new FileWriter("fileWriterTest.txt");
			//����Write�������ַ���д�뵽����,��δ���ļ���
			fw.write("hahahaha");
			//ˢ���������еĻ����е����ݣ�������ˢ��Ŀ�ĵ�
			//fw.flush();
			fw.write("heheheh");
			//fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//�ر�����Դ���ر�֮ǰ��ˢ���ڲ������е����ݣ�������ˢ��Ŀ�ĵ�
				//��flush�������ǣ�flushˢ�º��������Լ���ʹ�ã�closeˢ�º󣬻�ر���
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
