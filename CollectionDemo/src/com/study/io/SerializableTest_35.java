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
import java.util.Vector;

/**��
 * ��ӡ��
 * PrintWriter��PrintStream
 * ����ֱ�Ӳ�����������ļ�
 * 
 * ������
 * SequenceInputStream
 * �Զ�������кϲ�
 * 
 * ��������
 * ObjectInputStream��ObjectOutputStream
 * �������Ķ�����Ҫʵ��Serializable(��ǽӿ�)
 * 
 * 
 * ����ĳ־û�
 * ObjectInputStream
 * ObjectOutputStream��Java����Ļ����������ͺ�ͼ��д��OutputStream,����ʹ��ObjectInputStream��ȡ���ع�������ͨ��������ʹ���ļ�����ʵ�ֶ���ĳ־ô洢��
 * ������������׽��֣����������һ̨��������һ���������ع�����
 * 
 * 1����̬�������л�
 * 2���ԷǾ�̬���������л����ӹؼ���transient
 * 
 * 
 */

class SPersion implements Serializable{
	private static final long serialVersionUID = 42L;
	String name;
	transient int age;
	static int count;
	
	public SPersion(String name, int age) {
		super();
		count++;
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
	public String toString() {
		return "SPersion [name=" + name + ", age=" + age + ",count="+count+"]";
	}
	
	
}
public class SerializableTest_35 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeObject();
		readObject();
	}

	
	private static void readObject() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
		SPersion p = (SPersion)ois.readObject();
		sop(p);
	}


	public static void  writeObject() throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
		oos.writeObject(new SPersion("lisi", 20));
		oos.close();
	}



	private static void sop(Object file) {
		// TODO Auto-generated method stub
		System.out.println(file);
	}
}
