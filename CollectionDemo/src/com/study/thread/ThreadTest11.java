package com.study.thread;

/**
 * stop�����Ѿ���ʱ
 * ���ֹͣ�̣߳�
 * ֻ��һ�ַ�����run��������
 * �������߳����У����д���ͨ����ѭ���ṹ
 * 
 * ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽���
 * 
 * ���������
 * ���̴߳��ڶ��ᣨwait,sleep��join��״̬�Ͳ����ȡ��ǣ���ô�߳̾Ͳ������
 * 
 * ��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬ʱ����ʱ��Ҫ�Զ���������
 * ǿ�����ָ̻߳�������״̬��������Ҫ�Ϳ��Բ���������߳̽���
 * 
 * ��ôThread�����ṩ�˸÷�������interrupt()����
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class StopThread implements Runnable{

	private boolean flag = true;
	
	public void changeFlag(){
		flag = false;
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.println(Thread.currentThread().getName()+" "+e.getMessage());
				flag = false;
			}
			out.println(Thread.currentThread().getName()+" running....");
		}
		out.println(Thread.currentThread().getName()+" over");
	}
	
}

public class ThreadTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopThread stopThread = new StopThread();
		Thread t1 = new Thread(stopThread);
		Thread t2 = new Thread(stopThread);
		
		t1.start();
		t2.start();
		
		int num = 0;
		while(true){
			if (num++==60){
				t1.interrupt();
				t2.interrupt(); 
				break;
			}
			out.println(Thread.currentThread().getName()+" running...."+num);
		}
	}

}