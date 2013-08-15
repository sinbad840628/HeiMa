package com.java.basic.day18;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  时间类
 */
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		//如果是这样子打印的刷,你是看不懂的,所以希望有一个好一点的格式
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss");
		//调用format方法让模式格式化制定Date对象
		String time = sdf.format(d);
		System.out.println("time = " + time);
	}
}
