package com.studyx.thread;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * �̳߳�
 * 
 * 
 * 
 * 
 * 
 */

public class ThreadTest8_excutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����̶���С���̳߳�
		//ExecutorService threadPool = Executors.newFixedThreadPool(3);
		//���������̳߳�
		//ExecutorService threadPool = Executors.newCachedThreadPool();
		//������һ�̳߳�(���ʵ���߳���������������)
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		for (int j=0;j<10;j++){
			final int ii = j;
			threadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int i=0;i<10;i++){
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+" is looping of " +i+" pool task is "+ ii);
					}
				}
			});
		}
		System.out.println("All of task have commited");
		//threadPool.shutdown();
		//threadPool.shutdownNow();
		
		//��ʱ���̳߳أ�10���Ժ�ִ��
		Executors.newScheduledThreadPool(3).schedule(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("bombing");
			}
		}, 10, TimeUnit.SECONDS);
		//�̶�Ƶ�ʣ�5���ÿ��2��ִ��һ��
		Executors.newScheduledThreadPool(3).scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("bombing");
			}
		}, 5,2 , TimeUnit.SECONDS);
		//��ʱ��ָ��ִ��ʱ���ȥ��ǰʱ��
		
	}

}


