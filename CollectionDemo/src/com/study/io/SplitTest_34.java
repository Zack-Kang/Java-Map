package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

/**��
 * ��ӡ��
 * PrintWriter��PrintStream
 * ����ֱ�Ӳ�����������ļ�
 * 
 * ������
 * SequenceInputStream
 * �Զ�������кϲ�
 * 
 * ��������
 * ObjectInputStream��ObjectOutputStream
 * �������Ķ�����Ҫʵ��Serializable(��ǽӿ�)
 * 
 * 
 * 
 * �и��ļ�
 * 
 * 
 * 
 * 
 * 
 */

public class SplitTest_34 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//splitFile();
		mergeFile();
	}
	

	


	private static void mergeFile() throws IOException {
		// TODO Auto-generated method stub
		File dir = new File(".\\splitfiles");
		if (!dir.exists()){
			dir.mkdir();
		}
		String[] files = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".part");
			}
		});
			
		ArrayList<FileInputStream> list = new ArrayList<>();
		for (int i=0;files!=null&&i<files.length;i++){
			String name = (i+1)+".part";
			list.add(new FileInputStream(new File(dir,name)));
		}
		Iterator<FileInputStream> it = list.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
			
			@Override
			public FileInputStream nextElement() {
				// TODO Auto-generated method stub
				return it.next();
			}
			
			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return it.hasNext();
			}
		};
		SequenceInputStream sin = new SequenceInputStream(en);
		FileOutputStream fout = new FileOutputStream(new File(dir,"gitbook.pdf"));
		byte [] buff =new byte[1024];
		int len = 0;
		while((len=sin.read(buff))!=-1){
			fout.write(buff, 0, len);
		}
		fout.close();
		sin.close();
	}





	private static void splitFile() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("progit-zh.936.pdf");
		FileOutputStream fout = null;
		File dir = new File(".\\splitfiles");
		if (!dir.exists()){
			dir.mkdirs();
		}
		byte[] buff = new byte[1024*1024];
		int len = 0;
		int count = 0;
		while ((len=fin.read(buff))!=-1){
			count++;
			fout = new FileOutputStream(".\\splitfiles\\"+count+".part");
			fout.write(buff, 0, len);
			fout.close();
			fout = null;
		}
		fin.close();
	
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
