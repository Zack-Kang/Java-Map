package com.studyx.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * �̣߳�
 * ���߳����أ�ͨ�����߳�������������
 * 
 * ��ʱ����
 * quartz
 * 
 * �ڲ��಻�ܶ��徲̬����
 * 
 * 
 *
 */

public class ThreadTest2_Traditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("timer:"+Thread.currentThread().getName());
			}
		}, 1000,2000);
		
		//new Timer().schedule(task, firstTime, period);
	}

}
