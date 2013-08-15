package com.java.basic.day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 �������ĳ���,��Ϊ��������Ĳ���Ч�ʶ����ֵ�.
 �����ڴ���������֮ǰ,��������������.
 */
public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		//����һ���ַ�д��������
		FileWriter fw = new FileWriter("buffer.txt");
		
		
		//Ϊ������ַ�д����Ч��.�����˻��弼��.
		//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������.
		BufferedWriter bufw = new BufferedWriter(fw);
		
		for (int x = 0; x < 10; x++) {
			bufw.write("abcdefgh" + x);
			bufw.newLine();//�س����з�
		}
		
		//��ס��ֻҪ�õ�����������Ҫ�ǵ�ˢ�¡�
		//bufw.flush();
		
		//��ʵ�رջ������������ڹرջ������е�������
		bufw.close();
		fw.close();
		
	}
}
