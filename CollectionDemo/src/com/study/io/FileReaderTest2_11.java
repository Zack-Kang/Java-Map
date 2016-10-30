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
;public class FileReaderTest2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		try {
			//����һ���ļ���ȡ������ָ�������ļ������
			//Ҫ��֤���ļ������Ѿ����ڵģ���������ڣ��ᷢ���쳣FileNotFoundException
			fr = new FileReader("D:\\Users\\Think\\workspacej2EE\\CollectionDemo\\src\\com\\study\\io\\FileWriteTest_9.java");
			
			char[] buf = new char[1024];  //ͨ������1024��������
			int num = 0;
			while ((num=fr.read(buf))!=-1){
				out.print(new String(buf,0,num));
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
