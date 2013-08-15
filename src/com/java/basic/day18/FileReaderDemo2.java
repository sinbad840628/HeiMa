package com.java.basic.day18;

import java.io.FileReader;
import java.io.IOException;

/* 
 	第二种方式:通过字符数组来进行读取
 */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		
		char[] buffer = new char[3];
		/*		
		int num1 = fr.read(buffer);		
		System.out.println("num1 = " +num1+ new String(buffer));
		
		int num2 = fr.read(buffer);		
		System.out.println("num2 = " +num2+ new String(buffer));
		
		int num3 = fr.read(buffer);		
		System.out.println("num3 = " +num3+ new String(buffer));
		
		int num4 = fr.read(buffer);		
		System.out.println("num4 = " +num4+ new String(buffer));
		*/
		int num = 0;
		while ((num = fr.read(buffer)) != -1) {
			System.out.println( new String (buffer,0,num));
		}
		fr.close();
	}
}
