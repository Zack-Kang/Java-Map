package com.study.thread;

/**
 * Lock/Condition
 * JDK1.5�ṩ�˶��̵߳��������������
 * ��ͬ��synchronized�滻����ʵ��Lock����
 * ��Object�е�wait��notify,notifyAll���滻����condition����
 * �ö������ͨ��Lock�����л�ȡ
 * 
 * ��������ʵ���˱���ֻ���ѶԷ�����
 */

import static java.lang.System.*;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Res1 {
	private String name;
	private String sex;
	private int count = 0;
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	public void set(String name, String sex) throws InterruptedException {
		lock.lock();
		try {
			while (flag) {
				condition_pro.await();
			}
			this.name = name + " " +count++;
			this.sex = sex;
			flag = true;
			out.println("�����ߣ�"+Thread.currentThread().getName()+"  "+this.name + "  " + sex);
			condition_con.signal();
		} finally {
			lock.unlock();
		}
	}

	public void out() throws InterruptedException {
		lock.lock();
		try{
			while (!flag){
				condition_con.await();
			}
			out.println("�����ߣ�"+Thread.currentThread().getName()+"  "+name + "  " + sex);
			condition_pro.signal();
			flag = false;
		}finally{
			lock.unlock();
		}
		
	}

}

class Input1 implements Runnable {

	private Res1 res = null;

	public Input1(Res1 res) {
		// TODO Auto-generated constructor stub
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				res.set("mike", "man");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Output1 implements Runnable {
	private Res1 res = null;

	public Output1(Res1 res) {
		// TODO Auto-generated constructor stub
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Res1 res = new Res1();
		new Thread(new Input1(res)).start();
		new Thread(new Input1(res)).start();
		new Thread(new Output1(res)).start();
		new Thread(new Output1(res)).start();
	}

}