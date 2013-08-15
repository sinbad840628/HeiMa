package com.java.basic.day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
读取一个.java文件,并打印到控制台上
*/

public class FileReaderTest 
{

	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("demo.txt");
			char[] buf = new char[128];
			int num = 0 ;
			while(( num = fr.read(buf)) != -1 ){
				System.out.print(new String(buf, 0, num));
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
