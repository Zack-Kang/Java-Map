package com.study.io;
/**
 * Math:
 * abs() //ȡ����ֵ
 * Ceil  //����ȡ�������ش���ָ�����ֵ���С������
 * floor //����ȡ��������С��ָ�����ֵ������������
 * round //��������
 * pow(a,b)   //��������
 * random   //����� ���ڵ���0��С��1���������α�������  ����Χ��random>=0&&random<1��  java.util.Random
 * 
 */

import static java.lang.System.*;

import java.util.Random;
public class MathTest_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ȡ��
		out.println("����ȡ��"+Math.ceil(-3.14));
		out.println("����ȡ��"+Math.ceil(3.14));
		//����ȡ��
		out.println("����ȡ��"+Math.floor(-3.14));
		out.println("����ȡ��"+Math.floor(3.14));
		//��������
		out.println("��������"+Math.round(12.34));
		out.println("��������"+Math.round(12.56));
		//��������
		out.println("��������"+Math.pow(3,3));
		out.println("��������"+Math.pow(2,3));
		//�����
		out.println("�����"+Math.random());
		out.println("�����"+Math.random());
		Random random = new Random();
		out.println("�����"+random.nextInt(10)+1);

	}

}
