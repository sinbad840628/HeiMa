package com.java.basic.day20;

import java.io.File;

public class FileDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conMethod();
	}
	
	public static void conMethod(){
		//将a.txt 封装成file对象，可以将已有的和为出现的文件或者文件夹封装成对象。
		File file1 = new File("a.txt");
		File file2 = new File("D:\\Program Files","demo.txt");
		
		File d = new File("D:\\Program Files");
		File file3 = new File(d,"demo.txt");
		
		sop("file1:" + file1);
		sop("file1:" + file2);
		sop("file1:" + file3);
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
