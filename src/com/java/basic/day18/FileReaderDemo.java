package com.java.basic.day18;

import java.io.FileReader;
import java.io.IOException;

/*
  �ַ���100%�б���,��������Ĭ�ϱ�����˭��?
 * */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {

		//����һ���ļ���ȡ������,��ָ�����Ƶ��ļ����������
		//Ҫ��֤���ļ����Ѿ����ڵ�,���������,�ᷢ���쳣����FileNotFoundException
		FileReader fr = new FileReader("demo.txt");
		
		//���ö�ȡ�������read����.
		
//		int ch1 = fr.read();
//		System.out.println("CH1= " +(char)ch1);
//		
//		int ch2 = fr.read();
//		System.out.println("CH2= " +(char)ch2);
//		
//		int ch3 = fr.read();
//		System.out.println("CH3= " +(char)ch3);
//		
//		int ch4 = fr.read();
//		System.out.println("CH4= " +ch4);
		
//		while(true){
//			int ch = fr.read();
//			if (ch == -1) {
//				break;
//			}
//			System.out.println("ch=" + (char)ch );
//		}
		
		int ch = 0;
		
		while (( ch = fr.read()) != -1) {
			System.out.println("ch=" + (char)ch);
		}
		
		fr.close();
	}
}
