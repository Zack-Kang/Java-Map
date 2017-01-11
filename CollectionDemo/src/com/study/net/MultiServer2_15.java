package com.study.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �ͻ���ͨ������¼���û���
 * ����˶�����û�������У��
 * 
 * ������ڣ��������ʾxxx�ѵ�¼
 * ���ڿͻ�����ʾxxx,��ӭ����
 * 
 * ������û����棬�ڷ������ʾxxx���Ե�¼
 * �ͻ�����ʾxxx���û�������
 * 
 * 
 * ����¼����
 * 
 *
 */

class UserThread implements Runnable {

	private Socket client;
	public UserThread(Socket client) {
		// TODO Auto-generated constructor stub
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ip = client.getInetAddress().getHostAddress();
		System.out.println(ip+" connected");
		try {
			
			for (int i=0;i<3;i++){
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String name = in.readLine();
				if (name==null) break;
				System.out.println(ip+name);
				PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
				System.out.println(ip);
				
				BufferedReader br = new BufferedReader(new FileReader("users.txt"));
				String line = null;
				boolean flag = false;
				while ((line=br.readLine())!=null){
					
					if (line.equals(name)){
						flag = true;
						break;
					}
				}
				
				if (flag){
					System.out.println(name+",�ѵ�¼");
					out.println(name+",��ӭ���٣�");
					break;
				}else{
					System.out.println(name+",���Ե�¼");
					out.println(name+",�û��������ڣ�");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("У��ʧ�ܣ�"+ip);
		}
	}

}

public class MultiServer2_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(10008);
		while (true){
			Socket client = server.accept();
			new Thread(new UserThread(client)).start();
		}
		
		
	}

}

