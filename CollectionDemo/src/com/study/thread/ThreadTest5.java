package com.study.thread;

/**
 * ���ͬ����������̬���Σ�ʹ�õ�����ʲô��
 * 
 * ͨ����֤���ֲ�����this�ˣ���Ϊ��̬�����в����Զ���this
 * 
 * ��̬���ڴ�ʱ�ڴ���û�б�����󣬵���һ���и�����ֽ����ļ�����
 * ����.class   �ö����������Class
 * 
 * 
 * ��̬��ͬ������ʹ�õ����Ǹ÷�����������ֽ�������ļ���Ҳ����:����.class
 */

import static java.lang.System.*;


class Ticket4 implements Runnable {
	private static int tick = 100;
	public boolean flag = true;

	Ticket4(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			while (true) {
				try {
						Thread.sleep(20);
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
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				show();
			}
		}

	}

	static synchronized void show() {
		if (tick > 0) {
			/*try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			if (tick > 0) {
				System.out.println("show sale:" + tick--);
			}
		}
	}
}


public class ThreadTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ticket4 ticket1 = new Ticket4(true);
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