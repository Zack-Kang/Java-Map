package com.study.thread;

/**
 * http://blog.csdn.net/u010687392/article/details/50549236
 * ThreadLocal
 * ����
 * ����ThreadLocal�������ĳ��ֲ�������������ڶ��̲߳�����������Դ�Ĺ�������ģ��������������ؼ��ֲ�һ�������������ؼ��ֶ��Ǵ��߳�������֤������һ���ԣ�
 * ����ʹ�ö���̷߳��ʵı�������һ���ԣ����Ը��õ����ֳ���Դ�Ĺ�����ThreadLocal����ƣ������ǽ����Դ��������⣬���������ṩ�߳��ڵľֲ�������
 * ����ÿ���̶߳��Լ������Լ��ľֲ�����������̲߳��������ݲ�����Ҳ���Ӱ�죬����Ӱ�죬���Բ����ڽ����Դ������ôһ˵������ǽ����Դ����
 * ��ô�����̲߳����Ľ����Ȼ����Ҫ��ȡ������ThreadLocal�����Լ������Լ��ģ��൱�ڷ�װ��Thread�ڲ��ˣ����߳��Լ�����
 * 
 * �÷�
 * һ��ʹ��ThreadLocal���ٷ��������Ƕ���Ϊprivate static ������ΪʲôҪ����ɾ�̬�ģ�����ڴ�й¶�йأ������ٽ��� 
 * ����������¶�ķ�����set��get��remove��
 * 
 * ����get��������ThreadLocalû��setֵ������£�Ĭ�Ϸ���null���������Ҫ��һ����ʼֵ���ǿ�����дinitialValue()��������û��setֵ������µ���get�򷵻س�ʼֵ��
 * ֵ��ע���һ�㣺ThreadLocal���߳�ʹ����Ϻ�����Ӧ���ֶ�����remove�������Ƴ����ڲ���ֵ���������Է�ֹ�ڴ�й¶����Ȼ������Ϊstatic��
 * 
 * �ڲ�ʵ��
 * ThreadLocal�ڲ���һ����̬��ThreadLocalMap��ʹ�õ�ThreadLocal���̻߳���ThreadLocalMap�󶨣�ά�������Map����
 * �����ThreadLocalMap��������ӳ�䵱ǰThreadLocal��Ӧ��ֵ����keyΪ��ǰThreadLocal�������ã�WeakReference
 * �ڴ�й¶����
 * 
 * 
 * 
 */

import static java.lang.System.*;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest19_Future {
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
