package com.study.base;

/**
 * �ڲ��ඨ���ھֲ�ʱ��
 * 1���ڲ��ඨ���ھֲ�ʱ�����Ա���Ա���η�����
 * 2������ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�����ⲿ������ã�
 *    ���ǲ����Է��������ھֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�����??????
 * 
 * 
 * 
 *
 */


class OuterClass{
	int x = 3;
	void method(final int a){ 
		//a++;
		final int y = 4;
		/* int y = 4;
		y++;*/
		class Inner{  //�ڲ��ඨ���ھֲ������ܱ�static���Σ�Ҳ���ܶ��徲̬��Ա
			void function(){
				System.out.println("Inner:"+x+" y="+y+" a="+a);
			}
		}
		
		Inner inner = new Inner();
		inner.function();
	}
}



public class InterClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		outer.method(5);
		outer.method(6);
	}

}
