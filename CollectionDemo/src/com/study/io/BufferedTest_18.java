package com.study.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ϊ�˶�ȡ��಻ͬ�����ݣ����������Ӧ����
 * MyTextReader
 * MyMediaReader
 * ����Ӧ����������ȡ���󣬳���Reader
 * 
 * 
 * 
 * Reader  //����ר�����ڶ�ȡ���ݵ���
 *    |--MyTextReader
 *       |--MyBufferedTextReader
 *    |--MyMediaReader
 *       |--MyBufferedMediaReader
 *    |--MyDataReader
 *       |--MyBufferedDataReader
 * 
 * class MyBufferedReader{
 *    
 *     MyBufferedReader(MyBufferedTextReader reader){
 *    
 *     }
 *     
 *     MyBufferedReader(MyBufferedMediaReader reader){
 *    
 *     }
 *     
 *     MyBufferedReader(MyBufferedDataReader reader){
 *    
 *     }
 * }
 * �����������չ�Ժܲ
 * �ҵ�������Ĺ�ͬ���ͣ�ͨ����̬����ʽ�����������չ��
 * class MyBufferedReader extends Reader{
 *     private Reader reader;
 *     MyBufferedReader(Reader reader){
 *         this.reader = reader;
 *     }
 * 
 * 
 * }
 *    
 * Reader  //ר�����ڶ�ȡ���ݵ���
 *     |--MyTextReader
 *     |--MyDediaReader
 *     |--MyDataReader
 *     |--MyBufferedReader
 * 
 * װ����ȼ̳и��������˼̳���ϵӷ��
 * ���ҽ�����������֮��Ĺ�ϵ
 * 
 * װ������Ϊ��ǿ���ж��󣬾߱��˺����ж�����ͬ�Ĺ��ܣ�ֻ�����ṩ�˸�ǿ�Ĺ���
 * ����װ����ͱ�װ����ͨ��������һ����ϵ��
 * 
 * 
 * 
 * 
 * 
 * 
 * 
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


/*class Persion{
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
}*/

//ͨ��Persion��SuperPersion�й�ͬ����

public class BufferedTest_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Persion p = new Persion();
		p.eat();
		
		SuperPersion sp = new SuperPersion(p);
		sp.superEat();*/
	}

}
