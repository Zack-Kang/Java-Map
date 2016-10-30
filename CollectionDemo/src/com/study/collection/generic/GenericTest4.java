package com.study.collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ���ͣ�1.5�Ժ�������ԣ����ڽ����ȫ���⣬��һ����ȫ����
 * �ô���
 * 1��������ʱ���ֵ�ClassCastExceptionת�Ƶ��˱���ʱ�ڣ������˳���Ա������⣬����������������٣���ȫ
 * 2��������ǿ������ת�����鷳
 * 
 *
 * ���͸�ʽ��ͨ��<>������Ҫ������������������
 * ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��ʹ�÷�ʡ�أ�
 * ͨ���ڼ��Ͽ���кܳ�����ֻҪ����<>��Ҫ���巺��
 * 
 * ��ʵ<>���������������͵�
 * 
 * ��ʹ�ü���ʱ����������Ҫ�洢������������Ϊ�������ݵ�<>�м���
 */

/**
 * �����ࣨ�����������ͣ���
 * ��ʲôʱ���巺����
 * ������Ҫ�����������������Ͳ�ȷ��ʱ��
 * ���ڶ���Object�����չ
 * ���ڶ��巺���������չ
 */

/**
 * �����޶�����
 * ��ͨ�����Ҳ�������Ϊռλ��
 * �����޶���
 * �� extends E:���Խ���E���ͻ���E�����࣬����
 * �� super E:���Խ���E���ͻ���E�ĸ����ͣ�����
 * 
 *
 */



public class GenericTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> al1 = new ArrayList<>();
		al1.add("list1");
		al1.add("list2");
		al1.add("list3");
		al1.add("list4");
		println(al1);
		
		ArrayList<Integer> al2 = new  ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		println(al2);*/
		
		ArrayList<P> plist = new ArrayList<>();
		plist.add(new  P("persion1"));
		plist.add(new  P("persion2"));
		plist.add(new  P("persion3"));
		plist.add(new  P("persion4"));
		printP(plist);
		
		ArrayList<S> slist = new ArrayList<>();
		slist.add(new  S("student1"));
		slist.add(new  S("student2"));
		slist.add(new  S("student3"));
		slist.add(new  S("student4"));
		//printP(slist);   error
		printPS(slist);
		
	}
	
	public static void printP(ArrayList<P> al){
		Iterator<P> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
	
	public static void printPS(ArrayList<? extends P> al){
		Iterator<? extends P> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
	
	/*public static void println(ArrayList<?> al){
		Iterator<?> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static <T> void println2(ArrayList<T> al){
		Iterator<T> it = al.iterator();
		while(it.hasNext()){
			T t = it.next();
			System.out.println(t);
		}
	}*/
	
	
}

class P{
	
	private String name;

	public P(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class S extends P{

	public S(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//private String 
}
