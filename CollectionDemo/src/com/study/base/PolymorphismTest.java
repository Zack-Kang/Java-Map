package com.study.base;
/**
 * ��̬��
 * �������Ϊ������ڵĶ���������̬
 * 1����̬�Ļ�������
 *    ���������ָ�����Լ����������
 *    ���������Ҳ���Խ����Լ����������
 * 2����̬��ǰ��
 *    ������������֮��Ҫ�й�ϵ��Ҫô�̳У�Ҫôʵ��
 *    ͨ������һ��ǰ�ᣬ���ڸ���
 * 3����̬�ĺô�
 *    ��̬�ĳ�������˳������չ��
 * 4����̬�ı׶�
 *    �������չ�ԣ�����ֻ��ʹ�ø�������÷��������г�Ա
 * 4����̬��Ӧ��
 * 
 * 
 * ��̬��Ա�����ص�(�Ǿ�̬)��
 * �ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�б���ʧ��
 * ������ʱ�ڣ����Ķ��������������Ƿ��е��õķ���
 * 
 * 
 * ���ܽ᣺��Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұ�
 * 
 * 
 * �ڶ�̬�г�Ա�������ر𣺣���̬������
 * ���۱�������У����ο���ߣ������ͱ��������ģ�
 * 
 * �ڶ�̬�У���̬��Ա�������ر����۱�������ж��ο����
 *
 */

import static java.lang.System.*;


abstract class Animal{
	int id= 5;
	public abstract void eat();
	
	public static void catchMouse1(){
		out.println("Animal");
	}
}

class Cat extends Animal{
	int id= 8;
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		out.println("������"+id);
	}
	
	public void catchMouse(){
		out.println("ץ����");
	}
	
	public static void catchMouse1(){
		out.println("Cat");
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		out.println("�Թ�ͷ");
	}
	
	public void shout(){
		out.println("����");
	}
}

class Pig extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		out.println("���������");
	}
	
	public void sleep(){
		out.println("��˯��");
	}
	
}

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat c= new Cat();
		functionCat(c);
		Dog d = new Dog();
		functionDog(d);
		Pig p= new Pig();
		functionPig(p);*/
		
		Animal c= new Cat();  //��������
		c.eat();
		//�����Ҫ����cat�����ⷽ����β�����
		//ǿ�ƽ����������ת������������,����ת��
		//ǧ��Ҫ���ֽ�����Ķ���ת��Ϊ��������
		//������ת�����Ǹ�������ָ���������ʱ���������ǿ��Ա������ģ�Ҳ���Ա�ǿ��ת��
		//��ʼ���ն������������ת��
		Cat cat = (Cat)c;
		cat.catchMouse();
		functionAnimal(c);
		Animal d = new Dog();
		functionAnimal(d);
		Animal p= new Pig();
		functionAnimal(p);
		
		Animal c1= new Cat();
		out.println(c1.id);
		c1.eat();
		c1.catchMouse1();
		Cat c11= (Cat)c1;
		out.println(c11.id);
		c11.eat();
		c11.catchMouse1();
		Cat c2= new Cat();
		out.println(c2.id);
		c2.eat();
		c2.catchMouse1();
		
	}
	
	public static void functionAnimal(Animal a){
		if (a instanceof Cat){
			((Cat)a).catchMouse();
		}else if (a instanceof Dog){
			((Dog)a).shout();
		}else{
			((Pig)a).sleep();
		}
		a.eat();
	}
	
	/*public static void functionCat(Cat c){
		c.eat();
	}
	
	public static void functionDog(Dog d){
		d.eat();
	}
	

	public static void functionPig(Pig p){
		p.eat();
	}*/
}
