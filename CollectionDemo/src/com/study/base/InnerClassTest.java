package com.study.base;

import com.study.base.Outer.Inter;

/**
 * �ڲ��ࣺ��һ���ඨ������һ��������棬�������Ǹ���ͳ�Ϊ�ڲ���
 * �����ص㣺
 * 1���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�г�Ա
 *    ֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ������һ���ⲿ������ã���ʽ���ⲿ����.this
 * 2�����ⲿ��Ҫ�����ڲ����˽�г�Ա�����н����ڲ���Ķ���
 *
 *
 * 
 * 
 * ���ʸ�ʽ��
 * 1�����ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�У��������ⲿ�������п���ֱ�ӽ����ڲ������
 *    ��ʽ���ⲿ����.�ڲ�����  ������ = �ⲿ�����.�ڲ������
 *    Outer.Inter inter = new Outer().new Inter();
 * 2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η�������
 *    ���磬private ���ڲ������ⲿ���н��з�װ
 *    static��static����ʱ���ڲ���;߱���static����
 *    ���ڲ��౻static����ʱ��ֻ��ֱ�ӷ����ⲿ���е�static��Ա,�����˷��ʾ���
 *    
 *    ���ⲿ�������У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա��
 *    Outer.Inter2 inter2 = new Outer.Inter2();
 *    
 *    ���ⲿ�������У����ֱ�ӷ���static�ڲ���ľ�̬��Ա��
 *    Outer.Inter2.function1();
 * 
 * 
 * ע�⣺
 * ���ڲ����ж����˾�̬��Ա�����ڲ��������static��
 * ���ⲿ���о�̬���������ڲ���ʱ���ڲ���Ҳ�����Ǿ�̬�ģ�������һ��new Outer().new Inter().show();
 * 
 * 
 * ����������ʱ��������ڲ�����������������ڲ�����������
 * ��Ϊ�ڲ���������ʹ���ⲿ�����������
 * 
 * 
 * 
 */



class Outer{
	private int x= 3;
	
	class Inter{   //�ڲ���
		int x = 4;
		void  function(){
			int x = 5;
			System.out.println("�ڲ��ࣺ"+x);
			System.out.println("�ڲ��ࣺ"+this.x);
			System.out.println("�ڲ��ࣺ"+Outer.this.x);
		}
		
		/*static void  function2(){  //���ڲ����ж����˾�̬��Ա�����ڲ��������static��
			int x = 5;
			System.out.println("�ڲ��ࣺ"+x);
		}*/
		
		void show(){
			System.out.println("�ڲ��� show��"+x);
		}
	}
	
	public static void function(){
		new Outer().new Inter().show();;
	}
	
	private class Inter1{   //�ڲ�����Ա�˽������
		void  function(){
			System.out.println("˽���ڲ��ࣺ"+x);
		}
	}
	
	static class Inter2{   //��̬�ڲ���
		void  function(){
			//System.out.println("˽���ڲ��ࣺ"+x);  //��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա����
		}
		
		static void  function1(){
			//System.out.println("˽���ڲ��ࣺ"+x);  //��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա����
		}
	}
	
	void method(){
		System.out.println(x);
		Inter in = new Inter();
		in.function();
	}
}
public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer outer = new Outer();
		//outer.method();
		//ֱ�ӷ����ڲ���ĳ�Ա
		Outer.Inter inter = new Outer().new Inter();
		inter.function();
		//���ʾ�̬�ڲ���ķǾ�̬��Ա
		Outer.Inter2 inter2 = new Outer.Inter2();
		inter2.function();
		//���ʾ�̬�ڲ���ľ�̬��Ա
		Outer.Inter2.function1();
		
		Outer.function();
	}

}
