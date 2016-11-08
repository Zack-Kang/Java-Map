package com.study.thread;

/**
 * join()
 * ��A�߳�ִ�е���B�̵߳�join()����ʱ��A�ͻ�ȴ�����B�̶߳�ִ���꣬A�Ż�ִ��
 * 
 * 
 * join����������ʱ�����߳�ִ��
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class JoinRunnable implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<7000;i++){
			out.println(Thread.currentThread().getName()+" running...."+i);
		}
	}
	
}

public class ThreadTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinRunnable joinRunnable = new JoinRunnable();
		Thread t1 = new Thread(joinRunnable);
		Thread t2 = new Thread(joinRunnable);
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int num = 0;
		while(true){
			if (++num==70){
				break;
			}
			out.println(Thread.currentThread().getName()+" running...."+num);
		}
		out.println(Thread.currentThread().getName()+" over");
	}
}