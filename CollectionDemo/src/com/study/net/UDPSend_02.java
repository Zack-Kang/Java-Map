package com.study.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * ����ͨ��UDP���䷽ʽ����һ���ļ����ݷ��ͳ�ȥ
 * ˼·��
 * 1������udpsocket����
 * 2���ṩ���ݲ������ݷ�װ�����ݱ�����
 * 3��ͨ��socket����ķ��͹��ܽ����ݷ��ͳ�ȥ
 * 4���ر���Դ
 *
 */
public class UDPSend_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
	}
	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		//1������UPD����
		DatagramSocket dSocket = new DatagramSocket();
		//2��ȷ�����ݣ�����װ�����ݶ���
		byte[] data = "udp come".getBytes();
		DatagramPacket dPacket = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 9000);
		//ͨ��socket�������е����ݷ��ͳ�ȥ
		dSocket.send(dPacket);
		//�ر���Դ
		dSocket.close();
	}
	
	static void sop(Object obj){
		System.out.println(obj);
	}
}