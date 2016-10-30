package com.study.base;
/**
 * Object�ࣺ
 * �����ж����ֱ�ӻ��Ӹ��࣬�����ж��������ж��󶼾߱��Ĺ���
 * 
 * equals:java��Ϊ���ж��󶼾߱��Ƚ��ԣ������Խ��бȽ�
 * Ĭ�ϱȽϵ�����������ĵ�ַ
 * 
 * Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϺ�����
 * ����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶���
 * ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɣ�����Ǹ���
 * 
 * toString:���ж��󶼿��Ա���ַ�����ӡ  ������@����hashCode()
 * 
 * 
 * hashCode:
 * 
 * 
 * 
 * 
 * A.class 
 * B.class
 * ��Щclass�ļ���������
 * ��Щ�ļ����й��캯��
 * һ�㷽��
 * 
 * Class��������Щclass�ļ�      ���ļ�����
 * getName()  //��ȡclass�ļ�������
 */

class Demo{// extends Object{ //��ʽ����
	protected int num;
	public Demo(int num) {
		super();
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Demo){
			return this.num==((Demo) obj).num;
		}
		return false;
	}
}

class SubDemo extends Demo{

	public SubDemo(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "demo:"
				+ ""+num;
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = d1;
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d1==d3);*/
		
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(4);
		System.out.println(d1.equals(d2));
		System.out.println(d1.toString());
		System.out.println(d1.getClass().getName()+"@"+Integer.toHexString(d1.hashCode()));
		
		SubDemo sd1 = new SubDemo(4);
		System.out.println(sd1.toString());
	}

}
