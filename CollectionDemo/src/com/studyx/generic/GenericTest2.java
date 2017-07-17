package com.studyx.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

/**
 * ���ͣ�
 * 
 * ͨ���
 * "?"
 * ʹ��"?"ͨ��������������������������ͣ�"?"ͨ�������ı�����Ҫ�������ã�
 * ���Ե�����������޹صķ��������ܵ�����������йصķ�����
 * 
 * ͨ�������չ
 * �޶�ͨ������Ͻ�
 * Vector<? extends Number> x = new Vector<Integer>() //ok
 * Vector<? extends Number> x = new Vector<String>() //err
 * 
 * �޶�ͨ������½�
 * Vector<? extends super> x = new Vector<Number>() //ok
 * Vector<? extends super> x = new Vector<Byte>()   //err
 *
 * �޶�ͨ������ǰ����Լ�
 * 
 * ���ͷ���
 * 
 * ������
 * dao data access object-->crud
 * 
 * 
 * 
 */
public class GenericTest2 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		test();
	}

	private static void test() throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("sdf");
		list.add("ewe");
		list.add("dfg");
		printCollection(list);

		//Vector<Date> v1 = new Vector<Date>();
		Method method = GenericTest2.class.getMethod("applyVector",Vector.class);
		Type[] types = method.getParameterTypes();
		System.out.println(types[0]);  //class java.util.Vector
		System.out.println(method.getGenericParameterTypes()[0]);  //java.util.Vector<java.util.Date>
		System.out.println(((ParameterizedType)(method.getGenericParameterTypes()[0])).getRawType());   //class java.util.Vector
		System.out.println(((ParameterizedType)(method.getGenericParameterTypes()[0])).getActualTypeArguments()[0]);  //class java.util.Date
	}
	
	public static void applyVector(Vector<Date> v1){
		
	}

	private static void printCollection(Collection<?> collection) {
		// TODO Auto-generated method stub
		System.out.println(collection.size());
		for (Object obj : collection){
			System.out.println(obj);
		}
		//collection.add("dfd");  //error
		collection = new HashSet<Date>();  //ok
	}
	
	private static <T> void printCollection1(Collection<T> collection, T t) {
		// TODO Auto-generated method stub
		System.out.println(collection.size());
		for (Object obj : collection){
			System.out.println(obj);
		}
		collection.add(t);  //ok
	}
	
	private static void printCollection2(Collection<Object> collection) {
		// TODO Auto-generated method stub
		System.out.println(collection.size());
		for (Object obj : collection){
			System.out.println(obj);
		}
		collection.add("dfd");  //ok
		//collection = new HashSet<Date>();  //error
	}
}
