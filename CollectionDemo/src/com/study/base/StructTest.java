package com.study.base;
/**
 * �����ʼ�����̣�
 * Person p = new Person("zhangsan", 28);
 * 1����Ϊnew�õ���Person.class�ļ�,���Ի����ҵ�Person.class�ļ������ص��ڴ���
 * 2��ִ�и����static����飬����еĻ�����Person.class����г�ʼ��
 * 3���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ
 * 4���ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ����null��0�ȣ�
 * 5�������Խ�����ʽ��ʼ��
 * 6���Զ�����й��������ʼ��
 * 7���Զ�����ж�Ӧ�Ĺ��캯����ʼ��
 * 8�����ڴ��ַ����ջ�е�p����
 *
 */

class Person{
	private String name;
	private int age;
	private String addr = "beijin";  //��ʽ��ʼ��
	private int id;
	
	{//��������
		id = 1;
		System.out.println("��������:"+"name:"+name+" age:"+age+" addr:"+addr+" id:"+id);
	}
	public Person(String name, int age) {  //���캯��
		super();
		this.name = name;
		this.age = age;
		System.out.println("���캯��:"+"name:"+name+" age:"+age+" addr:"+addr+" id:"+id);
	}
}

public class StructTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("zhangsan", 28);
	}

}
