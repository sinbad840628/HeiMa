package com.java.basic.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
  将C盘的一个文本文件复制到D盘.
 原理很简单:
 其实就是将C盘下的文件数据存储到D盘的一个文件中.
 
 步骤就是:
 1.在D盘创建一个文件.用于存储C盘的文件内容.
 2.定义一个读取流和C盘的相关文件关联.
 3.通过不断的读写来完成数据存储.
 4.关闭资源.
 * */
public class CopyTest {

	public static void main(String[] args) throws IOException {
		//copy1();
		copy2();
	}
	
	//从C盘读一个字符,就往D盘写一个字符
	public static void copy1() throws IOException{
		//创建目的地
		FileWriter fw = new FileWriter("RuntimeDemo_copy.txt");
		
		//与已有文件建立关联
		FileReader fr = new FileReader("c:\\QcOSD.txt");
		
		int ch = 0;
		
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	
	public static void copy2() throws IOException{
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
			fileWriter = new FileWriter("SystemDemo.java");
			fileReader = new FileReader("c:\\QcOSD.txt");
			
			char[] buffer = new char[1024];
			
			int length = 0;
			while ( ( length = fileReader.read(buffer) ) != -1) {
				fileWriter.write(buffer,0,length);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally{
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e2) {
					e2.getStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e2) {
					e2.getStackTrace();
				}
			}
		}
	}
}
