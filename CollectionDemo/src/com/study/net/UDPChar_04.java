package com.study.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * ��д������� �������ݵĲ��ֺͷ����ݵĲ��� ����������Ҫͬʱִ�� �Ǿ���Ҫ�õ����̼߳��� һ���߳̿����գ�һ���߳̿��Ʒ�
 * 
 * ��Ϊ�պͷ��Ķ����ǲ�һ�µģ�������Ҫ��������run���� ����������������Ҫ�����ڲ�ͬ������
 */

class Send implements Runnable {
	private DatagramSocket sendSocket;

	public Send(DatagramSocket sendSocket) {
		super();
		this.sendSocket = sendSocket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		try {
			String line = null;
			while ((line=br.readLine())!=null){
				DatagramPacket dp = new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("192.168.1.255"),10002);
				sendSocket.send(dp);
				if (line.equals("886")) break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("��������");
		}  finally {
			try {
				if (br!=null){
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


class Rece implements Runnable {
	private DatagramSocket receSocket;

	public Rece(DatagramSocket receSocket) {
		super();
		this.receSocket = receSocket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			try {
				byte[] buff = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buff, buff.length);
				receSocket.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip+":"+data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("���ն��쳣��");
			}
			
		}
	}
}



public class UDPChar_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1();
		
	}

	private static void Test1() {
		// TODO Auto-generated method stub
		try {
			DatagramSocket sendSocket = new DatagramSocket();
			DatagramSocket receSocket = new DatagramSocket(10002);
			new Thread(new Send(sendSocket)).start();
			new Thread(new Rece(receSocket)).start();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
