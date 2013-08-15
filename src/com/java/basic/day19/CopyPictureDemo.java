package com.java.basic.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 复制一个图片
 思路：
 1.用字节读取流对象和图片关联
 2.用字节写入刘对象创建图片，用于存储获取到图片数据
 3.通过循环读写，完成数据的存储。
 4.关闭资源。 
 */
public class CopyPictureDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			//尽量在非系统盘做这个练习，因为c盘不让写。
			fos = new FileOutputStream("D:\\2.bmp");
			fis = new FileInputStream("D:\\1.bmp");
			
			byte[] buf = new byte[1024];
			int len = 0 ;
			
			while( (len = fis.read(buf)) != -1){
				fos.write(buf,0,len);
			}
			
		} catch (IOException e) {
			throw new RuntimeException("复制文件失败");
		}
		finally{
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("写入文件关闭失败");
			}
			try {
				if ( fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("读取文件关闭失败");
			}
		}
	}
}
