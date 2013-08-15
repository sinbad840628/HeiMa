package com.java.basic.day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 缓冲区的出现,是为了提高流的操作效率而出现的.
 所以在创建缓冲区之前,必须先有流对象.
 */
public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		//创建一个字符写入流对象
		FileWriter fw = new FileWriter("buffer.txt");
		
		
		//为了提高字符写入流效率.加入了缓冲技术.
		//只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可.
		BufferedWriter bufw = new BufferedWriter(fw);
		
		for (int x = 0; x < 10; x++) {
			bufw.write("abcdefgh" + x);
			bufw.newLine();//回车换行符
		}
		
		//记住，只要用到缓冲区，就要记得刷新。
		//bufw.flush();
		
		//其实关闭缓冲区，就是在关闭缓冲区中的流对象。
		bufw.close();
		fw.close();
		
	}
}
