package com.java.basic.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
  ��C�̵�һ���ı��ļ����Ƶ�D��.
 ԭ��ܼ�:
 ��ʵ���ǽ�C���µ��ļ����ݴ洢��D�̵�һ���ļ���.
 
 �������:
 1.��D�̴���һ���ļ�.���ڴ洢C�̵��ļ�����.
 2.����һ����ȡ����C�̵�����ļ�����.
 3.ͨ�����ϵĶ�д��������ݴ洢.
 4.�ر���Դ.
 * */
public class CopyTest {

	public static void main(String[] args) throws IOException {
		//copy1();
		copy2();
	}
	
	//��C�̶�һ���ַ�,����D��дһ���ַ�
	public static void copy1() throws IOException{
		//����Ŀ�ĵ�
		FileWriter fw = new FileWriter("RuntimeDemo_copy.txt");
		
		//�������ļ���������
		FileReader fr = new FileReader("c:\\QcOSD.txt");
		
		int ch = 0;
		
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	
	public static void copy2() throws IOException{
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
			fileWriter = new FileWriter("SystemDemo.java");
			fileReader = new FileReader("c:\\QcOSD.txt");
			
			char[] buffer = new char[1024];
			
			int length = 0;
			while ( ( length = fileReader.read(buffer) ) != -1) {
				fileWriter.write(buffer,0,length);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally{
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e2) {
					e2.getStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e2) {
					e2.getStackTrace();
				}
			}
		}
	}
}
