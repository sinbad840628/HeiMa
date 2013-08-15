package com.java.basic.day18;

import java.util.Calendar;
/*
 	������ϰ:
 	1.��ȡ������Ķ����ж�����?
 	˼·:����ָ��������һ��ʱ��
 	c.set(year,2,1) //ĳһ���3��1��
 	c.add(Calendar.DAY_OF_MONTH,-1)//3��1��,��ǰ��һ��,���Ƕ��µ����һ��
 	
 	2.��ȡ������������ʱ��
 	c.add(Calendar.DAY_OF_MONTH,-1)
 */
public class CalendarDemo2 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		//c.set(2013,2, 24);
		c.add(Calendar.MONTH, 18);
		printCalendar(c);
	}
	
	public static void printCalendar(Calendar c){
		String[] months = {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		String[] weeks = {"","������","����һ","���ڶ�","������","������","������","������"};
		
		int index_months = c.get(Calendar.MONTH);
		int index_weeks = c.get(Calendar.DAY_OF_WEEK);
		
		sop(c.get(Calendar.YEAR)+"��");
		sop(months[index_months -1]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"��");
		sop(weeks[index_weeks]);
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
