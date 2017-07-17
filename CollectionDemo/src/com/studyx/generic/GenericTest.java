package com.studyx.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

/**
 * ���ͣ�
 * �������ṩ��javac������ʹ�õģ������޶������е��������ͣ��ñ�������ס
 * Դ�����еķǷ����룬���������������˵�����ļ���ʱ����ȥ�������͡���Ϣ��
 * ʹ��������Ч�ʲ���Ӱ�죬���ڲ�������������Ϣ��getClass���������ķ���
 * ֵ��ԭʼ������ȫһ�������ڱ��������Ķ��ֽ����ȥ�����͵ġ����͡���Ϣ��ֻ
 * Ҫ���������������Ϳ�����ĳ�����ͼ����м����������͵����ݣ����磬�÷���
 * �õ����ϣ��ٵ�����add�������ɡ�
 * 
 * ���������Ͳ����ǲ����ļ̳й�ϵ
 * Vector<String> v = new Vector<Object>();  //����
 * Vector<Object> v = new Vector<String>();  //����
 * �ڴ�������ʵ��ʱ�������Ԫ�ز���ʹ�ò�����������
 * Vector<String> vlist[] = new Vector<String>[10];  /err
 * 
 * ע�����׶κ����н׶ε�����
 * 
 * Vector v1 = new Vector<String>();
 * Vector<Object> v2 = v1             //û��
 */
public class GenericTest {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		test();
	}

	private static void test() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		System.out.println(strlist.getClass()==intList.getClass());  //true   javac������ȥ������������Ϣ

		ArrayList<Integer> cl = new ArrayList<>();
		cl.getClass().getMethod("add", Object.class).invoke(cl, "abc");
		System.out.println(cl.get(0));   //abc
		
		//Vector<String> vlist[] = new Vector<String>[10];   //error
		
		 Vector v1 = new Vector<String>();
		 Vector<Object> v2 = v1;      //ok
	}

}
