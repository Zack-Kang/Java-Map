package com.study.thread;

/**
 * ������
 * Ϊ���ٳ��������Ŀ��ܡ�java1.2�������ʹ��stop��suspend��resume��destroy����
 * ֮���Է���stop������Ϊ����ȫ�����������̻߳�ȡ�����������������������һ�ֲ�����״̬��
 * ��ô�������߳̿���������״̬�¼����޸����ǣ�������һ��΢��ľ��棬���Ǻ��Ѽ���������
 * �������ڡ�����Ӧ�þ�������ʹ��stop����һ����־�����߳�ʲôʱ��ͨ���Ƴ��Լ���run��������ֹ�Լ���ִ��
 * ���һ���̱߳��������������ڵȺ������ʱ����ôһ�㶼������ѯһ����־��������������£�������Ȼ��
 * Ӧ��ʹ��stop����Ӧ�û���thread�ṩ��interrupt������һ����ֹ���Ƴ��������롣
 * Thread��destroy��������û��ʵ��
 * 
 * 
 * 
 * 
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class ThreadTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldRunnable runnable = new YieldRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		for (int i=0;i<100;i++){
			out.println(Thread.currentThread().getName()+" over");
		}
		out.println(Thread.currentThread().getName()+" over");
	}
}