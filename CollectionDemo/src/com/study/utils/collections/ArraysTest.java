package com.study.utils.collections;

import java.util.Arrays;
import java.util.List;


/**
 * Arrays�����ڲ�������Ĺ�����
 * ���涼��Щ��̬����
 * 
 * asList����������list����
 * ����ʹ�ü����еķ�����������
 * ������任�ɼ��ϲ�����ʹ�ü��ϵ���ɾ��������Ϊ���ݵĳ����ǹ̶��ģ������ɾ�˾ͻᷢ��UnsupportedOperationException
 * 
 * ��������е�Ԫ���Ƕ���ʱ����ô��ɼ���ʱ�����е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ��
 * ��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ��������Ϊ�����еĶ������
 */


public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = {1,23,54,21,32};
		System.out.println(Arrays.toString(arr));
		String[] strs = {"asa","aas","dsd","gdsd","asa"};
		List<String> list = Arrays.asList(strs);
		//list.add("qq");   //������任�ɼ��ϲ�����ʹ�ü��ϵ���ɾ����
		System.out.println(list);*/
		
		int[] arr = {1,23,54,21,32};
		List list = Arrays.asList(arr);
		System.out.println(list);
		List<int[]> li = Arrays.asList(arr);
		System.out.println(li);
		
		Integer[] arr1 = {1,23,54,21,32};
		List list1 = Arrays.asList(arr1);
		System.out.println(list1);
	}

}

