package com.study.collection.set;
import java.util.Comparator;
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
 * ��Ԫ�������߱��Ƚ���ʱ�����߾߱��ıȽ��Բ������裬��ʱ��Ҫ����������߱��Ƚ���
 * �����˱Ƚ��������Ƚ���������Ϊ��������TreeSet�Ĺ��캯��
 * �����ֱȽ϶�����ʱ���ԱȽ���Ϊ׼
 * ����һ��Comparator�࣬ʵ��compare����
 */


public class TreeSetTest2 {

	public static void main(String[] args) {
		
		
		TreeSet<Student> treeSetStu = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int res = o1.getName().compareTo(o2.getName());
				System.out.println("o1:"+o1.getName()+":"+o1.getAge()+" o2:"+o2.getName()+":"+o2.getAge());
				if (res==0){
					return o1.getAge() - o2.getAge();
				}
				return res;
			}
		});
		
		treeSetStu.add(new Student("TreeSetStu4",28));
		treeSetStu.add(new Student("TreeSetStu5",14));
		treeSetStu.add(new Student("TreeSetStu1",18));
		treeSetStu.add(new Student("TreeSetStu3",30));
		treeSetStu.add(new Student("TreeSetStu2",20));
		treeSetStu.add(new Student("TreeSetStu0",20));
		Iterator<Student> itStu = treeSetStu.iterator();
		while(itStu.hasNext()){
			Student stu = itStu.next();
			System.out.println(stu.getName()+":"+stu.getAge());
		}
	}

}
