package com.java.basic.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) throws IOException {
		//WriteFile();
		//readFile();
		//readFile2();
		readFile3();
	}
	
	public static void WriteFile() throws IOException{
		//������󴴽��꣬�������ļ���������Ҫ���쳣
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		//����Ҫˢ�£���Ϊ�Ƕ��ֽڵ���С���������Բ���Ҫˢ�¡�
		fos.write("abcdegh".getBytes());
		
		fos.close();
	}
	
	public static void readFile() throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		
		int ch = 0;
		
		//һ��һ�����Ƚ��鷳
		while( (ch = fis.read()) != -1){
			System.out.print((char)ch);
		}
		fis.close();
	}
	
	//��ǿ����ļ�
	public static void readFile2() throws IOException{
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while( (len = fis.read(buf)) != -1){
			System.out.println(new String(buf,0,len));
		}
		
		fis.close();
	}
	
	//��Ƶ����ֲ������ݣ�(�ոպ�)
	public static void readFile3() throws IOException{
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		//available ���ж��ı��ļ����м����ַ������ǻس���ʱ���Զ�����/n �س����ַ�����ġ�
		int num = fis.available();
		//System.out.println("num = " + num);
		//����һ���ոպõĻ�������������ѭ���ˣ���Ϊ��ѭ���Ļ��������Լ���֪�������ж��١�
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		
		//System.out.println("num = " + num);
		System.out.println(new String(buf));
		
		fis.close();
	}
}
