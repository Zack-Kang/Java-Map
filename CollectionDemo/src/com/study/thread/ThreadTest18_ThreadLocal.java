package com.study.thread;

/**
 * http://tanfujun.com/2016/07/03/Thread-Future-FutureTask-CompletableFuture-ThreadLocal-%E5%AD%A6%E4%B9%A0/
 * Callable
 * Callable��һ�������������ͽӿڣ�����ֻ��һ��call���������Ǹ÷������з���ֵ�ģ����ҷ���ֵ���;��ǲ������͡�
 * 
 * Future
 * ��Callable�ӿ�������ʹ�õľ���Future�ӿڣ������þ������������첽����Ľ���� ������һ���첽���㣬Future�ӿ���һ��������������ֱ�������ѯ�Ϳ����߳����е�״̬�ͽṹ��
 * boolean cancel (boolean mayInterruptIfRunning) ȡ�������ִ�С�����ָ���Ƿ������ж�����ִ�У����ߵȵ��������
 * boolean isCancelled () �����Ƿ��Ѿ�ȡ���������������ǰ����ȡ�����򷵻� true, boolean isDone () �����Ƿ��Ѿ���ɡ���Ҫע������������������ֹ���쳣��ȡ������������true
 * V get () throws InterruptedException, ExecutionException �ȴ�����ִ�н�����Ȼ����V���͵Ľ����InterruptedException �̱߳��ж��쳣�� ExecutionException����ִ���쳣���������ȡ���������׳�CancellationException
 * V get (long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException ͬ�����get����һ�����������ó�ʱʱ�䡣����timeoutָ����ʱʱ�䣬uintָ��ʱ��ĵ�λ����ö����TimeUnit������صĶ��塣����� �㳬ʱ�����׳�TimeoutException
 * 
 * FutureTask
 * ʵ�ʵ������м����ǻ��и����Ļ����Ǿ���FutureTask��װ�������ɽ�Callableת����Future��Runnable����ͬʱ��ʵ�������ߵĽӿڵġ�ʹ�����ַ�ʽ���Կ����̳߳�ʱ�ȵ�
 * 
 * CompletableFuture
 * Java 8 ��������
 * 
 * ThreadLocal
 * ThreadLocal��һ�����ڴ����ֲ߳̾��������ࡣ
 * ͨ������£����Ǵ����ı����ǿ��Ա��κ�һ���̷߳��ʲ��޸ĵġ���ʹ��ThreadLocal�����ı���ֻ�ܱ���ǰ�̷߳��ʣ������߳����޷����ʺ��޸ġ�
 * ͬһ��ThreadLocal�ڲ�ͬ���߳��д��ڲ�ͬ��ֵ
 * �޸�ThreadLocal��ʼֵ:
 * ThreadLocal<String> mThreadLocal = new ThreadLocal<String>() {
 *     @Override
 *     protected String initialValue() {
 *       return Thread.currentThread().getName();
 *     }
 * };
 * 
 * 
 */

import static java.lang.System.*;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest18_ThreadLocal {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "hello";
        }
    };
    static class MyRunnable implements Runnable{
        private int num;
        public MyRunnable(int num){
            this.num = num;
        }
        @Override
        public void run() {
            threadLocal.set(String.valueOf(num));
            System.out.println("threadLocalValue:"+threadLocal.get());
        }
    }

    public static void main(String[] args){
    	
        new Thread(new MyRunnable(1)).start();
        new Thread(new MyRunnable(2)).start();
        new Thread(new MyRunnable(3)).start();
        //res
        //���н�����£���ЩThreadLocal���������߳��ڲ�����ģ�����Ӱ��
        /*
        threadLocalValue:2
        threadLocalValue:3
        threadLocalValue:1
        */
    }
}
