package com.study.io;

import java.io.IOException;

/**
 * Runtime:ÿ��javaӦ�ó�����һ��runtime��ʵ����ʹӦ�ó����������еĻ��������ӣ�
 * ����ͨ��getRuntime������ȡ��ǰ����ʱ��Ӧ�ó����ܴ����Լ���Runtime��ʵ��
 * 
 * û�й��캯��,������new���󣬸������зǾ�̬�����������п϶��о�̬������ȡ������󣨵��������÷�����getRuntime
 * 
 * 
 * Runtime r = Runtime.getRuntime();
 * 
 * 
 * 
 * 
 */
public class RuntimeTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		try {
			Process p = r.exec("D:\\Program Files\\Notepad++\\notepad++.exe");
			//r.exec("D:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
			r.exec("notepad.exe D:\\Users\\Think\\workspacej2EE\\CollectionDemo\\src\\com\\study\\io\\SystemTest.java");
			
			try {
				Thread.sleep(2000);
				p.destroy();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
