package com.study.io;

import java.io.*;

/**
 * File��
 * �������ļ������ļ��з�װ�ɶ���
 * ������ļ����ļ��е�������Ϣ���в���
 * File���������Ϊ�������ݸ����Ĺ��캯��
 * 
 * File.separator���ָ���
 * 
 * 
 * File��ĳ�������
 * 1������
 *    boolean createNewFile();��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻴���������false,���������һ�������������һ���������ļ��������ļ��Ѿ����ڣ��Ḳ�ǡ�
 *    createTempFile:������ʱ�ļ�
 *    �����ļ���
 *    boolean mkdir()   �����ļ��� ֻ�ܴ���һĿ¼
 *    boolean mkdirs()  �����༶�ļ���
 * 2��ɾ��
 *    boolean delete();   ɾ��ʧ�ܷ���false
 *    void deleteOutExit();   �ڳ����˳�ʱ��ɾ��ָ���ļ�     �������ʱɾ��ָ���ļ�
 * 3���ж�
 *    boolean canExecute();  �ļ��Ƿ��ִ��
 *    boolean exists();      �ļ��Ƿ����
 *    //���ж�һ���ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ������װ�������Ƿ���ڣ�ͨ��exists�ж�
 *    boolean isFile();      �Ƿ����ļ�
 *    boolean isDirectory(); �Ƿ���Ŀ¼
 *    boolean isHidden();    �Ƿ��������ļ�
 *    boolean isAbsolute();  �Ƿ��Ǿ���·��,������ȫ·��
 * 4����ȡ��Ϣ
 *    String getName();          ��ȡ�˶���˵��ʾ���ļ���Ŀ¼����
 *    String getPath();          ��ȡ·��
 *    String getParent();        ��ȡ��Ŀ¼�����û����Ϊnull,�ķ������ص��Ǿ���·���еĸ�Ŀ¼�������ȡ�������·���ķ���null,������·��������һ��Ŀ¼�����Ŀ¼���Ƿ��ؽ��
 *    String getAbsolutePath();  ��ȡ����·��
 *    File getAbsoluteFile();    ���ش˳�������·���ľ���·������ʽ,��װ����File����
 *    long lastModified();       ���һ���޸�ʱ��
 *    long length();             �ļ���С
 *    
 * 5����������
 *    boolean renameTo(File dest);  //�ƶ����޸��ļ�����,���ƶ��Ĺ���
 *    static File listRoot();       //�г����õ��ļ�ϵͳ��,���ػ��������и�Ŀ¼
 *    String[] list();              //��ȡָ���ļ��У���Ŀ¼������ڣ����򷵻����鳤��Ϊ0�������е��ļ����ļ���,�����Ķ����װ�Ķ������ļ�ʱ������null
 *    String[] list(FilenameFilter filter);  �ļ�����     FilenameFilter���ӿ�
 *    File[] listFiles();           //���ص�ǰ�ļ����µ��ļ��Լ��ļ��еĶ���
 *    File[] listFiles(FilenameFilter filter);
 *    
 */

public class FileTest_26 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Test1();
		//Test2();
		//Test3();
		//Test4();
		//Test5();
		//Test6();
		//Test7();
		//Test8();
		//Test9();
		//Test10();
		//Test11();
		Test12();
	}
	
	private static void Test12() {
		// TODO Auto-generated method stub
		File dir = new File(".\\");
		File[] files = dir.listFiles();
		for (File file:files)
			sop("listFiles��"+file.getName()+":" +file.length());
	}

	private static void Test11() {
		// TODO Auto-generated method stub
		File f = new File(".\\");
		for (String str:f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File f = new File(dir, name);
				System.out.println("dir:"+dir.getAbsolutePath()+"------>name:"+name);
				//return f.isFile()&&name.endsWith(".txt");
				return f.isDirectory();
				//return false;
			}
		}))
			sop("listRoots��"+str);
	}

	private static void Test10() {
		// TODO Auto-generated method stub
		File f = new File("c:\\");
		//File f  = new File("file.txt");
		for (String str:f.list())
			sop("listRoots��"+str);
	}

	private static void Test9() {
		// TODO Auto-generated method stub
		for (File f:File.listRoots())
		sop("listRoots��"+f);
	}

	private static void Test8() throws IOException {
		// TODO Auto-generated method stub
		File f  = new File("file.txt");
		File f1 = new File("aa//rfile.txt");
		sop("renameTo��"+f.renameTo(f1));
	}

	private static void Test7() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("file.txt");
		f.createNewFile();
		sop("getName��"+f.getName());
		sop("getPath��"+f.getPath());
		sop("getParent��"+f.getParent());
		sop("getAbsolutePath��"+f.getAbsolutePath());
		sop("lastModified��"+f.lastModified());
		sop("length��"+f.length());
		
		File f1 = new File("aa//a.txt");
		sop("getParent��"+f1.getParent());
		
	}

	private static void Test6() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("file.txt"); //File(C:\\file.txt);
		//f.createNewFile();
		f.mkdir();
		//���ж�һ���ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ������װ�������Ƿ���ڣ�ͨ��exists�ж�
		sop("mkdir��"+f.isDirectory());
		sop("isFile��"+f.isFile());
		sop("isAbsolute��"+f.isAbsolute());
		
	}

	private static void Test5() {
		// TODO Auto-generated method stub
		File f = new File("file.txt");
		sop("execute��"+f.exists());
		//�����ļ���
		File dir = new File("abc\\kk\\cc\\dd\\ss");
		sop("mkdir��"+dir.mkdir());
		sop("mkdirs��"+dir.mkdirs());
	}

	private static void Test4() {
		// TODO Auto-generated method stub
		File f = new File("file.txt");
		sop("execute��"+f.exists());
	}

	private static void Test3() {
		// TODO Auto-generated method stub
		File f = new File("file.txt");
		sop("execute��"+f.canExecute());
	}

	private static void Test2() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("file.txt");
		f.deleteOnExit();  //������ɾ�����ļ�
		sop("create:"+f.createNewFile());
		
	}

	//����File����
	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		//��system.txt��װ�ɶ��󣬿��Խ����еĺ�δ���ֵ��ļ������ļ��з�װ�ɶ���
		File file1 = new File("c:\\abc\\a.txt");
		
		//
		File file2 = new File("c:\\abc");
		
		//
		File d = new File("c:\\abc");
		File file3 = new File(d, "c.txt");
		sop(file1);
		sop(file2);
		sop(file3);
		File file4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
	
	
}

//log4j 
