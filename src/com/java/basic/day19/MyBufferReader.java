package com.java.basic.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/*
  ������BufferedReader���е����з���readLine��ԭ��֮��
  �����Զ���һ�����а���һ�����ܺ�readLineһ�µķ�����
  ��ģ��һ��BufferedReader
 */
public class MyBufferReader extends Reader{

	private FileReader r;
	
	MyBufferReader(FileReader r){
		this.r = r;
	}
	
	
	//����һ�ζ�һ�����ݵķ���
	public String myReadLine() throws IOException{
		//����һ����ʱ������ԭBufferReader��װ�����ַ����顣
		//Ϊ����ʾ���㡣����һ��StringBuilder������
		//��Ϊ���ջ���Ҫ�����ݱ���ַ����ġ�
		
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		
		//ֻҪ�����س�����������߾Ͳ���������ȥ�ˡ�
		while( (ch = r.read()) != -1){
			
			if ( ch == '\r') continue;
			if (ch == '\n') return sb.toString();
			else sb.append((char)ch);
		}
		if ( sb.toString() != null) return sb.toString();
		return null;
		
	}
	
	/*
	 * ����Reader���еĳ��󷽷�
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
