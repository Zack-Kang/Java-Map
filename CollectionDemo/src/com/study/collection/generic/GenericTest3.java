package com.study.collection.generic;

/**
 * ���ͣ�1.5�Ժ�������ԣ����ڽ����ȫ���⣬��һ����ȫ����
 * �ô���
 * 1��������ʱ���ֵ�ClassCastExceptionת�Ƶ��˱���ʱ�ڣ������˳���Ա������⣬����������������٣���ȫ
 * 2��������ǿ������ת�����鷳
 * 
 *
 * ���͸�ʽ��ͨ��<>������Ҫ������������������
 * ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��ʹ�÷�ʡ�أ�
 * ͨ���ڼ��Ͽ���кܳ�����ֻҪ����<>��Ҫ���巺��
 * 
 * ��ʵ<>���������������͵�
 * 
 * ��ʹ�ü���ʱ����������Ҫ�洢������������Ϊ�������ݵ�<>�м���
 */

/*
 * �����ࣨ�����������ͣ���
 * ��ʲôʱ���巺����
 * ������Ҫ�����������������Ͳ�ȷ��ʱ��
 * ���ڶ���Object�����չ
 * ���ڶ��巺���������չ
 */
class Worker{
	
}

class Student{
	
}


/*class Tool{
	private Worker worker;
	public void setWorker(Worker worker){
		this.worker = worker;
	}
	public Worker getWorker() {
		return worker;
	}
}*/

/*class Tool{
	private Object object;
	public void setObject(Object object){
		this.object = object;
	}
	public Object getObject() {
		return object;
	}
}*/

//������
class Utils<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}




public class GenericTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Tool t = new Tool();
		t.setWorker(new Worker());
		t.getWorker();*/
		
		/*Tool t = new Tool();
		t.setObject(new Worker());
		Worker worker = (Worker)t.getObject();*/
		
		Utils<Worker> u = new Utils<Worker>();
		u.setT(new Worker());
		Worker worker = u.getT();
	}

}
