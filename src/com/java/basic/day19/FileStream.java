package com.java.basic.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) throws IOException {
		//WriteFile();
		//readFile();
		//readFile2();
		readFile3();
	}
	
	public static void WriteFile() throws IOException{
		//这个对象创建完，必须有文件，所以需要抛异常
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		//不需要刷新，因为是对字节的最小操作，所以不需要刷新。
		fos.write("abcdegh".getBytes());
		
		fos.close();
	}
	
	public static void readFile() throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		
		int ch = 0;
		
		//一个一个读比较麻烦
		while( (ch = fis.read()) != -1){
			System.out.print((char)ch);
		}
		fis.close();
	}
	
	//加强版读文件
	public static void readFile2() throws IOException{
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while( (len = fis.read(buf)) != -1){
			System.out.println(new String(buf,0,len));
		}
		
		fis.close();
	}
	
	//设计第三种测试数据：(刚刚好)
	public static void readFile3() throws IOException{
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		//available 是判断文本文件中有几个字符，但是回车的时候，自动加入/n 回车的字符计算的。
		int num = fis.available();
		//System.out.println("num = " + num);
		//定义一个刚刚好的缓冲区，不用再循环了，以为用循环的话，是我自己不知道里面有多少。
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		
		//System.out.println("num = " + num);
		System.out.println(new String(buf));
		
		fis.close();
	}
}
