package com.java.basic.day18;
/*
  ֻҪ���ļ��豸�Ķ�д�й�,�������쳣���ܷ���
 * */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		
		//��̹淶:��д��������,Ȼ����try�ڳ�ʼ��.
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
			//�������,���ὫһЩһ��Ҫ����������
			try {
				//��ʹ��finally��,ҲҪ��һ��try���ж�,�Է���һΪ��
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
