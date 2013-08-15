package com.java.basic.day18;

import java.io.IOException;

/*
 Runtime����
 ���ಢû���ṩ���캯��.
 ˵��������new����.��ô��ֱ�����뵽:������еķ������Ǿ�̬��.
 ��������������л��зǾ�̬����.
 ˵������϶����ṩ�˷�����ȡ�������.���Ҹ÷����Ǿ�̬��,������ֵ�����Ǳ�������.
 �÷�����static Runtime getRuntime()����,�ǲ��Ǻ�����?
 */
public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		//Process process = runtime.exec("D:\\Program Files\\Tools\\Matrix.scr");
		Process process = runtime.exec("notepad.exe demo.txt");
		Thread.sleep(4000);
		process.destroy();
	}
}
