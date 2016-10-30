package com.study.design;

/**
 * ���ģʽ�����ĳһ����������֮��Ч�ķ���
 * Java�е�23�����ģʽ��
 * ����ģʽ�����һ�������ڴ���ֻ����һ������
 * 
 * Ҫ��ȷ������Ψһ��
 * 1��Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������������
 * 2����Ϊ��������������Է��ʵ��������ֻ���ڱ����ж���һ������
 * 3��Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһ�·��ʷ�ʽ
 * 
 * 
 * ��������ô�ô��������أ�
 * 1�������캯��˽�л�
 * 2�������д���һ���������
 * 3���ṩһ���������Ի�ȡ���ö���
 */
//������ȳ�ʼ������
//����ʽ    Single��һ���ڴ���Ѿ��������˶���   ����һ����
class Single{
	
	private static Single instance = new Single();  //instance�ڷ�������Single�����ڶ���
	private Single(){}
	
	public static Single getInstance(){
		return instance;
	}
}

//����ʱ����������ʱ�ų�ʼ����Ҳ�����������ʱ����
//��Ϊ������ʽ    Single����ڴ����û�д��ڣ�ֻ�е�����getInstance����ʱ�Ž�������
class Single1{
	
	private static Single1 instance = null;
	private Single1(){}
	
	public static Single1 getInstance(){
		/*if (instance==null){
			instance = new Single1();
		}
		return instance;*/
		if (instance==null){
			synchronized(Single.class){  //�����˼�������
				if (instance==null){
					instance = new Single1();
				}
			}
		}
		return instance;
	}
}

//����һ��ʹ�ö���ʽ����ȫ������ʽ���߳�ʱ��Ҫ�������Ƚϵ�Ч
//��סԭ�򣺶��嵥��ʱ������ʹ�ö���ʽ

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single single = Single.getInstance();  //single��ջ��  ָ������е�Single����
	}
}
