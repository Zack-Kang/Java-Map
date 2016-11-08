package com.study.thread;

/**
 * void setPriority(int newPriority): 1~10��
 * MAX_PRIORITY,MIN_PRIORITY,NORM_PRIORITY
 * 
 * yield():
 * ��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������߳�
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class YieldRunnable implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<70;i++){
			out.println(Thread.currentThread().toString()+" running...."+i);
			Thread.yield();
		}
	}
	
}

public class ThreadTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldRunnable runnable = new YieldRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		/*int num = 0;
		while(true){
			if (++num==70){
				break;
			}
			out.println(Thread.currentThread().toString()+" running...."+num);
		}*/
		out.println(Thread.currentThread().getName()+" over");
	}
}