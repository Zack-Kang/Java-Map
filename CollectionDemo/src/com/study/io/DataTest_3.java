package com.study.io;

import java.util.Date;

/**
 * Data:
 * ��ʾ�ض���˲�䣬��ȷ������
 * 
 * ���캯����
 * Data()
 * Data(Long time)
 * 
 *
 * 
 */
import static java.lang.System.*;

import java.text.SimpleDateFormat;
public class DataTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		out.println(d.toString());  //��ӡ�����ڿ�������ϣ����Щ��ʽ
		//��ģʽ��װ��SimpleDateFormat������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��E hh:mm:ss");
		//����Format������ģʽ��ʽ��ָ����Date����
		String str = sdf.format(d);
		out.print(str);
	}

}
