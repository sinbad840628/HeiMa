package com.java.basic.day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) throws IOException {
		
		//����һ��true����,�������������ļ�,���Ǵ������ļ�,�ڽ�β������׷��
		FileWriter fileWriterDemo = new FileWriter("demo.txt",true);
	
		fileWriterDemo.write("hello\nSinbad");
		fileWriterDemo.close();
	}
}
