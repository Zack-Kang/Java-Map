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

/**
 * �����ࣨ�����������ͣ���
 * ��ʲôʱ���巺����
 * ������Ҫ�����������������Ͳ�ȷ��ʱ��
 * ���ڶ���Object�����չ
 * ���ڶ��巺���������չ
 */

/**
 * ���ͷ���
 * �����ඨ��ķ���������������Ч�����������ʹ�ã���ô��������ȷҪ������������ͺ�����Ҫ���������Ͷ��Ѿ�ȷ����
 * Ϊ���ò�ͬ�ķ������Բ�����ͬ�����ͣ��������ͻ���ȷ������ô���Խ����Ͷ����ڷ�����
 * 
 */

/**
 * ���;�̬����
 * ��̬���������Է������϶���ķ���
 * �����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ�����
 */

/**
 * ���ͽӿ�
 * 
 * 
 */

//������
class Print<T>{
	public void println(T t){
		System.out.println("print:"+t);
	}
	
	public void show(T t){
		System.out.println("show:"+t);
	}
}

//���ͷ���
class Show{
	public <T> void println(T t){
		System.out.println("print:"+t);
	}
	
	public <T> void show(T t){
		System.out.println("show:"+t);
	}
}

//������ͷ��ͷ���
class PShow<P>{
	public void println(P p){
		System.out.println("print:"+p);
	}
	
	//���ͷ���
	public <T> void show(T t){
		System.out.println("show:"+t);
	}
	
	/*public static void method(P p){
		System.out.println("show:"+p);
	}*/
	
	//��̬����
	public static <W> void method(W w){
		System.out.println("show:"+w);
	}
}

interface Inter<T>{
	void show(T t);
}

/*class InterImp implements Inter<String>{
	@Override
	public void show(String t) {
		// TODO Auto-generated method stub
		System.out.println("show:"+t);
	}
}*/

class InterImp<T> implements Inter<T>{
	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println("show:"+t);
	}
}

public class GenericTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Print<String> p = new Print();
		//p.show(new Integer(4));
		p.println("haha");*/
		
		/*Show s = new Show();
		s.show("haha");
		s.println(new Integer(6));*/
		
		/*PShow<String> ps = new PShow<String>();
		ps.show(new Integer(6));
		ps.println("haha");
		//ps.println(new Integer(5));
		*/
		
		/*PShow<String> ps = new PShow<String>();
		ps.show(new Integer(6));
		ps.println("haha");
		PShow.method("hehe");*/
		
		/*InterImp i =new InterImp();
		i.show("hehe");*/
		
		InterImp<String> i = new InterImp();
		i.show("haha")
		;
	}

}
