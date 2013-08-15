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
		String[] months = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		int index_months = c.get(Calendar.MONTH);
		int index_weeks = c.get(Calendar.DAY_OF_WEEK);
		
		sop(months[index_months]);
		sop(weeks[index_weeks]);
		//sop(c.get(Calendar.YEAR)+"年");
		//sop(c.get(Calendar.MONTH)+"月");
		//sop(c.get(Calendar.DAY_OF_WEEK)+"");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
