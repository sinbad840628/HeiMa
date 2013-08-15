package com.java.basic.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    �ַ���ȡ��������:

 */
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		//����һ����ȡ��������ļ������
		FileReader fr = new FileReader("buffer.txt");
		
		//Ϊ�����Ч�ʣ����뻺�弼�������ַ���ȡ��������Ϊ�������ݸ��������Ĺ��캯����
		BufferedReader bufr = new BufferedReader(fr);
		
//		String s1 = bufr.readLine();
//		System.out.println("s1 = " + s1);
		String line = null;
		while (( line = bufr.readLine()) != null) {
			System.out.println(line);
		}
		
		bufr.close();
		fr.close();
	}
}
