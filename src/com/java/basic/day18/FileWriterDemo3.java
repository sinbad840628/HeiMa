package com.java.basic.day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) throws IOException {
		
		//传递一个true参数,代表不覆盖现有文件,而是打开现有文件,在结尾处继续追加
		FileWriter fileWriterDemo = new FileWriter("demo.txt",true);
	
		fileWriterDemo.write("hello\nSinbad");
		fileWriterDemo.close();
	}
}
