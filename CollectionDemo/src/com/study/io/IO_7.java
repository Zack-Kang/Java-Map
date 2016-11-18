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
 * ��ȻIO���ǲ������ݵģ���ô���ݵ����������ʽ���ǣ��ļ�
 * 
 * ��ô���Ȳ�������Ϊ��
 *
 * ��ѧϰ�ַ���
 * ������Ӳ���ϴ���һ���ļ�����д��һЩ��������
 * ר�Ų����ļ����������FileWriter   ��׺���Ǹ�������ǰ׺���Ǹ�����Ĺ���
 *	
 *
 */
public class IO_7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			//����һ��FileWriter���󣬸ö���һ����ʼ���ͱ���Ҫ��ȷ���������ļ�
			//���Ҹ��ļ��ᱻ������ָ����Ŀ¼�£������Ŀ¼������ͬ���ļ���������
			//��ʵ�ò�������ȷ����Ҫ��ŵ�Ŀ�ĵ�
			FileWriter fw = new FileWriter("filewriter.txt");
			//����write���������ַ���д�����У��ڴ��У�
			fw.write("abcde");
			//ˢ���������л�������ݣ�������������ʱ��ŵ����ݷ���Ŀ�ĵ���
			fw.flush();
			fw.write("fghijk");
			//�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ������е�����
			//������ˢ��Ŀ�ĵ���
			//��flush������flushˢ�º������Լ���ʹ�ã�closeˢ�º󣬻Ὣ���ر�
			fw.close();
	}

}
