package com.java.basic.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 通过缓冲区复制一个。java文件
 */
public class CopyTextbyBuffer {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		FileWriter fw = null;		
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		
		
		try {
			fr = new FileReader("SystemDemo.java");
			fw = new FileWriter("bufferWriter_copy.txt");
			bufr = new BufferedReader(fr);
			bufw = new BufferedWriter(fw);
			
			String line = null;
			//一行一行的读取有效字符(不包含回车符，)
			while (( line = bufr.readLine()) != null) {
				bufw.write(line);
				bufw.newLine();//如果没有这个的话，就没有回车换行符了。
				bufw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if (bufr != null) {
					bufr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (bufw != null) {
					bufw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
