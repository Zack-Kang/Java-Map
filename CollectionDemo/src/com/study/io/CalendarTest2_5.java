package com.study.io;
/**
 * Calendar:
 * 
 * ��ȡ��һ��Ķ����ж�����
 * calendar.set(year,2,1); //��ȡĳһ�������һ��
 * calendar.add(Calendar.DAY_OF_MONTH,-1)  //��ǰ��һ�죬���Ƕ������һ��
 * 
 * ��ȡ������������ʱ��
 * calendar.add(Calendar.DAY_OF_MONTH,-1)
 */
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar:
 * 
 *
 */

import static java.lang.System.*;

import java.text.SimpleDateFormat;
public class CalendarTest2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ȡ
		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, 2, 22);
		print(calendar);
		calendar.add(Calendar.YEAR,3);
		calendar.add(Calendar.MONTH,3);
		print(calendar);
		calendar.add(Calendar.YEAR,-3);
		print(calendar);
		
	}
	
	public static void print(Calendar calendar){
		String[] months = {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		String[] week = {"������","����һ","���ڶ�","������","������","������","������"};
		//out.println(calendar);
		out.println(calendar.get(Calendar.YEAR)+"��");
		int m = calendar.get(Calendar.MONTH);
		out.println(months[m]);
		out.println(calendar.get(Calendar.DAY_OF_MONTH)+"��");
		int w = calendar.get(Calendar.DAY_OF_WEEK);
		out.println(week[w-1]);
	}

}
