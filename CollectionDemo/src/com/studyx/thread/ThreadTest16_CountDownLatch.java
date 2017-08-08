package com.studyx.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
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
 * CountDownLatch��
 * ����ʱ������������CountDownLatch�����countDown�����ͽ���������1��������������0ʱ�������еȴ��߻򵥸��ȴ��߿�ʼִ�У�
 * 
 * 
 * 
 * 
 * 
 */

public class ThreadTest16_CountDownLatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch cyclicBarrier1 = new CountDownLatch(1);
		final CountDownLatch cyclicBarrier2 = new CountDownLatch(3);
		for (int i =0;i<3;i++){
			executorService.submit(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						System.out.println("�߳�"+Thread.currentThread().getName()+"��׼���������");
						cyclicBarrier1.await();
						System.out.println("�߳�"+Thread.currentThread().getName()+"�ѽ������");
						Thread.sleep((long) (Math.random()*1000));
						System.out.println("�߳�"+Thread.currentThread().getName()+"��Ӧ���������");
						cyclicBarrier2.countDown();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						
				}
			});
		}
		
		
		try {
			Thread.sleep((long) (Math.random()*1000));
			System.out.println("�߳�"+Thread.currentThread().getName()+"�����������");
			cyclicBarrier1.countDown();
			System.out.println("�߳�"+Thread.currentThread().getName()+"�Ѿ�����������ڵȴ������");
			cyclicBarrier2.await();
			System.out.println("�߳�"+Thread.currentThread().getName()+"�õ���������");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

