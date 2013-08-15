package com.java.basic.day18;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		/*Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String year = sdf.format(d);
		System.out.println(year);*/
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DAY_OF_MONTH, 18);
		printCalendar(c);
		
		
		
		
	}
	private static void printCalendar(Calendar c) {
		String[] months = {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		String[] weeks = {"","������","����һ","���ڶ�","������","������","������","������"};
		int index_months = c.get(Calendar.MONTH);
		int index_weeks = c.get(Calendar.DAY_OF_WEEK);
		
		sop(months[index_months]);
		sop(weeks[index_weeks]);
		//sop(c.get(Calendar.YEAR)+"��");
		//sop(c.get(Calendar.MONTH)+"��");
		//sop(c.get(Calendar.DAY_OF_WEEK)+"");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
