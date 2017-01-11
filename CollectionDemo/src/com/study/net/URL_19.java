package com.study.net;

import java.net.MalformedURLException;
import java.net.URL;
/*
 String	getFile() 
          ��ȡ�� URL ���ļ�����
 String	getHost() 
          ��ȡ�� URL ����������������ã���
 String	getPath() 
          ��ȡ�� URL ��·�����֡�
 int	getPort() 
          ��ȡ�� URL �Ķ˿ںš�
 String	getProtocol() 
          ��ȡ�� URL ��Э�����ơ�
 String	getQuery() 
          ��ȡ�� URL �Ĳ�ѯ���֡�
 */
public class URL_19 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.google.co.jp/?gfe_rd=cr&ei=WlJ2WKvuN8GE2QS70oPgAg");
		sop("getProtocol:"+url.getProtocol());
		sop("getHost:"+url.getHost());
		sop("getPath:"+url.getPath());
		sop("getPort:"+url.getPort());//
		sop("getFile:"+url.getFile());
		sop("getQuery:"+url.getQuery());
		int port = url.getPort();
		if (port==-1){   //getPort()����-1����Ĭ�϶˿�Ϊ80
			port = 80;
		}
	}

	private static void sop(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
	}

}
