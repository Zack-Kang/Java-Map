package com.study.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * ���󣺶���һ��Ӧ�ó������ڽ���UDPЭ�鴫������ݲ�����
 * 
 * ����udp���ն�
 * ˼·��
 * 1������udpsocket����ͨ�������һ���˿ڣ���ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ����������ȷ��Щ���ݹ�����Ӧ�ó�����Դ���
 * 2������һ�����ݰ������ڴ洢���յ����ֽ����ݣ���Ϊ���ݰ��������и���Ĺ��ܿ�����ȡ�ֽ������еĲ�ͬ������Ϣ
 * 3��ͨ��socket�����receive�����յ������ݴ����Ѷ���õ����ݰ���
 * 4��ͨ�����ݰ���������й��ܣ�����Щ��ͬ������ȡ������ӡ�ڿ���̨
 * 5���ر���Դ
 *
 */
public class UDPRecive_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test1();
	}
	private static void Test1() throws IOException {
		// TODO Auto-generated method stub
		//1������UPD����
		DatagramSocket dSocket = new DatagramSocket(9000);
		boolean flag = true;
		while(flag ){
			
		
		//2������һ�����ݰ������ڴ洢���յ�������
		byte[] data = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(data, data.length);
		//3��ͨ��UDPSocket��������
		dSocket.receive(dPacket);  //����ʽ����
		//4��ͨ�����ݰ��ķ���ȡ�����ݲ���ӡ
		sop(dPacket.getAddress().getHostAddress());
		sop(dPacket.getPort());
		sop(new String(dPacket.getData(),0,dPacket.getLength()));
		}
		//5���ر���Դ
		dSocket.close();
	}
	static void sop(Object obj){
		System.out.println(obj);
	}
}