package com.study.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * �����ļ���д
 * FileWriter(filename,append)  //����һ��true�������������������ļ������������ļ���ĩβ��д���ļ��������򴴽�
 *
 */
public class FileWriteTest_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw = null;
		try {
			//��ʵ�ò�������ȷ����Ҫ��ŵ�Ŀ¼
			//����һ��true�������������������ļ������������ļ���ĩβ��д
			fw = new FileWriter("fileWriterTest.txt",true);
			//����Write�������ַ���д�뵽����,��δ���ļ���
			fw.write("���\r\nлл");   //��window�У��س�����"\r\n"��ʾ
			fw.write("heheheh");
			
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
