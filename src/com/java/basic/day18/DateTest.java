package com.java.basic.day18;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  ʱ����
 */
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		//����������Ӵ�ӡ��ˢ,���ǿ�������,����ϣ����һ����һ��ĸ�ʽ
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� E HH:mm:ss");
		//����format������ģʽ��ʽ���ƶ�Date����
		String time = sdf.format(d);
		System.out.println("time = " + time);
	}
}
