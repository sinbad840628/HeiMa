package com.java.basic.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    字符读取流缓冲区:

 */
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		//创建一个读取流对象和文件向关联
		FileReader fr = new FileReader("buffer.txt");
		
		//为了提高效率，加入缓冲技术。将字符读取流对象作为参数传递给缓冲对象的构造函数。
		BufferedReader bufr = new BufferedReader(fr);
		
//		String s1 = bufr.readLine();
//		System.out.println("s1 = " + s1);
		String line = null;
		while (( line = bufr.readLine()) != null) {
			System.out.println(line);
		}
		
		bufr.close();
		fr.close();
	}
}
