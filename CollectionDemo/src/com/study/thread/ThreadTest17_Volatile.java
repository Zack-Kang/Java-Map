package com.study.thread;

/**
 * Volatile
 * ����
 * Volatile���Կ�����һ����������synchronized���������ڶ��̲߳���������±�֤�����ġ��ɼ��ԡ���
 * ʲô�ǿɼ��ԣ�������һ���̵߳Ĺ����ڴ����޸��˸ñ�����ֵ���ñ�����ֵ�����ܻ��Ե����ڴ��У�
 * �Ӷ���֤���е��߳̿������������ֵ��һ�µġ������ڴ���ͬ�����������������ã��������Ŀ�����synchronizedС��ʹ�óɱ����͡� 
 * �ٸ����ӣ���д����ģʽ�У������þ�̬�ڲ����⣬����һ��д��Ҳ�ǳ��ܻ�ӭ������Volatile+DCL��
 * public class Singleton {
 *     private static volatile Singleton instance;
 * 
 *     private Singleton() {
 *     }
 * 
 *     public static Singleton getInstance() {
 *         if (instance == null) {
 *             synchronized (Singleton.class) {
 *                 if (instance == null) {
 *                     instance = new Singleton();
 *                 }
 *             }
 *         }
 *         return instance;
 *     }
 * }
 * ���������������ĸ��߳��д����ģ������̶߳��ǹ�����������ġ�
 * 
 * ��˵���Volatile�ؼ��ֿ��Խ�����̻߳����µ�ͬ�����⣬������Ҳ����Եģ���Ϊ�������в�����ԭ���ԣ�Ҳ���������ʺ��ڶԸñ�����д���������ڱ��������Լ���
 * �ٸ���򵥵����ӣ��ڽ��м�������ʱcount++��ʵ����count=count+1;��count���յ�ֵ�������������ֵ������ʹ��volatile���εı����ڽ�����ôһϵ�еĲ�����ʱ�򣬾��в��������� 
 * �ٸ����ӣ���Ϊ�������в�����ԭ���ԣ��п���1���߳��ڼ�������д����ʱcountֵΪ4����2���߳̾�ǡ�û�ȡ��д����֮ǰ��ֵ4������1���߳����������д������countֵ��Ϊ5�ˣ�
 * ����2���߳���count��ֵ��Ϊ4����ʹ2���߳��Ѿ������д����count����Ϊ5����������������count����Ϊ6�������������в��������⡣�����count����������count=num+1������num��ͬ���ģ�
 * ��ô����count��û�в���������ģ�ֻҪ���յ�ֵ�������Լ�����
 * 
 * �÷�
 * 
 * ��Ϊvolatile�����в�����ԭ���ԣ����������volatile���εı����ڽ���������������Ĳ���ʱ�����в������⣬�磺count������������д�ڲ����������Ǵﲻ���κ�Ч���ģ�
 * public class Counter {
 *     private volatile int count;
 * 
 *     public int getCount(){
 *         return count;
 *     }
 *     public void increment(){
 *         count++;
 *     }
 * }
 * 
 * ��Ҫ��count���ڲ��������б������ݵ�һ���ԣ��������increment()�м�synchronizedͬ�������Σ��Ľ����Ϊ��
 * 
 * public class Counter {
 *     private volatile int count;
 * 
 *     public int getCount(){
 *         return count;
 *     }
 *     public synchronized void increment(){
 *         count++;
 *     }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import static java.lang.System.*;

import java.util.concurrent.atomic.AtomicInteger;


public class ThreadTest17_Volatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Res2 res = new Res2();
		new Thread(new Input2(res)).start();
		new Thread(new Output2(res)).start();
	}

}