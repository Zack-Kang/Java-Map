package com.study.base;
/**
 * final����Ϊһ�����η�
 * 1�����������ࡢ����������
 * 2����final���ε��಻���Ա��̳У��̳���һ���׶ˣ��������˷�װ�ԣ���Ϊ�˱��ⱻ���า�Ǹ�д���ܣ�
 * 3����final���εķ������ܱ���д
 * 4����final���εı�����һ��������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա�������ֿ������ξֲ�����
 *    ����������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������Щֵȡ�����ַ������Ķ�
 *    �����ֵ����Ҫ�ı䣬������Ӧ��,��Ϊ��������������д�淶���е���ĸ����д������ж��������ɣ�ÿ�����ʼ�ͨ���»�������
 * 5���ڲ��ඨ�������еľֲ�λ��ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�����
 *
 */
//���ܱ���дfinal��
/*final class Demo{
	
}

class SubDemo extends Demo{
	
}*/

//���ܸ�дfinal����
/*class Demo{
	void show1(){
		
	}
	
	final void show2(){
		
	}
}

class SubDemo extends Demo{
	void show2(){
	}
}*/

/*class Demo{
	final int x = 3;
	final double PI = 3.1425926;
	void show1(){
		x = 4;
	}
	
	void show2(){
		final int y = 5;
		y = 6;
	}
}

class SubDemo extends Demo{
	void show2(){
	}
}*/

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
