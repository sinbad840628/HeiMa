package com.java.basic.day20;

import java.io.File;

public class FileDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conMethod();
	}
	
	public static void conMethod(){
		//��a.txt ��װ��file���󣬿��Խ����еĺ�Ϊ���ֵ��ļ������ļ��з�װ�ɶ���
		File file1 = new File("a.txt");
		File file2 = new File("D:\\Program Files","demo.txt");
		
		File d = new File("D:\\Program Files");
		File file3 = new File(d,"demo.txt");
		
		sop("file1:" + file1);
		sop("file1:" + file2);
		sop("file1:" + file3);
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
