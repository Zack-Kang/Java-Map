package com.study.thread;

/**
 * Daemon�̵߳��������ڳ���������ڼ��ں�̨�ṩһ��"����"���񣬵����������ڳ���
 * ��һ����������
 * setDaemon()�����̱߳��Ϊ�ػ��̻߳����û��̣߳�
 * 1�����������е��̶߳����ػ��߳�ʱ��Java������˳���һ�����з�Daemon�߳���ɣ�����Ҳ����ֹ����
 * 2���÷��������������߳�ǰ����
 * 3������ʹ��isDaemon()����߳��Ƿ���Daemon��
 * 4��һ��Daemon�̣߳����������κ��߳�Ҳ���Զ��߱�Daemon����
 * 
 * 
 * 
 * 
 * 
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class StopThread1 implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(true){
			out.println(Thread.currentThread().getName()+" running....");
		}
	}
	
}

public class ThreadTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopThread1 stopThread = new StopThread1();
		Thread t1 = new Thread(stopThread);
		t1.setDaemon(true);
		Thread t2 = new Thread(stopThread);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num = 0;
		while(true){
			if (num++==60){
				break;
			}
			out.println(Thread.currentThread().getName()+" running...."+num);
		}
	}

}