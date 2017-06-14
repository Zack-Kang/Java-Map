package com.study.thread;

/**
 * ͨ�����������ִ�ӡ�����ظ��͸���
 * 
 * ���̵߳����г����˰�ȫ����
 * �����ԭ�򣺵���������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣���û��ִ���꣬��һ���̲߳�����������¹������ݴ���
 * 
 * ����취���Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���꣬��ִ�й����������̲߳����Բ������С�
 * 
 * 
 * java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ��
 * ����ͬ�������
 * synchrcnized(����){
 *     ��Ҫ��ͬ���Ĵ���
 * }
 * ������ͬ�������������߳̿�����ͬ����ִ��
 * û�г��������̼߳�ʹ��ȡcpuִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ��
 * 
 * 
 * 
 * ��Щ������Ҫ��ͬ����Щ���뱻�������
 * 
 * ͬ����ǰ�᣺
 * 1������Ҫ�����������������ϵ��߳�
 * 2�������Ƕ���߳�ʹ��ͬһ����
 * 
 * ���뱣֤ͬ����ֻ����һ���߳���ִ��
 * 
 * 
 * �ô�������˶��̵߳İ�ȫ����
 * �׶ˣ�����̶߳���Ҫ�ж�������Ϊ������Դ
 * 
 * Thinking java
 * ���ڷ���ĳ���ؼ�������Դ�����з������������������Ϊsynchronized,����Ͳ��������ع�����
 * 
 * ͬ����Ч�ʣ�
 * ��ȡһ��������һ��"����"������Ϊһ�η����ĵ��ø����Ĵ���(������˳���������ִ�з�������)�����ۼ�
 * ���ı������Ҹ��ݾ���ʵ�ַ�������һ���ۻ������ܱ�ø��ߡ����Լ�����֪һ������������ɳ�ͻ��������
 * ���������ǳ������е�synchronized�ؼ��֡�
 * 
 */



class Ticket2 implements Runnable{
	private static int tick = 100;
	
	public Ticket2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			synchronized(this){
				if (tick>0){
				
				System.out.println(Thread.currentThread().getName()+" sale:"+tick--);
			  }
			}	
		}
	}
}


public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ticket2 Ticket2 = new Ticket2();
		Thread thread1 = new Thread(Ticket2);
		Thread thread2 = new Thread(Ticket2);
		Thread thread3 = new Thread(Ticket2);
		Thread thread4 = new Thread(Ticket2);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
