package com.java.basic.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 ����һ��ͼƬ
 ˼·��
 1.���ֽڶ�ȡ�������ͼƬ����
 2.���ֽ�д�������󴴽�ͼƬ�����ڴ洢��ȡ��ͼƬ����
 3.ͨ��ѭ����д��������ݵĴ洢��
 4.�ر���Դ�� 
 */
public class CopyPictureDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			//�����ڷ�ϵͳ���������ϰ����Ϊc�̲���д��
			fos = new FileOutputStream("D:\\2.bmp");
			fis = new FileInputStream("D:\\1.bmp");
			
			byte[] buf = new byte[1024];
			int len = 0 ;
			
			while( (len = fis.read(buf)) != -1){
				fos.write(buf,0,len);
			}
			
		} catch (IOException e) {
			throw new RuntimeException("�����ļ�ʧ��");
		}
		finally{
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("д���ļ��ر�ʧ��");
			}
			try {
				if ( fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("��ȡ�ļ��ر�ʧ��");
			}
		}
	}
}
