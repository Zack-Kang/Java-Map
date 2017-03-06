package com.study.thread;

/**
 * �̼߳�ͨѶ��
 * ��ʵ���Ƕ���߳��ڲ���ͬһ��Դ
 * ���ǲ����Ķ�����ͬ
 * 
 * notify()/notifyAll()
 * �������̵߳��ô˶����notify��������notifyAll����ǰ�����µ�ǰ�̵߳ȴ������仰˵���˷�������Ϊ�ͺ�������ִ��wait(0)����һ����
 * ��ǰ�̱߳���ӵ�д˶��������
 * 
 * 
 * wait()
 * niitify()/notifyAll()
 * ��ʹ����ͬ���У���Ϊ��Ҫ�Գ��м��������������̲߳���
 * ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž������ĸ���
 * 
 * 
 * Ϊʲô��Щ�����̵߳ķ���Ҫ������Object�����أ�
 * ��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������̳߳��е�����
 * ֻ��ͬһ�����ϵı��ȴ��߳̿��Ա�ͬһ�����ϵ�notify���ѣ������ԶԲ�ͬ���е��߳̽��л���
 * 
 * 
 * Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������
 * 
 * ��������������������Կ��Ա����������õķ�������Object���С�
 * 
 * 
 * 
 * ���ڶ�������ߺ������ߣ�
 * ΪʲôҪ����while�жϱ�ǣ�
 * ԭ���ñ����ѵ��߳���һ���жϱ�ǡ�
 * 
 * Ϊʲô����notifyAll��
 * ��Ϊ��Ҫ���ѶԷ��̣߳�
 * ��Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³����е������̶߳��ȴ���
 * 
 */

import static java.lang.System.*;

class Res {
	private String name;
	private String sex;
	private boolean flag = false;
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

class Input implements Runnable {

	private Res res = null;

	public Input(Res res) {
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

class Output implements Runnable {
	private Res res = null;

	public Output(Res res) {
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

public class ThreadTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Res res = new Res();
		new Thread(new Input(res)).start();
		new Thread(new Output(res)).start();
	}

}