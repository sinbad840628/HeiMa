package com.java.basic.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/*
  明白了BufferedReader类中的特有方法readLine的原理之后，
  可以自定义一个类中包含一个功能和readLine一致的方法。
  来模拟一下BufferedReader
 */
public class MyBufferReader extends Reader{

	private FileReader r;
	
	MyBufferReader(FileReader r){
		this.r = r;
	}
	
	
	//可以一次读一行数据的方法
	public String myReadLine() throws IOException{
		//定义一个临时容器。原BufferReader封装的是字符数组。
		//为了演示方便。定义一个StringBuilder容器。
		//因为最终还是要将数据变成字符串的。
		
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		
		//只要读到回车符，我们这边就不继续读下去了。
		while( (ch = r.read()) != -1){
			
			if ( ch == '\r') continue;
			if (ch == '\n') return sb.toString();
			else sb.append((char)ch);
		}
		if ( sb.toString() != null) return sb.toString();
		return null;
		
	}
	
	/*
	 * 覆盖Reader类中的抽象方法
	 */
	@Override
	public void close() throws IOException{
		r.close();
	}
	
	public int read(char[] cbuf,int offset,int length) throws IOException{
		return r.read(cbuf, offset, length);
		
	}
	
	public void myClose() throws IOException{
		r.close();
	}


	



}
