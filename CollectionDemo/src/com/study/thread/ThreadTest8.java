package com.study.thread;

/**
 * 线程间通讯：
 * 其实就是多个线程在操作同一资源
 * 但是操作的动作不同
 * 
 * niitify()/notifyAll()
 * 在其他线程调用此对象的notify方法或者notifyAll方法前，导致当前线程等待。换句话说，此方法的行为就好像它仅执行wait(0)调用一样。
 * 当前线程必须云游此对象监视器
 * 
 * 
 * wait()
 * niitify()/notifyAll()
 * 都使用在同步中，因为需要对持有监视器（锁）的线程操作
 * 所以要使用在同步中，因为只有同步才具有锁的概念
 * 
 * 
 * 为什么这些操作线程的方法要定义在Object类中呢？
 * 因为这些方法在操作同步中线程时，都必须要标识他们所操作线程持有的锁，
 * 只有同一个锁上的被等待线程可以被同一个锁上的notify唤醒，不可以对不同锁中的线程进行唤醒
 * 
 * 
 * 也就是说，等待和唤醒必须是同一个锁。
 * 
 * 而锁可以是任意对象，所以可以被任意对象调用的方法定义Object类中。
 * 
 * 对于多个生产者和消费者，
 * 为什么要定义while判断标记，
 * 原因：让被唤醒的线程再一次判断标记。
 * 
 * 为什么定义notifyAll，
 * 因为需要唤醒对方线程，
 * 因为只用notify，容易出现只唤醒本方线程的情况，导致程序中的所有线程都等待。
 * 
 * 
 */

import static java.lang.System.*;

class Resource{
	private String name;
	private int Count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name){
		while (flag){ //if (flag)  //出现多个生产者多个消费者需要使用while判断标记
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name+"--"+ Count;
		Count++;
		out.println(Thread.currentThread().getName()+"--生产者--"+this.name);
		notifyAll();//notify();  //出现多个生产者多个消费者需要使用notifyAll唤醒所有线程
		flag = true;
	}
	
	public synchronized void out(){
		while (!flag){  //if (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.println(Thread.currentThread().getName()+"--消费者--"+this.name);
		notifyAll();//notify();
		flag = false;
	}
}


class Producer implements Runnable{

	private Resource res;

	public Producer(Resource res) {
		super();
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			res.set("+商品+");
		}
	}
	
}

class Consumer implements Runnable{
	private Resource res;

	public Consumer(Resource res) {
		super();
		this.res = res;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			res.out();
		}
	}
}

public class ThreadTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new Resource();
		new Thread(new Producer(res)).start();
		new Thread(new Producer(res)).start();
		new Thread(new Consumer(res)).start();
		new Thread(new Consumer(res)).start();
	}

}