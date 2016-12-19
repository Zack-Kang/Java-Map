package com.study.io;

import java.io.*;

/**
 * ��ȡ����¼��
 * System.out:��Ӧ��׼������豸������̨
 * System.in:��Ӧ��׼�������豸������
 * 
 * ����ͨ������¼�����ݣ���¼��һ�����ݺ�ͽ��������ݽ��д�ӡ
 * ���¼���������over,��ôֹͣ¼��
 * 
 * ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��
 * Ҳ����readLine����
 * 
 * �ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�
 * readLine������BufferedReader���еķ���
 * ������¼���read�������ֽ���InputStream�ķ���
 * ��ô�ܲ��ܽ��ֽ���ת�����ַ�������ʹ���ַ���������readLine����
 * 
 * 1��
 * Դ������¼��
 * Ŀ�ģ�����̨
 * 2��
 * ����
 * �Ѽ���¼������ݴ洢��һ���ļ���
 * Դ������
 * Ŀ�ģ��ļ�
 * 3��
 * ������Ҫ��һ���ļ������ݴ�ӡ�ڿ���̨��
 * Դ���ļ�
 * Ŀ�ģ�����̨
 * 
 * �������Ļ������ɣ�
 * ��ʹ��ľ����������кܶ࣬��֪��������һ����
 * 
 * ͨ��������ȷ�����
 * 1����ȷԴ��Ŀ��
 *    Դ��������     InputStream Reader
 *    Ŀ�ģ������  OutputStream Writer
 * 2����ȷ�����������Ƿ��Ǵ��ı�
 *    �ǣ��ַ���
 *    ���ǣ��ֽ���
 * 3������ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
 *    ͨ���豸����������
 *    Դ�豸���ڴ棬Ӳ�̣�����
 *    Ŀ���豸���ڴ棬Ӳ�̣�����̨
 *    
 *    
 * 1����һ���ı��ļ������ݴ洢����һ���ļ��У������ļ�
 *     Դ��ʹ�ö�ȡ��InputStream Reader
 *        �ǲ��ǲ����ı��ļ�
 *        �ǣ���ʱ�Ϳ���ѡ��Reader
 *        ������ϵ����ȷ��
 *        
 *        ��������ȷҪʹ�ø���ϵ���ĸ�����
 *        ��ȷ�豸��Ӳ����һ���ļ�
 *        Reader��ϵ�п��Բ����ļ��Ķ�����FileReader
 *        
 *        �Ƿ���Ҫ���Ч�ʣ��� ����Reader��ϵ�еĻ�����BufferedReader
 *        
 *      FileReader fr = new FileReader("a.txt") 
 *      BufferedReader br = new BufferedReader(fr); 
 *        
 *     Ŀ�ģ� OutputStream Writer
 *     �Ƿ��Ǵ��ļ�
 *     �ǣ�Writer
 *     �豸��Ӳ���ϵ�һ���ļ�
 *     Writer��ϵ�п��Բ����ļ��Ķ���FileWriter
 *     �Ƿ���Ҫ���Ч�ʣ��� ����Writer��ϵ�еĻ�����BufferedWriter
 *     FileWriter fw = new FileWriter("b.txt");
 *     BufferedWriter bw = new BufferedWriter(fw);
 *    
 * ��ϰ����һ��ͼƬ�ļ��洢����һ���ļ��У������ļ���Ҫ�������ϸ�ʽ�Լ����������ȷ
 * 
 * 2�����󣺽�����¼������ݱ��浽һ���ļ���
 *     �����������Դ��Ŀ�Ķ�����
 *     ��ô�ֱ����
 *   Դ��InputStream  Reader
 *     �ǲ��Ǵ��ı��� ��  Reader
 *     �豸������ ��Ӧ�Ķ�����System.in
 *     ����ѡ��Reader��System.in��Ӧ�Ĳ����ֽ�����
 *     Ϊ�˲������̵��ı����ݷ��㣬ת���ַ����������ַ�������������
 *     ������ȷ��Reader����ô�ͽ�System.inת�����ַ���Reader
 *     �õ���Reader��ϵ�е�ת������InputStreamReader
 *     
 *     InputStreamReader isr = new InputStreamReader(System.in);
 *     
 *     ��Ҫ���Ч������Ҫ��BufferedReader
 *     BufferedReader buff = new BufferedReader(isr);
 *   Ŀ�ģ�OutputStream Writer
 *     �Ƿ��Ǵ��ı��� �� Writer
 *     �豸��Ӳ�̣�һ���ļ�  ʹ��FileWriter
 *     FileWriter fw = new FileWriter("a.txt");
 *     ��Ҫ���Ч������Ҫ  BufferedWriter
 *     BufferedWriter buffw = new BufferedWriter(fw); 
 *   
 *   
 * ��չ����Ҫ��¼������ݰ���ָ���ı����utf-8���������ݴ浽�ļ���
 *   Ŀ�ģ�OutputStream Writer
 *     �Ƿ��Ǵ��ı��� �� Writer
 *     �豸��Ӳ�̣�һ���ļ�  ʹ��FileWriter
 *     ����FileWriter��ʹ�õ�Ĭ�ϱ����
 *     ���Ǵ洢ʱ����Ҫ����ָ���ı����utf-8������ָ���ı����ֻ��ת��������ָ����
 *     ����Ҫʹ�õĶ�����OutputStreamWriter
 *     ����ת��������Ҫ����һ���ֽ�����������һ����Բ����ļ����ֽ��������FileOutputStream
 *     OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStreamReader("d.txt"),"UTF-8");
 *     
 *     ��Ҫ��Ч����Ҫ
 *     BufferedWriter bufw = new BufferedWriter(osw);
 *     
 *     ���ԣ���ס��ת����ʲôʱ��ʹ�ã��ַ����ֽ�֮���������ͨ���漰���ַ�����ת��ʱ��
 *     ��Ҫ�õ�ת����
 * 
 * ��ϰ����һ���ı����ݴ�ӡ�ڿ���̨�ϣ��������ϸ�ʽ���������ȷ
 * 
 * 
 */

public class ReadIn_24 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		//Test1();
		//Test2();
		//Test3();
		//Test4();
		//Test5();
		//Test6();
		Test7();
	}
	
	private static void Test7() throws UnsupportedEncodingException, FileNotFoundException {
		// TODO Auto-generated method stub
		//�޸�����������
		//System.setIn(new FileInputStream("filewriter.txt"));
		//�޸����
		//System.setOut(new PrintStream("e.txt"));
		
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d1.txt"),"UTF-8"));
		String str;
		try {
			while((str = buffr.readLine())!=null){
				if ("over".equals(str)){
					break;
				}
				buffw.write(str);
				buffw.newLine();
				buffw.flush();
		
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void Test6() throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("out.txt")));
		BufferedWriter buffW = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		try {
			while((str = buff.readLine())!=null){
				if ("over".equals(str)){
					break;
				}
				buffW.write(str);
				buffW.newLine();
				buffW.flush();
		
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test5() throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffW = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));
		String str;
		try {
			while((str = buff.readLine())!=null){
				if ("over".equals(str)){
					break;
				}
				buffW.write(str);
				buffW.newLine();
				buffW.flush();
		
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test4() {
		// TODO Auto-generated method stub
		//��ȡ����¼�����
		InputStream in = System.in;
		//���ֽ�������ת�����ַ�������ʹ��ת������InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);
		//���ַ��������ַ���������
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(out);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str;
		try {
			while((str = br.readLine())!=null){
				if ("over".equals(str)){
					break;
				}
				bw.write(str);
				bw.newLine();
				bw.flush();
				//osw.write(str+"\r\n");
				//osw.flush(); 
				//System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void Test3() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = 0;
			StringBuilder sb = new StringBuilder();
			while(true){
				int ch = in.read();
				if (ch=='\r'){
					continue;
				}
				if (ch=='\n'){
					String str = sb.toString();
					if ("over".equals(str)){
						break;
					}
					System.out.println(str.toUpperCase());
					sb.delete(0, sb.length());
				}
				sb.append((char)ch);
				//System.out.println(by1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test2() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = 0;
			while((by1=in.read())!=-1){
				System.out.println(by1);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void Test1() {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		try {
			int by1 = in.read();
			int by2 = in.read();
			int by3 = in.read();
			System.out.println(by1);
			System.out.println(by2);
			System.out.println(by3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
