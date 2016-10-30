package com.study.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map���ϣ��ü��ϴ洢��ֵ�ԡ�һ��һ������棬����Ҫ��֤����Ψһ��
 * 1�����
 * 		put(key,value)
 * 		putAll(Map<? extends E,? extends V> m)
 * 2��ɾ��
 * 		clear()
 * 		value = remove(key)
 * 		
 * 3���ж�
 * 		boolean containsKey(Object key)
 * 		boolean containsValue(Object value)
 * 		isEmpty()
 * 4����ȡ
 * 		get(Key)
 * 		size()
 *      Collection values()
 *      
 *      entrySet()
 *      keySet()
 *		
 *���ࣺ
 *	HashTable:�Ͳ��ǹ�ϣ�����ݽṹ�������Դ���null����nullֵ,�������Ķ������ʵ��hashCode��equals,�ü������߳�ͬ����
 *	HashMap���Ͳ��ǹ�ϣ�����ݽṹ��������ʹ��null����nullֵ���ü������̷߳�ͬ����Ч�ʸ�
 *	TreeMap���Ͳ��Ƕ������ṹ���̲߳�ͬ�����������ڸ�map�����еļ���������
 *
 *
 *
 *��Set������ʵSet�Ͳ����ʹ��Mapʵ��
 *
 *
 * Map���ϵ�����ȡ����ʽ
 * 1��keySet:��map�����еļ����뵽Set���ϣ���ΪSet�߱������������Կ��Ե�����ʽȡ�����еļ���
 *    �ٸ���get��������ȡÿһ������Ӧ��ֵ
 *    Map����ȥ��ԭ����map����ת��Set���ϣ���ͨ��������ȡ��
 *
 * 2��Set<Map.entry<k,v>> entrySet:��map�����е�ӳ���ϵ���뵽��Set�����У�
 * 	     �������ϵ���������;���Map.Entry
 * 	  Map.Entry:��ʵEntryҲ��һ���ӿڣ�����map�ӿ��е�һ���ڲ��ӿ�
 * 
 *	  interface Map{
 *	      public static interface Entry{
 *		      public abstract Object getKey();
 *            public abstract Object getValue();
 *		  }
 *	  }
 *
 *	  class HashMap implements Map{
 *	     public Haha implements Map.Entry{
 *	          public Object getKey(){};
 *            public  
 *            Object getValue(){};
 *		 }
 *	  }
 *	  
 *}
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hashMap = new HashMap<String,String>();
		//���Ԫ��������������ͬ�ļ�������ӵ�ֵ�Ḳ��ԭ�е�ֵ��put�����᷵�ر����ǵ�ֵ
		System.out.println("put:"+hashMap.put("map1", "mapvalue1"));
		System.out.println("put:"+hashMap.put("map1", "mapvalue22"));
		hashMap.put("map2", "mapvalue2");
		hashMap.put("map3", "mapvalue3");
		hashMap.put("map4", "mapvalue4");
		hashMap.put(null, "mapvalue4");
		hashMap.put("map5", null);
		System.out.println("containsKey:"+hashMap.containsKey("map1"));
		
		System.out.println("containsKey:"+hashMap.get("map2"));
		System.out.println("get:"+hashMap.get("map22"));//����ͨ��get�����ķ���ֵ�ж�һ�����Ƿ���ڣ�ͨ������null���ж�
		System.out.println("null:"+hashMap.get(null));
		System.out.println(hashMap);
		
		Collection<String> ct = hashMap.values();
		System.out.println(ct);
		
		Map<String,String> hashMap1 = new HashMap<String,String>();
		hashMap1.put("map1", "mapvalue1");
		hashMap1.put("map2", "mapvalue22");
		hashMap1.put("map1", "mapvalue2");
		hashMap1.put("map6", "mapvalue3");
		hashMap1.put("map5", "mapvalue4");
		hashMap1.put(null, "mapvalue4");
		
		//�Ȼ�ȡMap�����м���Set���ϣ�keySet()
		Set<String> keySet = hashMap1.keySet();
		
		//����Set���ϣ��Ϳ��Ի�ȡ�������
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(hashMap.get(key)); 
		}
		
		//��map�е�ӳ���ϵȡ��
		Set<Map.Entry<String, String>> setEntry = hashMap.entrySet();
		Iterator<Map.Entry<String, String>> mapIt = setEntry.iterator();
		while(mapIt.hasNext()){
			Map.Entry<String, String> entry = mapIt.next();
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue()); 
		}
	}

}
