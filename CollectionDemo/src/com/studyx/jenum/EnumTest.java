package com.studyx.jenum;

public class EnumTest {

	/**
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeekDay1 tady = WeekDay1.MON;
		System.out.println(tady.nextDay().toString());
		
		WeekDay weekday = WeekDay.MON;
		System.out.println(weekday);   //MON
		System.out.println(weekday.name());  //MON
		System.out.println(weekday.ordinal()); //1
		System.out.println(weekday.getClass());  //class com.study.jenum.EnumTest$WeekDay
		System.out.println(WeekDay.valueOf("SUN"));  //SUN   ���ַ���"SUN"ת����enum����
		//System.out.println(WeekDay.valueOf("asdf"));  //java.lang.IllegalArgumentException: No enum constant com.study.jenum.EnumTest.WeekDay.asdf
		System.out.println(WeekDay.values());   //��ȡ����ö��ֵ
	}
	
	public enum WeekDay{
		SUN(1),MON(),TUE,WEB,THI,FRI,SAT;   //ÿ��ֵ�൱��һ��WeekDayʾ������
		private WeekDay(){  //���붨����ö��ֵ�ĺ��棬�Ҵ�ʱö��ֵ�б��ԷֺŽ�β  ������private   Ĭ�ϵ��ô˹��췽�����ڵ���ö�ٶ���֮ǰ����ö�ٶ���
			System.out.println("first");
		}
		private WeekDay(int day){ 
			System.out.println("second");
		}
	}
	
	/**
	 * �����󷽷���ö��
	 * @author Zack
	 * ö��ֻ��һ����Աʱ���Ϳ�����Ϊһ�ֵ�����ʵ�ַ�ʽ
	 */
	public enum TrafficLamp{
		RED(30) {  //������ø���Ĺ��췽��
			@Override
			public TrafficLamp nextLamp() {
				// TODO Auto-generated method stub
				return GREEN;
			}
		},
		GREEN(30) {
			@Override
			public TrafficLamp nextLamp() {
				// TODO Auto-generated method stub
				return YELLOW;
			}
		},
		YELLOW(5) {
			@Override
			public TrafficLamp nextLamp() {
				// TODO Auto-generated method stub
				return RED;
			}
		};
		public abstract TrafficLamp nextLamp();
		private int time;  //��Ա
		private TrafficLamp(int time){  //���췽��
			this.time = time;
		}
	}

}
