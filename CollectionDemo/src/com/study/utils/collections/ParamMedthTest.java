package com.study.utils.collections;

/**
 * java 1.5�汾���ֵ�������
 * �ɱ����
 * 
 * �����Ŀɱ����
 * ��ʹ��ʱע�⣺�ɱ����һ��Ҫ�����ڲ����б�����
 */

public class ParamMedthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show(3,4);
		
		//int[] arr = {2,3,4,5};
		//show(arr);
		
		//��Ȼ�ٶ����˶������������ÿһ�ζ�Ҫ����һ��������Ϊʵ�ʲ���
		
		/**
		 * �ɱ����
		 * ��ʵ����ǰһ����������ļ�д��ʽ��
		 * ����ÿ���ֶ������������
		 * ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ���
		 * ��ʽ�ĵĽ���Щ������װ��������
		 */
		show();
		show(2);
		show(2,2,3,45,6);
		show("hahaha",2,3,45,6);
	}
	
	/*public static void show(int a, int b){
		System.out.println(a+" "+b);
	}*/
	
/*	public static void show(int[] arr){
		
	}*/
	
	public static void show(int... ar){
		System.out.println(ar.length);
	}
	
	public static void show(String str,int... ar){
		System.out.println(str+":"+ar.length);
	}

}
