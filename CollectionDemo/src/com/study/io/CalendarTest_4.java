package com.study.io;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar:
 * 
 *
 */

import static java.lang.System.*;

import java.text.SimpleDateFormat;
public class CalendarTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date d = new Date();
		out.println(d.toString());
		//ֻҪ"��"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		out.print(sdf.format(d));*/
		//��ȡ
		Calendar calendar = Calendar.getInstance();
		String[] months = {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		String[] week = {"������","����һ","���ڶ�","������","������","������","������"};
		out.println(calendar);
		out.println(calendar.get(Calendar.YEAR)+"��");
		int m = calendar.get(Calendar.MONTH);
		out.println(months[m]);
		out.println(calendar.get(Calendar.DAY_OF_MONTH)+"��");
		int w = calendar.get(Calendar.DAY_OF_WEEK);
		out.println(week[w-1]);
		
		
	}

}
