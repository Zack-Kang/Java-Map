package com.study.base;
/**
 * �Ӹ�����ֺ����г�Ա���ص�
 * ���г�Ա��
 * 1������
 * 2������
 * 3�����캯��
 * 
 * ������
 * ����Ӹ����г����˷�˽�е�ͬ����Ա����ʱ��
 * ����Ҫ���ʱ����еı�������this
 * ����Ҫ���ʸ����е�ͬ��������ʹ��super
 * 
 * super��ʹ�û�����thisһ��
 * this������Ǳ�����������
 * super������Ǹ�����������
 * 
 * ������
 * �Ӹ����к���
 * ��������ֺ͸���һ���ĺ���ʱ�����������ຯ���е�����
 * ��ͬ����ĺ���������һ��
 * ��������Ǻ�����һ�����ԣ���д�����ǣ�
 * 
 * 
 * ������̳��˸��࣬��Ϯ�˸���Ĺ��ܣ��������У�
 * ����������Ȼ���иù��ܣ����ǹ��ܵ����ݺ͸��಻һ����
 * ��ʱû�б�Ҫ�����¹��ܣ�����ʹ�ø������⣬��������Ĺ��ܶ��壬����д��������
 * 
 * ���ǣ�
 * 1�����า�Ǹ�����뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ��
 * 2����ֻ̬�ܸ��Ǿ�̬
 *
 *
 * ��ס��
 * ���أ�ֻ��ͬ�������Ĳ������
 * ��д���Ӹ��෽��һģһ������������ֵ����
 */


class A{
	int num=5;
	void show(){
		System.out.println("num="+num);
	}
	void showB(){
		System.out.println("num="+num);
	}
	
	void speck(){
		System.out.println("vb");
	}
}

class B extends A{
	int num=6;
	
	void show(){   //���ǡ���д
		System.out.println("num="+num+" this.num="+this.num+" super.num="+super.num);
	}
	
	void speck(){  //��д���๦�ܶ���
		System.out.println("java");
	}
}

//����ѿռ�  ��������class�ļ�ʱ���ȼ��ظ���class�ļ�
/**��**
 * new B()
 * 
 * num B
 * num A
 * 
 * 
 *
 */


public class InheritedTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.show();
		b.showB();
	}

}


class Tel{
	void show(){
		System.out.println("number");
	}
	
	private void show11(){
		System.out.println("number");
	}
}

class NewTel extends Tel{
	/*private void show(){  ����Ȩ�޴��ڵ��ڸ���
		//System.out.println("number");
		super.show();
		System.out.println("name");
		System.out.println("pic");
	}*/
	
	void show(){
		//System.out.println("number");
		super.show();
		System.out.println("name");
		System.out.println("pic");
	}
	
	void show11(){   //���Ǹ��ǣ����඼��֪�������дι���
		System.out.println("number");
	}
	
	/*int show11(){  //����
		System.out.println("number");
	}*/
}
