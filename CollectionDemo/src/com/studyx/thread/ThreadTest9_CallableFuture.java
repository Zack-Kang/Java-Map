package com.studyx.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/**
 * �̳߳�
 * 
 * 
 * 
 * 
 * 
 */

public class ThreadTest9_CallableFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		Future<String> future = threadPool.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				Thread.sleep(3000);
				return "Hello Thread Pool";
			}
		});
		System.out.println("�ȴ����");
		try {
			System.out.println("��������"+future.get(2,TimeUnit.SECONDS));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (TimeoutException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println("��������"+future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CompletionService�����ύһ��Callable������take������������ɵ�һ��Callable�����Ӧ��Future����
		ExecutorService excutor = Executors.newFixedThreadPool(10);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(excutor);
		for (int i=0;i<10;i++){
			final int finalI = i;
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					Thread.sleep(new Random().nextInt(5000));
					return finalI;
				}
			});
		
		}
		
		for (int i=0;i<10;i++){
			try {
				System.out.println("��������"+completionService.take().get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}


