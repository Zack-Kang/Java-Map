package com.study.base;
/**
 * �Ӹ����й��캯��
 * �ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ�����У�
 * ������Ϊ����Ĺ��캯��Ĭ�ϵ�һ����һ����ʽ��super();
 * super()����ʸ����пղ����Ĺ��캯���������������еĹ��캯��Ĭ�ϵ�һ�ж���super()
 * 
 * 
 * 
 * Ϊʲô����һ��Ҫ���ʸ���Ĺ��캯����
 * ��Ϊ���ุ���е������������ֱ�ӻ�ȡ��������������ڽ���ʱ��Ҫ�鿴��������ζ���Щ���ݽ��г�ʼ���ģ���������
 * �ڶ����ʼ��ʱ����Ҫ�ȷ������¸���Ĺ��캯��
 * ���Ҫ���ʸ�����ָ���Ĺ��캯��������ͨ���ֶ�����super���ķ�ʽ��ָ��
 * 
 * ע�⣺super����д�ڹ��캯���ĵ�һ�У��ȳ�ʼ�����࣬���ʼ������
 * 
 * 
 *
 * �����ʵ��������
 * ���ۣ�
 * ��������й��캯����Ĭ�϶�����ʸ����пղεĹ��캯������Ϊ����ÿһ�����캯���ĵ�һ�ж���һ����ʽsuper
 * 
 * ��������û�пղεĹ��캯��ʱ����������ֶ�ͨ��super�����ʽ��ָ��Ҫ���ʵĸ����еĹ��캯��
 * ��Ȼ���๹�캯���ĵ�һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯�������������ٻ���һ�����캯������ʸ����еĹ��캯��
 */

import static java.lang.System.*;

class Fu{
	Fu(){
		out.println("Fu run");
	}
}

class Zi extends Fu{
	Zi(){
		//super();  ���캯��ǰ��һ��super();
		out.println("Zi run");
	}
	
	Zi(int i)//���ڵ���super,��Ϊthis�е��ù�super�����
	{
	   this();   //this��super����ͬʱ�����ڹ��캯�������Ǳ��붼д�ڵ�һ�� 	����Ϊ��ʼ��������Ҫ����
	}
}

class Fu1{
	/*Fu1(){
		out.println("Fu run");
	}*/
	Fu1(int i){
		out.println("Fu run"+1);
	}
}

class Zi1 extends Fu1{

	/*public Zi1() {
		// TODO Auto-generated constructor stub
	}*/
	Zi1(int i) {
		super(i); //����û���޲ι��캯��ʱ�����������ʽ���ø���Ĺ��캯��
		// TODO Auto-generated constructor stub
	}
	
}

public class InheritedTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zi z = new Zi();
	}

}

/*class Person2{
	private String name;

	public Person2(String name) {
		this.name = name;
	}
	
}

class Student2 extends Person2{
	public Student2(String name){
		super(name);  //����д�ڹ��캯���ĵ�һ�У��ȳ�ʼ�����࣬���ʼ������
	}
}*/


