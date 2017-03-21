package com.study.thread;

/**
 * http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
 * java.util.concurrent.atomic
 * ���С���߰���֧���ڵ��������Ͻ�������̰߳�ȫ���
 * ֧���ڵ��������Ͻ�������̰߳�ȫ��̡���ʵ�ϣ��˰��е���ɽ� volatile ֵ���ֶκ�����Ԫ�صĸ�����չ����ЩҲ�ṩԭ���������²�������
 * ��Щ�����Ĺ淶ʹʵ���ܹ�ʹ�õ������������ṩ�ĸ�Ч��������ԭ��ָ�������ĳЩƽ̨�ϣ���֧�ֿ�����Ҫĳ����ʽ���ڲ�����������÷��������ϸ�֤�������� - ִ�в���֮ǰ������ʱ�����̡߳�
 * 
 * 
 * Atomic����
 * ����ԭ�Ӳ����࣬Java��concurrent����������ҪΪ�����ṩ����ô�������õģ�AtomicInteger��AtomicLong��AtomicBoolean��AtomicReference<T>�� 
 * ����ԭ�Ӳ����࣬�����ص����ڶ��̲߳�������ͬһ����Դ������£�ʹ��Lock-Free�㷨�����������������С���ٶȿ죬����ԭ�Ӳ������ǲ���ԭ�Ӳ���ָ��ʵ�ֵģ�
 * �Ӷ����Ա�֤������ԭ���ԡ�ʲô��ԭ���ԣ�����һ������i++��ʵ������������ԭ�Ӳ������Ȱ�i��ֵ��ȡ��Ȼ���޸�(+1)�����д���i������ʹ��Atomicԭ�����������
 * ���磺i++����ô�������ⲽ�������������²����������߳��ٶ������в����������ʵ������ͨ��Lock-Free+ԭ�Ӳ���ָ����ȷ����
 * �磺 
 * AtomicInteger���У�
 *
 *  public final int incrementAndGet() {
 *     for (;;) {
 *        int current = get();
 *        int next = current + 1;
 *        if (compareAndSet(current, next))
 *           return next;
 *     }
 * }
 * ������Lock-Free�㷨������һ���µĲ������������֤��Դ�ڲ���ʱ�������Եģ�Lock-Free��ʵ����������
 *
 * 1��ѭ����for(;;)��while�� 
 * 2��CAS��CompareAndSet�� 
 * 3�����ˣ�return��break��
 * 
 * 
 * AtomicInteger
 * ������ԭ�ӷ�ʽ���µ� int ֵ���й�ԭ�ӱ������Ե�������AtomicInteger ������Ӧ�ó����У�����ԭ�ӷ�ʽ���ӵļ������������Ҳ��������滻 Integer�����ǣ�����ȷʵ��չ�� Number��������Щ�������������Ĺ��ߺ�ʵ�ù��߽���ͳһ���ʡ�
 * AtomicInteger() �������г�ʼֵ 0 ���� AtomicInteger
 * AtomicInteger(int initialValue) �������и�����ʼֵ���� AtomicInteger
 * int addAndGet(int delta) ��ԭ�ӷ�ʽ������ֵ�뵱ǰֵ���
 * boolean compareAndSet(int expect, int update) �����ǰֵ == Ԥ��ֵ������ԭ�ӷ�ʽ����ֵ����Ϊ�����ĸ���ֵ
 * int decrementAndGet() ��ԭ�ӷ�ʽ����ǰֵ�� 1
 * int get() ��ȡ��ǰֵ
 * int getAndAdd(int delta) ��ԭ�ӷ�ʽ������ֵ�뵱ǰֵ���
 * int getAndDecrement() ��ԭ�ӷ�ʽ����ǰֵ�� 1
 * int getAndIncrement() ��ԭ�ӷ�ʽ����ǰֵ�� 1
 * int getAndSet(int newValue) ��ԭ�ӷ�ʽ����Ϊ����ֵ�������ؾ�ֵ
 * int incrementAndGet() ��ԭ�ӷ�ʽ����ǰֵ�� 1
 * int intValue() �� int ��ʽ����ָ������ֵ
 * void	lazySet(int newValue) �������Ϊ����ֵ
 * long	longValue() �� long ��ʽ����ָ������ֵ
 * void	set(int newValue) ����Ϊ����ֵ
 * boolean weakCompareAndSet(int expect, int update) �����ǰֵ == Ԥ��ֵ������ԭ�ӷ�ʽ��������Ϊ�����ĸ���ֵ
 */

import static java.lang.System.*;

import java.util.concurrent.atomic.AtomicInteger;

class Res2 {
	private String name;
	private String sex;
	private boolean flag = false;
	AtomicInteger atomic;
	public synchronized void set(String name,String sex){
		while (flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		notifyAll();
	}

	public synchronized void out() {
		while (!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.println(name + "  " + sex);
		notifyAll();
		flag = false;
	}
	
	
}

class Input2 implements Runnable {

	private Res2 res = null;

	public Input2(Res2 res) {
		// TODO Auto-generated constructor stub
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;
		while (true) {	
				if (flag) {
					flag = false;
					res.set("mike", "man");
				} else {
					flag = true;
					res.set("lili", "woman");
				}
	
		}
	}
}

class Output2 implements Runnable {
	private Res2 res = null;

	public Output2(Res2 res) {
		// TODO Auto-generated constructor stub
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			res.out();
		}
	}
}

public class ThreadTest16_atomic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Res2 res = new Res2();
		new Thread(new Input2(res)).start();
		new Thread(new Output2(res)).start();
	}

}