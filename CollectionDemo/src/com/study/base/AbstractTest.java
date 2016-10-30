package com.study.base;
/**
 * ������
 * ��������г�����ͬ���ܣ������ܵ����岻ͬ��
 * ��ʱ���Խ������ϳ�ȡ����ʱֻ��ȡ���ܶ��������ȡ��������
 * 
 * �ص㣺
 * 1�����󷽷�һ�������ڳ������У��������п���û�г��󷽷�
 * 2�����󷽷��ͳ����඼���뱻abstract�ؼ�������
 * 3�������಻������new����������Ϊ���ó��󷽷�û������
 * 4���������еķ���Ҫ��ʹ�ã�����Ҫ�����ิд���еĳ��󷽷��󣬽�������������
 *    �������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ��������
 * 
 * ��������һ����û��̫��ͬ��
 * ��������������������������ֻ���������г�����һЩ�������Ķ�������Щ��ȷ���Ĳ��֣�Ҳ�Ǹ�����Ĺ���
 * ��Ҫ��ȷ���֣����޷��������壬ͨ�����󷽷�����ʾ
 * 
 * 
 * �������һ�����������������������п��Զ�����󷽷����������п��Բ�������󷽷�
 * �����಻����ʵ����
 * 
 * ���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
 * 
 */


import static java.lang.System.*;


abstract class AbsStudent{
	//void study(){}//������ʵ����û�������,��ʹ�ùؼ���abstract,�����ж��巽����
	abstract void study();
	void eat(){
		out.println("eat");
	}
}

class BaseStudent extends AbsStudent{
	void study(){
		out.println("BaseStudent");
	}
}

class AdvStudent extends AbsStudent{
	void study(){
		out.println("AdvStudent");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new AbsStudent();  //�����಻�ɴ���ʵ��
		new BaseStudent();
	}

}
