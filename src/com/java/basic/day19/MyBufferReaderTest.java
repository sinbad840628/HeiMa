package com.java.basic.day19;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("SystemDemo.java");
		
		MyBufferReader mbr = new MyBufferReader(fr);
		
		String line = null;
		
		while ((line = mbr.myReadLine()) != null) {
			System.out.println(line);
		}
		mbr.myClose();
	}
}
