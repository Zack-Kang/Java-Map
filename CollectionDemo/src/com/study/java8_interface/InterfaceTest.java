package com.study.java8_interface;

/**
 * JDK8�ӿ�:
 * JDK7�汾��������ǰ�汾�еĽӿ�
 * ���巽ʽ��
 *    interface ����ӿ�
 *    ������public abstract ����ֵ    ��������(����);
 *    ʹ�ã�����һ�����࣬ʵ�ֽӿڣ����½ӿ��е�ȫ�����󷽷�
 *    ����֮��Ķ���
 * JDK8�ӿڱ�����ǰ�İ汾���ܴ�ı仯
 * ���νӴ�8�汾�ĳ�����Ա����ϰ��
 *     JDK8�еĽӿڿ���д�������ˣ�����
 *     
 *     ���Զ��徲̬�ķ��������ǳ��󣬾���ʵ�ֵ�
 *     ֱ��ʹ�ýӿ�������
 *     
 *     �ӿ��в������徲̬�ķ����������Զ�����ͨ�ķ��������ǳ����
 *     JDK8�ӿ�������ʹ�ùؼ���default
 *     default�����Ĭ�Ϸ�����һ���Ǿ�̬�ķ���
 *     ��̬������ֱ�ӽӿ�������
 *     ���ڷǾ�̬������ֻ���Ƕ������
 *     ���ǽӿڲ��ܽ�������
 *     
 *     ��Ҫ����ʵ������ӿڣ���������Ķ�����ýӿ��е�Ĭ�Ϸ���
 *     
 *     ��������У�java�еĳ���ֻ��֧�ֵ��̳�
 *     һ���ֻ࣬�ܼ̳�һ����
 *     �ӿں��࣬�ǿ��Զ�ʵ�ֵ�
 *     ��̳����ǻ��а�ȫ�����ģ���ʵ���࣬û�а�ȫ����
 *     class A{
 *       void a(){}
 *     }
 *     class B{
 *       void a(){}
 *     }
 *     class C extends A,B{
 *     }
 *     new C().a();   //��֪�����õ����ĸ�����ķ���
 *     
 *     interface A{
 *         void a();
 *     }
 *     interface B{
 *         void a();
 *     }
 *     class C implements A,B{
 *       void a(){}
 *     }
 *     new C().a();  //��Ȼ�ӿ�A��B����a()����������ʵ����������ֻʵ����һ��
 *     
 *     JDK8����ʵ�ֶ���ӿڣ���˼�ǲ���Java8֧�ֶ�̳����أ���
 *    
 *     �������ӿ��ж�����ͬ���ľ�̬������
 *     ������ʵ����ͬʱʵ���˶���ӿڣ�������ʹ��ʵ���������ýӿڵķ���
 *     
 *     �������ӿ��ж�����ͬ����Ĭ�Ϸ���
 *     ʵ����ʵ�ֶ���ӿ�ʱ��������д��Ĭ�Ϸ������������ʧ��
 *     
 *     JDK8��֧�ֶ�̳�
 *     ������Ҫ��ʵ����ʵ�ֶ���ӿ��д�����ͬ��Ĭ�Ϸ���
 *     
 *     �ӿ��еľ�̬�����Ƿ���Ա�ʵ������д��
 *     ��дû�����⣬������д��ʵ����� ����.���� 
 *     ���õ���ʵ����ķ���
 *     ����㲻��д��ʵ��. ���ܵ��ýӿ��еľ�̬����
 *     
 *     
 * 
 * 
 * 
 *
 */
/**
 * JDK8�еĽӿ�
 * 
 *
 */

interface Inter8{
	
	public static final int i = 0;
	//����һ����̬�Ĵ��з�����ķ���
	//�ӿڲ��ܽ������󣬾�̬����������Ҫ����
	//�ӿ�������
	public static void medth(){
		System.out.println("�ӿ��е�static����");
		//Inter8 i = new Inter8();  //�ӿڲ����Զ������
	}
	
	//����ӿ��е�Ĭ�Ϸ���,����Ҫ��default�ؼ���
	//��������ǷǾ�̬�ģ������������ã���Ҫ֮��Ķ���
	public default void medthDefault(){
		System.out.println("�ӿ��е�default����");
	}
}

//������ʵ��Inter8�ӿ�
class Inter8Impl implements Inter8{
	//��д�ӿ��е�Ĭ�Ϸ��������ܴ��йؼ���default
	public void medthDefault(){
		System.out.println("ʵ������д�ӿ��е�default����");
	}
}


interface Inter8A{
	public static void a(){
		System.out.println("�ӿ�A�ľ�̬����a");
	}
	
	//����A�ӿڵ�Ĭ�Ϸ���
	public default void defaultMedth(){
		System.out.println("�ӿ�A��Ĭ�Ϸ���defaultMedth");
	}
}

interface Inter8B{
	public static void a(){
		System.out.println("�ӿ�B�ľ�̬����a");
	}
	
	//����B�ӿڵ�Ĭ�Ϸ���,��A�ӿڱ���һ��
	public default void defaultMedth(){
		System.out.println("�ӿ�B��Ĭ�Ϸ���defaultMedth");
	}
}

//ͬʱʵ�ֽӿ�A��B
class CClass implements Inter8A, Inter8B{

	//ʵ����ǿ�Ƹ��Ǹ����ͻ����
	@Override
	public void defaultMedth() {
		// TODO Auto-generated method stub
		Inter8B.super.defaultMedth();
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ӿ��з�������
		Inter8.medth();
		//ʹ��������󣬵��ýӿ��е�Ĭ�Ϸ���
		Inter8Impl inter8Impl = new Inter8Impl();
		inter8Impl.medthDefault();
		//ʵ���಻�ܵ��ýӿ����еľ�̬����
		//inter8Impl.medth();
		//���ýӿ��еľ�̬������������
		int i =inter8Impl.i;
		//ʹ�ö�̬���ص㣬�ӿ�ָ���Լ���ʵ���࣬���÷���
		Inter8 inter8 = new Inter8Impl();
		inter8.medthDefault();
		
		//ʵ������������ýӿ��еľ�̬����
		//ʵ������������ܵ��ýӿ��еľ�̬����a();
		//CClass.a();
		CClass c = new CClass();
		c.defaultMedth();
	}

}
