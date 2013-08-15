package com.java.basic.day20;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		method_3();
	}
	
	public static void method_1() throws IOException{
		File file1 = new File("File.txt");
		sop("File:" + file1.createNewFile());
		//sop("delete:"+ file1.delete());
	}
	
	public static void method_2() throws IOException{
		File f = new File("File.txt");
		sop("dir:" + f.exists());
		sop("execute:"+ f.canExecute());
	}
	
	public static void sop(Object obj) {
		System.out.println(obj);
	}
	
	public static void method_3(){
		
	}
}
