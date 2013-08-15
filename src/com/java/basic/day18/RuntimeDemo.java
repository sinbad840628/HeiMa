package com.java.basic.day18;

import java.io.IOException;

/*
 Runtime对象
 该类并没有提供构造函数.
 说明不可以new对象.那么会直接联想到:这个类中的方法都是静态的.
 不过发现这个类中还有非静态方法.
 说明该类肯定会提供了方法获取本类对象.而且该方法是静态的,并返回值类型是本类类型.
 该方法是static Runtime getRuntime()方法,是不是很神奇?
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
