package com.study.thread;

/**
 *           
 * ���󣺼򵥵���Ʊ����
 * �������ͬʱ��Ʊ
 * 
 * �����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * ���裺
 * 1��ʵ��Runnable�ӿ�
 * 2������Runnable�е�run����
 *        ���߳�Ҫ���еĴ�������run������
 * 3��ͨ��Thread�ཨ���̶߳���
 * 4����Runnable�ӿڵ����������Ϊʵ�ʲ�������Thread��Ĺ��캯��
 *        Ϊʲô��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯��
 *        ��Ϊ���Զ����run���������Ķ���ʱRunnable�ӿڵ��������
 *        ����Ҫ���߳�ȥָ��ָ�������run�������ͱ�����ȷ��run���������Ķ���
 * 5������Thread���start���������̲߳�����Runnable�ӿ������run����
 * 
 * 
 * ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�
 * ʵ�ַ�ʽ�ô��������˵��̳еľ�����
 * �ڶ����߳�ʱ����ʹ��ʵ�ַ�ʽ
 * �̳�Thread���̴߳�������Thread����run������
 * ʵ��Runnable���̴߳������ڽӿ������run������
 * 
 */

class Ticket extends Thread{
	private static int tick = 100;
	
	public Ticket(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true){
			if (tick>0){
				System.out.println(this.getName()+" sale:"+tick--);
			}
				
		}
	}
}

class Ticket1 implements Runnable{
	private static int tick = 100;
	
	public Ticket1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			if (tick>0){
				System.out.println(Thread.currentThread().getName()+" sale:"+tick--);
			}
				
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Ticket t1 = new Ticket("����1");
		Ticket t2 = new Ticket("����2");
		Ticket t3 = new Ticket("����3");
		Ticket t4 = new Ticket("����4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		Ticket1 ticket1 = new Ticket1();
		Thread thread1 = new Thread(ticket1);
		Thread thread2 = new Thread(ticket1);
		Thread thread3 = new Thread(ticket1);
		Thread thread4 = new Thread(ticket1);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
