package com.study.thread;

/**
 * ����
 * ������һ����⣬�������������ֱ��300��ÿ�δ�100����3��
 * 
 * Ŀ�ģ��ó����Ƿ���ڰ�ȫ���⣬����У���ν����
 * 
 * ����ҵ�����
 * 1����ȷ��Щ�����Ƕ��߳����д���
 * 2����ȷ��������
 * 3����ȷ���߳����д�������Щ����ǲ����������ݵ�
 * 
 * 
 * ͬ��������ʽ������
 * public synchronized void function(){
 *     //ͬ������
 * }
 * 
 * ͬ�������õ�����һ������  this
 * ������Ҫ��������ã���ô��������һ�������������ã�����this
 * ����ͬ������ʹ�õ�����this
 * 
 * 
 * ͨ���ĳ��������֤
 * ʹ�������߳�����Ʊ��һ���߳���ͬ��������У�һ���߳���ͬ�������С�
 * ����ִ����Ʊ����
 * 
 */

import static java.lang.System.*;

class Back {
	private int sum;

	public synchronized void add(int n) {
		// synchronized (this) {
		this.sum += n;
		//
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("sum=" + sum);
		// }

	}
}

class Ticket3 implements Runnable {
	private static int tick = 100;
	public boolean flag = true;

	Ticket3(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			while (true) {
				try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				synchronized (this) {
					
					if (tick > 0) {
						System.out.println(Thread.currentThread().getName() + " sale:" + tick--);
					}
				}
			}
		} else {
			while (true) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				show();
			}
		}

	}

	synchronized void show() {
		if (tick > 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (tick > 0) {
				System.out.println("show sale:" + tick--);
			}
		}
	}
}

class Cus implements Runnable {

	private Back back = new Back();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x = 0; x < 3; x++) {
			back.add(100);
		}
	}

}

public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cus cus = new Cus();
		Thread thread1 = new Thread(cus);
		Thread thread2 = new Thread(cus);
		thread1.start();
		thread2.start();*/
		
		Ticket3 ticket1 = new Ticket3(true);
		Thread thread1 = new Thread(ticket1);
		Thread thread2 = new Thread(ticket1);
		thread1.start();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ticket1.flag = false;
		thread2.start();
	}

}