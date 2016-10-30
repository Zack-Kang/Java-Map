package com.study.io;

import java.util.Properties;

/**
 * System:���еķ��������Զ��Ǿ�̬��
 * out:��׼���
 * in:��׼���룬Ĭ���Ǽ���
 * 
 * 
 * ����ϵͳһЩ��Ϣ
 * ��ȡϵͳ������ϢProperties System.getProperties();
 * 
 * @author kang
 *
 */
public class SystemTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Properties properties = System.getProperties();
		 //�����ϵͳ������һЩ�Զ�����Ϣ
		 System.setProperty("mykey", "hahha");
		 //��Ϊproperties��HashTable�����࣬Ҳ����map���ϵ�һ�����࣬����ʹ��map���ϵķ���ȡ�������е�Ԫ��
		 //�ü��ϴ洢�Ķ����ַ�����û�з��Ͷ���
		 for (Object obj: properties.keySet()){
			 System.out.println(obj+"--> "+properties.getProperty( (String) obj));
		 }
		 //��ȡָ������ java -DKey=value   ���������ʱ�������ԣ�-D��
		 System.out.println(properties.getProperty("os.name"));
	}

}
