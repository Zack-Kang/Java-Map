package com.study.utils.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * �߼�forѭ��
 * 
 * ��ʽ��
 * for (��������  ������:�������ļ��ϣ�Collection����������){
 * 
 * }
 * 
 * �Լ��Ͻ��б���
 * ֻ�ܻ�ȡԪ�أ����ǲ��ܶԼ��Ͻ��в���
 * 
 * ���������˱����������Խ���remove�����е�Ԫ�صĶ���
 * 
 * ���ʹ��ListIterator���������ڱ����Ĺ����жԼ��Ͻ�����ɾ�Ĳ�Ķ���
 * 
 * 
 * ��ͳforѭ���͸߼�forѭ����ʲô����
 * �߼�for��һ�������ԣ������б�����Ŀ�꣨�������1��100�����֣�
 * 
 * �����ڱ��������ʱ����ʹ�ô�ͳforѭ������Ϊ��ͳforѭ������ʹ�ýǱ�
 * 
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("list1sdgsg");
		list.add("list4");
		list.add("list3qw");
		list.add("list2as");
		list.add("list6zxzd");
		list.add("list2a");
		list.add("list0aqrg");
		System.out.println(list);
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		for (String s: list){
			//s = "kk";  ֻ�ܶ�Ԫ�ض�ȡ���޷��޸�
			System.out.println(s);
		}
		System.out.println(list);
		
		
		int[] arr = {3,4,5};
		for (int i: arr){
			//i = 1;
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
		
		//
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(2, "fd");
		hashMap.put(1, "qw");
		hashMap.put(4, "as");
		hashMap.put(3, "fd");
		
		Set<Integer> setKey = hashMap.keySet();
		for (Integer key:setKey){
			System.out.println(hashMap.get(key));
		}
 
		for (Entry<Integer, String> entrySet:hashMap.entrySet()){
			System.out.println(entrySet.getKey()+" "+entrySet.getValue());
		}
		
		
	}

}
