package com.study.thread;

/**
 * ���̣���һ������ִ�еĳ���
 *           ÿһ������ִ�ж���һ��ִ�е�˳�򣬸�˳�����һ��ִ��·�������߽�һ�����Ƶ�Ԫ��
 *           
 * �̣߳����ǽ����е�һ�������Ŀ��Ƶ�Ԫ���߳��ڿ����Ž��̵�ִ��
 * 
 * һ��������������һ���̡߳�
 * 
 * java�����������ʱ�����һ������java.exe
 * �ý�����������һ���߳��ڸ���java�����ִ�У���ʵ��ֹ�����и����������յ��̣߳���
 * ��������߳����еĴ��������main�����У�
 * ���̳߳�֮Ϊ���߳�
 * 
 * ��չ����ʵ��ϸ��˵��jvm��jvm������ֹһ���̣߳����и����������ջ��Ƶ��߳�
 * 
 * ������Զ�������ж���һ���̣߳�
 * Thread��
 * �����̵߳ĵ�һ�ַ�ʽ���̳�Thread�࣬������run����
 * ���裺
 * 1���̳�Thread��
 * 2����дThread���е�run����
 *    Ŀ�ģ����Զ���Ĵ���洢��run�����У����߳�����
 * 3�������̵߳�start�������÷������������ã�1�������̣߳�2������run����
 * 
 * 
 * �������н��ÿ�ζ���ͬ����Ϊ����̶߳��ڻ�ȡCPU��ִ��Ȩ��CPUִ�е�˭˭�����У�����ԣ�����ȷһ�㣬��ĳһ��ʱ�̣�ֻ����һ�����������У���˳��⣩
 * CPU�����ſ��ٵ��л����Դﵽ����ȥͬʱ���е�Ч����
 * 
 * 
 * ΪʲôҪ����run�����أ�
 * Thread���������̡߳�
 * ���ඨ����һ�����ڴ洢�߳�Ҫ���еĴ��룬�ô洢���ܾ���run����
 * 
 * Ҳ����˵Thread���е�run���������ڴ洢�߳���Ҫ���еĴ���
 * 
 * 
 * �̵߳�״̬
 * 
 * ������
 * ����(sleepʱ�䵽��notify)
 * ���ᣨsleep��wait��
 * ����
 * 
 * static Thread currentThread()����ȡ��ǰ�̶߳���
 * getName():��ȡ�߳�����
 * 
 * 
 * 
 * 
 * 
 */

class Demo extends Thread{
	public Demo(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0;i<60;i++){
			System.out.println(this.getName()+" thread demo run:"+ i);
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo threadDemo1 = new Demo("���߳�1");   //����һ���߳�
		threadDemo1.start();             //ִ���߳�
		Demo threadDemo2 = new Demo("���߳�2");   //����һ���߳�
		threadDemo2.start();  
		for(int i =0;i<60;i++){
			System.out.println(Thread.currentThread().getName() +" main demo run:"+ i);
		}
	}

}
