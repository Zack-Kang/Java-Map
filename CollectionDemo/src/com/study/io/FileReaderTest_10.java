package com.study.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ȡ�����ļ�
 * FileReader(filename)
 *
 */

import static java.lang.System.*
;public class FileReaderTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		try {
			//����һ���ļ���ȡ������ָ�������ļ������
			//Ҫ��֤���ļ������Ѿ����ڵģ���������ڣ��ᷢ���쳣FileNotFoundException
			fr = new FileReader("fileWriterTest.txt");
			//���ö�ȡ�������read����
			//��ȡ��ʽһ��int read()������һ�ζ�ȡһ���ַ������һ��Զ����¶�,����-1ʱ����
			/*while (true){
				int ch = fr.read();
				if (ch==-1){
					break;
				}
				out.println((char)ch);
			}*/
			/*int ch = 0;
			while ((ch=fr.read())!=-1){
				out.println((char)ch);
			}*/
			//��ȡ��ʽ�����ַ������ȡ int read(char[] buf)
			//����һ���ַ����飬���ڴ洢�������ַ�����
			//��read�������صĶ������ַ�����,����-1���ȡ����
			/*char[] buf = new char[6];
			int num = fr.read(buf);
			out.println("num="+num+"--"+new String(buf));
			
			num = fr.read(buf);
			out.println("num="+num+"--"+new String(buf));*/
			
			char[] buf = new char[1024];  //ͨ������1024��������
			int num = 0;
			while ((num=fr.read(buf))!=-1){
				out.println("num="+num+"--"+new String(buf,0,num));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//�ر�����Դ���ر�֮ǰ��ˢ���ڲ������е����ݣ�������ˢ��Ŀ�ĵ�
				//��flush�������ǣ�flushˢ�º��������Լ���ʹ�ã�closeˢ�º󣬻�ر���
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
