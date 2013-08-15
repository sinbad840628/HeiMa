package com.java.basic.day18;
/*
  只要和文件设备的读写有关,都会有异常可能发生
 * */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		
		//编程规范:先写变量引用,然后在try内初始化.
		FileWriter fileWriterDemo = null;
		
		try {
			fileWriterDemo = new FileWriter("k:\\demo.txt");
			fileWriterDemo.write("1234");
			//fileWriterDemo.close();
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
		finally{
			//无论如何,都会将一些一定要发生的事情
			try {
				//即使是finally了,也要做一下try的判断,以防万一为空
				if (fileWriterDemo != null) {
					fileWriterDemo.close();
				}
			} catch (Exception e2) {
				//System.out.println("fileWriterDemo is empty");
				e2.printStackTrace();
			}
		}
		
	}
}
