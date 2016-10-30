package com.study.base;

/**
 * ���󣺻�ȡһ�γ������е�ʱ��
 * ԭ����ȡ����ʼ�ͽ�����ʱ�䣬�����
 * ��ȡʱ�䣺System.currentTimeMillis()
 * 
 * 
 * ����������Ż���Ϳ��Խ���������⣬���ַ�ʽ����ģ�巽�����ģʽ
 * 
 * 
 * ʲô��ģ�巽���أ�
 * �ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ������в�һ�����ǲ�ȷ������ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣�
 * ��ô��ʱ����Ҫ����ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ���
 * 
 * 
 */


abstract class GetTime{
	public final void getTime(){   //������д
		long start = System.currentTimeMillis();
		/*for (int i=0;i<1000;i++){
			System.out.println(i);
		}
		*/
		runCode();
		long end = System.currentTimeMillis();
		System.out.println("���룺"+(end-start));
	}

	public abstract void runCode();   //���븴д 
	/*{
		// TODO Auto-generated method stub
		for (int i=0;i<1000;i++){
			System.out.println(i);
		}
	}*/
}

class SubTime extends GetTime{
	/*public void getTime(){
		long start = System.currentTimeMillis();
		for (int i=0;i<4000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("���룺"+(end-start));
	}*/
	public void runCode(){
		for (int i=0;i<4000;i++){
			System.out.println(i);
		}
	}
}
public class TemplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GetTime gt = new GetTime();
		gt.getTime();*/
		
		SubTime st = new SubTime();
		st.getTime();
	}

}
