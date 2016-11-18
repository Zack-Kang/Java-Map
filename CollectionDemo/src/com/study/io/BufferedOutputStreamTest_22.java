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

class MyBufferedInputStream{
	private InputStream is ;
	private byte[] buf = new byte[1024];
	private int pos = 0,count = 0;
	public MyBufferedInputStream(InputStream is) {
		super();
		this.is = is;
	}
	//һ�ζ�ȡһ���ֽڣ��ӻ��������ֽ����飩��ȡ
	public int read() throws IOException{
		//ͨ��is�����ȡӲ���ϵ����ݣ����洢buf��
		if (count==pos){
			count = is.read(buf);
			if (count==-1){
				return -1;
			}
			pos = 0;
		}
		return buf[pos++];
	}
	
	public void close() throws IOException{
		if (is!=null){
			is.close();
		}
	}
}

public class BufferedOutputStreamTest_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new MyBufferedInputStream(new FileInputStream("D:\\javain.jpg"));
			
			bos = new BufferedOutputStream(new FileOutputStream("D:\\javaout.jpg"));
			long s = System.currentTimeMillis();
			int by = 0;
			while ((by=bis.read())!=-1){
				bos.write(by);
			}
			System.out.println(System.currentTimeMillis()-s);
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

}
