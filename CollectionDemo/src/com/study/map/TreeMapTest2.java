package com.study.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * "asadbwieuqndkqsadnqiwdnbqw"��ȡ���ַ�������ĸ���ֵĴ���
 * ϣ����ӡ�����a(1)c(2)......
 * ͨ���������ÿһ����ĸ���ж�Ӧ�Ĵ���
 * ˵����ĸ�ʹ���֮����ӳ���ϵ
 * ������ӳ���ϵʱ������ѡ��map����
 * ��Ϊmap�����д�ŵľ���ӳ���ϵ
 * 
 * 
 * ʲôʱ��ʹ��map�����أ�
 * ������֮�����ӳ���ϵ��ʱ�򣬾�Ҫ����map����
 * 
 * 
 * ˼·
 * 1�����ַ���ת�����ַ������ݣ���ΪҪ��ÿһ���ַ�����
 * 2������һ��map���ϣ���Ϊ��ӡ��ĸ�Ľ����˳������ʹ��TreeMap
 * 3�������ַ�����
 * 	��ÿһ����ĸ��Ϊ��ȥ��ѯmap���ϡ�
 * 	�������null,������ĸ���뵽map����
 * 	������ز�Ϊnull,˵����ĸ��map�������Ѿ����ڣ����ж�Ӧ�Ĵ���
 * 	��ô�ͻ�ȡ�ô�����������������Ȼ�󽫸���ĸ��������Ĵ������뵽mao���ϣ����ǵ��ü�ԭ����Ӧ�Ĵ���
 * 	��map�����е����ݱ��ָ�����ַ�����ʽ����
 */

/*class Student implements Comparable<Student>{
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
		int dif = age - o.getAge();
		if (dif==0){
			dif = name.compareTo(o.getName());
		}
		return dif;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

class StuComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int dif = o1.getName().compareTo(o2.getName());
		if (dif==0){
			dif = o1.getAge() - o2.getAge();
		}
		return dif;
	}
	
}
*/

public class TreeMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charCount("asadbiaus,.,;/,,,.,uhdvnwndjofcuias");
	}
	
	public static String charCount(String str){
		char[] chs = str.toCharArray();
		TreeMap<Character,Integer> tmap = new TreeMap<>();
		for (int i=0;i<chs.length;i++){
			if (!((chs[i]>='a'&&chs[i]<='z')||(chs[i]>='A'&&chs[i]<='Z')))
				continue;
			
			Integer value = tmap.get(new Character(chs[i]));
			if (value==null){
				value=1;
			}else{
				value++;
			}
			tmap.put(new Character(chs[i]), value);
		}
		
		StringBuilder sb = new StringBuilder();
		Set<Map.Entry<Character, Integer>> entry = tmap.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = entry.iterator();
		Map.Entry<Character, Integer> et = null;
		while(it.hasNext()){
			et = it.next();
			sb.append(et.getKey()+"("+et.getValue()+")");
		}
		
		System.out.println(sb);
		return sb.toString();
		
	}

}
