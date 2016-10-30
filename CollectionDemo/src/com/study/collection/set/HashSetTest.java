package com.study.collection.set;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

/**
 * SetԪ��������ģ������ȡ����˳��һ��һ�£���Ԫ�ز������ظ�
 * 		HashSet:�ײ����ݽṹ�ǹ�ϣ��
 * 				HashSet����α�֤Ԫ�ص�Ψһ���أ�
 * 					��ͨ��Ԫ�ص�����������hashCode��equals�����
 * 					���Ԫ�ص�hashCode��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
 * 					���Ԫ�ص�hashCode��ͬ�Ż����equals
 * 				ע�⣺�����ж�Ԫ���Ƿ�����Լ�ɾ���Ȳ����������ķ�����Ԫ�ص�hashCode��equals�����hashCode��ͬ�򲻵���equals��
 * 		TreeSet:
 * Set���ܺ�Collection�Ĺ���һ��
 * HashSet��֤Ԫ��Ψһ��:�ȱȽ�hashCode����hashCode��ͬʱ��ȥʹ��equals�Ƚ�
 *
 */

class SetPerson{
	private String name;
	private String tel;
	public SetPerson(String name) {
		super();
		this.name = name;
	}

	public SetPerson(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashCode<---->"+66);
		//return 66;
		return name.hashCode() + tel.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof SetPerson){
			SetPerson p = (SetPerson)obj; 
			System.out.println(name+":"+tel+"<--equal-->"+p.getName()+":"+p.getTel());
			if (p.getName().equals(name)&&p.getTel().equals(tel)){
				return true;
			}
		}
		return false;
	}
	
}

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	public static void test() {
		
		/*HashSet<String> hashSetStr = new HashSet<>();
		System.out.println(hashSetStr.add("set"));
		System.out.println(hashSetStr.add("set"));
		System.out.println(hashSetStr.add("set1"));*/
		
		HashSet<SetPerson> hashSet = new HashSet<>();
		System.out.println(hashSet.add(new SetPerson("set1", "tel")));
		System.out.println(hashSet.add(new SetPerson("set2", "tel")));
		System.out.println(hashSet.add(new SetPerson("set3", "tel")));
		System.out.println(hashSet.add(new SetPerson("set2", "tel")));
		
		System.out.println("contains:"+hashSet.contains(new SetPerson("set4", "tel")));
		System.out.println("contains:"+hashSet.contains(new SetPerson("set2", "tel")));
		System.out.println("remove:"+hashSet.remove(new SetPerson("set5", "tel")));
		System.out.println("remove:"+hashSet.remove(new SetPerson("set2", "tel")));
		
		Iterator<SetPerson> iter = hashSet.iterator();
		while(iter.hasNext()){
			SetPerson person = iter.next();
			System.out.println(person.getName()+":"+person.getTel());
	
			System.out.println(person);	
		}
		
		
		
	}
}
