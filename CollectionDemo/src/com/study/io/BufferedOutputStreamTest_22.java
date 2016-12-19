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
	/*
	 * ��ȡ����byte�����Ƿ��ص���intԭ��
	 * ��ȡbyteʱ�����"11111111"�������-1���������ʶһ�£��ᵼ�´�������ź�
	 * ��byte����Ϊint,����ȡ��byte����int���һ���ֽڣ�ǰ���24���ֽڲ�0�������ͱ�������������д���ʱ������ȡint���8λ
	 * ������ʽ
	 * step1:byte:11111111
	 * step2:��������int:11111111 11111111 11111111 11111111   -1
	 * step3:��int������00000000 00000000 00000000 11111111(255)�����
	 *        11111111 11111111 11111111 [11111111]
	 *        00000000 00000000 00000000  11111111  &
	 *       ------------------------------------------
	 *        00000000 00000000 00000000 [11111111]
	 *        
	 * ����������int:00000000 00000000 00000000 11111111
	 * 
	 * 
	 * ע���˴�byte����int�������ճ�byteתΪint�����ǲ�һ����
	 * ��������ת�������Ļ�
	 * byte��11111111����Ϊint���ͻ���-1��������Ϊ��8��1֮ǰ������1���µģ���11111111 11111111 11111111 11111111
	 * ��ô��ֻҪ��ǰ�油0���ȿ��Ա���ԭ�ֽ����ݲ��䣬�ֿ��Ա���-1�ĳ���
	 * ��ô��0�أ�
	 * 
	 * 11111111 11111111 11111111 11111111
	 * 00000000 00000000 00000000 11111111 &
	 * --------------------------------------
	 * 00000000 00000000 00000000 11111111
	 * 
	 */
	public int read() throws IOException{   //δʹ��byte���أ�byte���͵�-1����Ϊint����
		//ͨ��is�����ȡӲ���ϵ����ݣ����洢buf��
		if (count==pos){
			count = is.read(buf);
			if (count==-1){
				return -1;
			}
			pos = 0;
		}
		int b = buf[pos++];  //��������������intǰ��24λ�ǲ���1����ô��byte��-1ʱ��b=-1���ᵼ�¶�ȡ�������źţ��ʽ�ǰ��24λ��Ϊ0
		//b = b<<24;
		//b = b>>25;
		System.out.println(b);
		b = b&255;
		return b;
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

/*
 * �ֽ������������ĸ�1����-1������Ϊintʱ��Ϊ-1���ʶ�ȡ��ֹͣ 
 * byte:-1
 * 1111-1111
 * ����Ϊint:-1
 * 1111-1111 1111-1111 1111-1111 1111-1111
 * 
 * 
 * ��������int,ǰ�油0
 * byte:-1
 * int:00000000 00000000 00000000 11111111     255
 * 
 * 
 */
