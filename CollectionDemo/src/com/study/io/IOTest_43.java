  package com.study.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * ��5��ѧ����ÿ��ѧ����3�ſεĳɼ�
 * �Ӽ��������������ݣ��������������ſγɼ���
 * ����ĸ�ʽ����zhangsan,30,40,60������ܳɼ�
 * ����ѧ������Ϣ�ͼ�������ܷ����ߵ�˳�����ڴ����ļ�"student.txt"��
 * 
 * 
 * 1������ѧ������
 * 2������һ�����Բ���ѧ������Ĺ�����
 * 
 * 
 * ˼�룺
 * 1��ͨ����ȡ����¼���һ�����ݣ����������е���Ϣȡ����װ��ѧ������
 * 2����Ϊѧ�������кܶ࣬����Ҫ�洢ʹ�ü��ϣ���ΪҪ��ѧ�����ܷ��������Կ���ʹ��TreeSet
 * 3���������е���Ϣд�뵽�ļ���
 * 
 */

class Student implements Comparable<Student>{
	private String name;
	private int ma,cn,en;
	private int sum;
	

	public Student(String name, int ma, int cn, int en) {
		super();
		this.name = name;
		this.ma = ma;
		this.cn = cn;
		this.en = en;
		this.sum = ma+cn+en;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMa() {
		return ma;
	}


	public void setMa(int ma) {
		this.ma = ma;
	}


	public int getCn() {
		return cn;
	}


	public void setCn(int cn) {
		this.cn = cn;
	}


	public int getEn() {
		return en;
	}


	public void setEn(int en) {
		this.en = en;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int b = sum-o.sum;
		if (b==0){
			return name.compareTo(o.name);
		}
		return b;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+sum*78;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student){
			throw new ClassCastException("���Ͳ�ƥ��");
		}
		Student s = (Student) obj;
		return s.name.equals(name)&&sum==s.sum;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", ma=" + ma + ", cn=" + cn + ", en=" + en + ", sum=" + sum + "]";
	}
	
}

class StudentTool{
	public static Set<Student> getStudents() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Student> stus = new TreeSet<>();
		String line  = null;
		while((line=br.readLine())!=null){
			if ("over".equals(line)){
				break;
			}
			String[] info = line.split(",");
			stus.add(new Student(info[0], Integer.valueOf(info[1]), Integer.valueOf(info[2]), Integer.valueOf(info[3])));
		}
		br.close();
		return stus;
	}
	
	public static void write2File(Set<Student> stus) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
		for (Student stu : stus){
			bw.write(stu.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}

public class IOTest_43 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Test();
	}

	private static void Test() throws IOException {
		// TODO Auto-generated method stub
		Set<Student> stus = StudentTool.getStudents();
		StudentTool.write2File(stus);
	}

	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
