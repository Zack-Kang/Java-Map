package com.study.collection.set;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set�����򲻿��ظ�Ԫ��
 * 		HashSet:���ݽṹ�ǹ�ϣ���߳��Ƿ�ͬ����
 * 			��֤Ԫ��Ψһ��ԭ���ж�Ԫ�ص�hashCodeֵ�Ƿ���ͬ�������ͬ��������ж�Ԫ�ص�equals�����Ƿ�Ϊtrue
 * 		HashTree:���Զ�set�����е�Ԫ������(ǿ��Ԫ��ʵ��Comparable�ӿ�),���ݽṹ�����������
 * 			�Ͳ����ݽṹ�Ƕ�����;
 * 			��֤Ԫ��Ψһ�Ե���compareTo����0��
 * 			Ԫ���Ƿ���ͬ�Ǹ���compareTo�Ƚϵ�
 * 			
 * 			TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԣ�Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo���������ַ�ʽҲ��ΪԪ�ص���Ȼ˳�����Ĭ��˳��
 * 			
 * 			TreeSet�ĵڶ�������ʽ����Ԫ�������߱��Ƚ��Ի��߲�������ʱ����ʱ����Ҫ�ü�������߱��Ƚ���
 * 					�ڼ���һ��ʼ�������˱ȽϷ�ʽ
 * 					
 * 				
 * 			
 * 			
 * 
 * �������д洢�Զ������ѧ��������ѧ��������������� 	
 * (�Զ������ʵ��Comparable<T>�ӿڣ��Զ�����󲻾��бȽ��ԣ��޷����бȽ�)
 * Exception in thread "main" java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(Unknown Source)
	at java.util.TreeMap.put(Unknown Source)
	at java.util.TreeSet.add(Unknown Source)
	at TreeSetTest.main(TreeSetTest.java:56)
	
 * ����ʱ������Ҫ�������ʱ��һ��Ҫ�жϴ�Ҫ����
 */


class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		System.out.println(name+":"+age+"<------>+"+o.getName()+":"+o.getAge());
		if (age>o.getAge()){
			return 1;
		}else if (age==o.getAge()){
			return name.compareTo(o.getName());
		}else{
			return -1;
		}
		//return age-o.getAge();
	}

	
}
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> treeset = new TreeSet<>();
		treeset.add("TreeSet4");
		treeset.add("TreeSet3");
		treeset.add("TreeSet1");
		treeset.add("TreeSet2");
		treeset.add("TreeSet5");
		
		Iterator<String> it = treeset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		TreeSet<Student> treeSetStu = new TreeSet<>();
		treeSetStu.add(new Student("TreeSetStu1",28));
		treeSetStu.add(new Student("TreeSetStu2",14));
		treeSetStu.add(new Student("TreeSetStu3",18));
		treeSetStu.add(new Student("TreeSetStu4",30));
		treeSetStu.add(new Student("TreeSetStu5",20));
		treeSetStu.add(new Student("TreeSetStu6",20));
		Iterator<Student> itStu = treeSetStu.iterator();
		while(itStu.hasNext()){
			Student stu = itStu.next();
			System.out.println(stu.getName()+":"+stu.getAge());
		}
	}

}
