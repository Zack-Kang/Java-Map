package com.study.utils.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ���ϱ�����
 * Collection�ӿ��е�toArray����
 * 
 *
 */
public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > list = new ArrayList<>();
		list.add("asd");
		list.add("ds");
		list.add("asads");
		/*
		 * ָ�����͵����鵽��Ҫ����೤�أ�
		 * ��ָ�����͵����鳤��С���˼��ϵ�size,��ô�÷����ڲ��ᴴ��һ���µ����飬����Ϊ���ϵ�size
		 * ��ָ�����͵����鳤�ȴ����˼��ϴ�size,�Ͳ����´������飬����ʹ�ô��ݽ���������
		 * ���Դ���һ���ոպõ���������
		 * 
		 * ΪʲôҪ�����ϱ����飿
		 * Ϊ�޶���Ԫ�صĲ���������Ҫ������ɾ��
		 */
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		String[] arr1 = list.toArray(new String[5]);
		System.out.println(Arrays.toString(arr1));
		String[] arr2 = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr2));
	}

}
