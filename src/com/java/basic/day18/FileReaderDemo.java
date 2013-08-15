package com.java.basic.day18;

import java.io.FileReader;
import java.io.IOException;

/*
  字符流100%有编码,不过它的默认编码是谁啊?
 * */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {

		//创建一个文件读取流对象,和指定名称的文件相关联起来
		//要保证该文件是已经存在的,如果不存在,会发生异常错误FileNotFoundException
		FileReader fr = new FileReader("demo.txt");
		
		//调用读取流对象的read方法.
		
//		int ch1 = fr.read();
//		System.out.println("CH1= " +(char)ch1);
//		
//		int ch2 = fr.read();
//		System.out.println("CH2= " +(char)ch2);
//		
//		int ch3 = fr.read();
//		System.out.println("CH3= " +(char)ch3);
//		
//		int ch4 = fr.read();
//		System.out.println("CH4= " +ch4);
		
//		while(true){
//			int ch = fr.read();
//			if (ch == -1) {
//				break;
//			}
//			System.out.println("ch=" + (char)ch );
//		}
		
		int ch = 0;
		
		while (( ch = fr.read()) != -1) {
			System.out.println("ch=" + (char)ch);
		}
		
		fr.close();
	}
}
