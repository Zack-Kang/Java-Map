package com.study.base;

/**
 * �����ڲ��ࣺ
 * 1�������ڲ�����ʵ�����ڲ���ļ�д��ʽ
 * 2�����������ڲ����ǰ�᣺
 *    �ڲ������̳�һ������ʵ�ֽӿ�
 * 3�������ڲ���ĸ�ʽ��
 *    new ������߽ӿ�(){�������������}
 * 4����ʵ�����ڲ������һ������������󣬿������Ϊ�����ݵĶ���
 * 5�������ڲ����ж���ķ�����ò�Ҫ����3��
 * 
 *
 */

abstract class AbsInner{
	abstract void show();
}

class OuterClass1{
	int x = 3;
	class Inner extends AbsInner{  //�ڲ��ඨ���ھֲ������ܱ�static���Σ�Ҳ���ܶ��徲̬��Ա
		void function(){
			System.out.println("Inner:"+x);
		}

		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("Inner show:"+x);
		}
	}
	
	public void function(){ 
		new Inner().show();  //��������
	}
	
	public void function1(){ //�����ڲ���
		new AbsInner() {
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ��� show��"+x);
			}
		}.show();
		
        new AbsInner() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ��� show��"+x);
			}
			
			void show1(){
				System.out.println("�����ڲ�������show��"+x);
			}
		}.show1();
		
		AbsInner absinner = new AbsInner() {		
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ��� show��"+x);
			}
		};
		absinner.show();
	}
}



public class InterClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 outer = new OuterClass1();
		outer.function();
		outer.function1();
		
		Test2.function().method();
	}

}

//��ϰ
interface IInner{
	void method();
}

class Test2{
	//��ȫ���룬ͨ�������ڲ���
	
	static IInner function(){
		return new IInner(){
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
