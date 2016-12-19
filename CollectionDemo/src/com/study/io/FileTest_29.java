package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**��
 * ��ϰ��
 * ��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ���
 * ����һ��java�ļ��б��ļ�
 * 
 * ˼·��
 * 1����ָ����Ŀ¼���еݹ�
 * 2����ȡ�ݹ���������е�java�ļ�·��
 * 3������Щ·���洢�������� 
 * 4���������е����ݴ洢���ļ���
 * 
 */

public class FileTest_29 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
	}
	

	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		File dir = new File(".//");
		ArrayList<File> files = new ArrayList<>();
		fileToList(dir, files);
		sop(files.size());
		WriteToFile(files);
	}
	
	private static void WriteToFile(ArrayList<File> files) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw  = new BufferedWriter(new FileWriter("javafile.txt"));
		for (File file: files){
			bw.write(file.getAbsolutePath());
			sop(file.getAbsolutePath());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}


	public static void fileToList(File dir, List<File> fileList){
		File[] files = dir.listFiles();
		if (files==null) return;
		for (File file:files){
			if (file.isDirectory()){
				fileToList(file, fileList);
			}else{
				if (file.getName().endsWith(".java")){
					fileList.add(file);
				}
			}
		}
	}

	


	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
	
	
}

//log4j 
