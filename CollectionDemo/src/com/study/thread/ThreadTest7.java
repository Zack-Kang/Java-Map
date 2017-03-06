package com.study.thread;

/**
 * ������
 * ͬ����Ƕ��ͬ��
 * 
 * �����������ĸ���Ҫ������
 * ��1�� ����������һ����Դÿ��ֻ�ܱ�һ������ʹ�á�
 * ��2�� �����뱣��������һ��������������Դ������ʱ�����ѻ�õ���Դ���ֲ��š�
 * ��3�� ����������:�����ѻ�õ���Դ����ĩʹ����֮ǰ������ǿ�а��ᡣ
 * ��4�� ѭ���ȴ�����:���ɽ���֮���γ�һ��ͷβ��ӵ�ѭ���ȴ���Դ��ϵ��
 */

import static java.lang.System.*;

class Ticket7 implements Runnable {
	private static int tick = 100;
	public boolean flag = true;
	Object obj = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			while (true) {
				synchronized (obj) {
					System.out.println("if:"+obj.getClass().getName());
					synchronized (this) {
						System.out.println("if:"+this.getClass().getName());
					}
				}
			}
		} else {
			synchronized (this) {
				System.out.println("else:"+this.getClass().getName());
				synchronized (obj) {
					System.out.println("else:"+obj.getClass().getName());
					
				}
			}
		}

	}
}

public class ThreadTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket7 t = new Ticket7();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();
		
	}

}