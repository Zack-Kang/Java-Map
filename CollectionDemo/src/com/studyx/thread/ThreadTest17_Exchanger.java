package com.studyx.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * Exchanger��
 * ����ʵ�������߳�֮�����ݽ���ÿ���߳������һ�������������Է��������ݣ���һ���ó����ݵ��˽�һֱ�ȴ�
 * �ڶ����������ݵ���ʱ�����ܱ˴˽�������
 *  
 * 
 * 
 * 
 * 
 */

public class ThreadTest17_Exchanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		Exchanger<String> exchanger = new Exchanger<>();

		executorService.submit(new Runnable() {		
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						String data = "�߳�1������";
						System.out.println("�߳�"+Thread.currentThread().getName()+" ���ڰ����ݣ�"+data+"����ȥ");
						Thread.sleep((long) (Math.random()*1000));
						data = exchanger.exchange(data);
						System.out.println("�߳�"+Thread.currentThread().getName()+"�������ݣ�"+data);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
							
				}
			});
		
		executorService.submit(new Runnable() {		
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					String data = "�߳�2������";
					System.out.println("�߳�"+Thread.currentThread().getName()+" ���ڰ����ݣ�"+data+"����ȥ");
					Thread.sleep((long) (Math.random()*1000));
					data = exchanger.exchange(data);
					System.out.println("�߳�"+Thread.currentThread().getName()+"�������ݣ�"+data);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
						
			}
		});

	}
//	�߳�pool-1-thread-1 ���ڰ����ݣ��߳�1�����ݻ���ȥ
//	�߳�pool-1-thread-2 ���ڰ����ݣ��߳�2�����ݻ���ȥ
//	�߳�pool-1-thread-2�������ݣ��߳�1������
//	�߳�pool-1-thread-1�������ݣ��߳�2������
	
}

