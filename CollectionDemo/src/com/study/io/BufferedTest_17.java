package com.study.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * װ�����ģʽ
 * ����Ҫ�����еĶ�����й�����ǿʱ��
 * ���Զ����࣬�����ж����룬�������еĹ��ܣ����ṩ��ǿ����
 * ��ô�Զ���ĸ����Ϊװ����
 * 
 * 
 * װ����ͨ����ͨ�����췽�����ܱ�װ�εĶ���
 * �����ڱ�װ�ζ���Ĺ����ṩ��ǿ�Ĺ���
 * 
 * 
 *
 */


class Persion{
	public void eat(){
		System.out.println("�Է�");
	}
}

class SuperPersion{
	private Persion p;
	SuperPersion(Persion p ){
		this.p = p;
	}
	
	public void superEat(){
		System.out.println("��θ��");
		p.eat();
		System.out.println("���");
		System.out.println("��һ��");
	}
}

//ͨ��Persion��SuperPersion�й�ͬ����

public class BufferedTest_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Persion p = new Persion();
		p.eat();
		
		SuperPersion sp = new SuperPersion(p);
		sp.superEat();
	}

}
