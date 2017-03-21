package com.study.base;

/**
 * �ӿڣ�
 * interface���ڶ���ӿ�
 * 
 * 
 * �ӿڶ���ʱ����ʽ�ص�
 * 1���ӿ��г������壺���������󷽷�
 * 2���ӿ��еĳ�Ա���й̶����η�
 *    ������public static final   ȱ�ٹؼ���ϵͳ���Զ�����
 *    ������public abstract
 * 
 * 
 * 
 * ��ס���ӿ��еĳ�Ա����public��
 * 
 * 
 * �ӿڣ��ǲ����Դ�������ģ���Ϊ�г��󷽷���
 * ��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ����
 * ����������һ��������
 * 
 * �ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��java֧�ֶ�ʵ��
 * 
 * 
 * ������֮��̳й�ϵ������ӿ�֮��ʵ�ֹ�ϵ���ӿ���ӿ�֮��̳й�ϵ
 * �ӿ�֮����Լ̳У��Ҵ��ڶ�̳�
 */


interface Inter{
	public static final int NUM = 0;
	public static int NUM1 = 1;
	public final int NUM2 = 2;
	int NUM3 = 3;
	
	public abstract void show();
}

class SubInter implements Inter{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//NUM = 1;  //�ӿ��еĳ�Ա�������ǳ����������޸�
	}
}


interface Inter1{
	public abstract void show();
	public abstract void method();
}

class Test{
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("class show");
	}
}

abstract class Test1{
	public abstract void show();
}

class SubMultInter implements Inter,Inter1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class SubMultInter1 extends Test implements Inter,Inter1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

class SubMultInter2 extends Test1 implements Inter,Inter1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

interface IA{
	public abstract void methodA();
}

interface IB extends IA{
	public abstract void methodB();
}

interface IC extends IB{
	public abstract void methodC();
}

class CD implements IC{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
	}
}

interface IE{
	public abstract void methodE();
}

interface IF extends IE,IC{  //�ӿ�֮����Զ�̳�
	public abstract void methodE();
}

class CG implements IF{

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodE() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Inter.NUM);
		System.out.println(Inter.NUM1);
		System.out.println(Inter.NUM2);
		System.out.println(Inter.NUM3);
		
	}

}
