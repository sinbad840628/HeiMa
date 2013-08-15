package com.java.basic.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
 */
public class CopyMP3Demo {

	public static void main(String[] args) throws IOException {
		long statTime = System.currentTimeMillis();
		copy_1();
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - statTime) + "∫¡√Î");
	}
	
	public static void copy_1() throws IOException{
		BufferedInputStream bufis = null;
		BufferedOutputStream bufos = null;
		FileInputStream fis = new FileInputStream("D:\\001.mp3");
		FileOutputStream fos = new FileOutputStream("D:\\0022.mp3");
		
		bufis = new BufferedInputStream(fis);
		bufos = new BufferedOutputStream(fos);
		
		int by = 0 ;
		while ( ( by = bufis.read()) != -1) {
			bufos.write(by);
		}
		
		bufis.close();
		bufos.close();
	}
}
