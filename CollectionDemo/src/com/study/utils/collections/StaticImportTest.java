package com.study.utils.collections;



/**
 * ��̬���룺StaticImport  ��������������еľ�̬��Ա
 * ����������ʱ����Ҫָ������İ���
 * ����������ʱ����Ҫָ�������������������
 *
 *import java.lang.System.*
 *
 * packa/Demo.class
 * packb/Demo.class
 * 
 * import packa.*
 * import packb.*
 * 
 * new Packa.Demo()
 * new Packb.Demo()
 */

import static java.lang.System.*;
import java.util.Arrays;
import static java.util.Arrays.*;   //�������Arrays�����еľ�̬��Ա����
public class StaticImportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = {2,4,1,4,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		int[] arr = {2,4,1,4,3};
		sort(arr);
		//System.out.println(toString(arr)); //��Object�е�toString����
		out.println(Arrays.toString(arr));
		
	}

}
