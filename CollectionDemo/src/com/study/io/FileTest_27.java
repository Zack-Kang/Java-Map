package com.study.io;

import java.io.*;

/**
 * �г�ָ��Ŀ¼���ļ������ļ��У�������Ŀ¼�е�����
 * Ҳ�����г�ָ��Ŀ¼�µ���������
 * �ݹ飺
 * 1���޶������������ݹ��������
 * 2��Ҫע��ݹ�Ĵ��������������ڴ����
 *    
 */

public class FileTest_27 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
		//toBin(20);
		//sop(getSum(8880));
	}
	
	private static long getSum(long i) {
		// TODO Auto-generated method stub
		sop(i);
		if (i==1){
			return 1;
		}else{
			return i+ getSum(i-1);
		}
	}

	//��ӡ������
	private static void toBin(int i) {
		// TODO Auto-generated method stub
		if (i>0){
			toBin(i/2);
			sop(i%2);
		}
		/*while(i>0){
			sop(i%2);
			i = i/2;
		}*/
	}



	private static void Test1() {
		// TODO Auto-generated method stub
		File f = new File(".//");
		scanDir(f,0);
	}
	public static String getLevel(int level){
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<level;i++){
			sb.append("|--");
		}
		return sb.toString();
	}
	static void scanDir(File dir, int level){
		sop(getLevel(level)+dir.getName());
		File[] files = dir.listFiles();
		
		if (files==null){
			return;
		}
		level++;
		for (File file : files){
			if (file.isFile()){
				sop(getLevel(level)+file);
			}else{
				scanDir(file,level);
			}
		}
	}



	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
	
	
}

//log4j 
