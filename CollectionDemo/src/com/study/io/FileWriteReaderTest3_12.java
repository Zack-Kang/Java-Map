package com.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��C�̵�һ���ļ����Ƶ�D��
 * ����ԭ��
 * ���ǽ�C�̵�һ���ļ��洢��D�̵�һ���ļ�
 * 
 * ���裺
 * 1����D�̴���һ���ļ������ڴ洢C���ļ�������
 * 2������һ����ȡ����C���ļ�����
 * 3��ͨ�����ϵĶ�д������ݴ洢
 * 4���ر���Դ
 *
 */
public class FileWriteReaderTest3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy_1();
		Copy_2();
	}
	
	//��C�̶�һ���ַ�����D��дһ���ַ�
	public static void Copy_1(){
		FileWriter fw = null;
		FileReader fr = null;
		try {
			//����Ŀ�ĵ�
			fw = new FileWriter("D:\\Copy.java");
			//�������ļ�����
			fr = new FileReader("D:\\Users\\Think\\workspacej2EE\\CollectionDemo\\src\\com\\study\\io\\IO_7.java");
			int ch = 0;
			while((ch=fr.read())!=-1){
				fw.write(ch);
				System.out.print(ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if (fw!=null){
					fw.close();
					}
					if (fr!=null){
						fr.close();
						}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	//��C�̶�һ���ַ�����D��дһ���ַ�
		public static void Copy_2(){
			FileWriter fw = null;
			FileReader fr = null;
			try {
				//����Ŀ�ĵ�
				fw = new FileWriter("D:\\Copy1.java");
				//�������ļ�����
				fr = new FileReader("D:\\Users\\Think\\workspacej2EE\\CollectionDemo\\src\\com\\study\\io\\IO_7.java");
				int len = 0;
				char[] buf = new char[1024];
				while((len=fr.read(buf))!=-1){
					fw.write(buf,0,len);
					System.out.print(buf);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("��д�쳣");
			}finally {
				
					try {
						if (fw!=null){
						fw.close();
						}
						if (fr!=null){
							fr.close();
							}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}

		
}
