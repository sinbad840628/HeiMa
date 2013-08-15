package com.java.basic.day18;

import java.io.FileWriter;
import java.io.IOException;

/*
IO流  （Input Output）

操作数据分为两种：字符流和字节流：
来源：
内存，硬盘上的都是字节流，早期的电脑操作系统是老外发明的，所以只要ASCII码都能搞定。
其中有一部分文本数据使用字符流。

【字符流的由来】
计算机当中，想要识别生活中的一些数据。
老美是二进制的1010 表示字母ABCD 形成字母映射表。  大写A  65，小写a 97  ASCII表

为了让中国的用户使用电脑    新增 GB2312表（），然后是 GBK表      18030表
后来国际化组织知道 日本和韩国人也在造表。
所以说干脆用一张全球都通用的码表 UTF-8表   （优化表，1个装不下，就用2个字节，2个字节装不下就用4个）
Unicode表，无论什么字符都用8位数字搞定。

最后在识别不同表的相同数字，相同字母的时候？

如果我存GBK表的数据，我这边是可以看得见的，但是放到别的表的话，就有可能使用GB2312表的话，就有可能是乱码了。

所以引入字符流的话，可以让用户自定义调用编码表的规范。

处理图片的话，反而只要字节流，因为图片中没有文字。

流向分为：输入流和输出流。
既然IO流（处理数据的流）是用于操作数据用的，那么数据的最常见体现形式是文件。



IO流常用基类
字节流的抽象基类：InputStream类（读），outputStream类（写）
字符流的抽象基类：Reader类，Writer类

对于数据的操作无非就是两种：读和写。



我们今天写学习一下字符流的特点
那么先以操作文件为主来演示一下。
需求：在硬盘上，创建一个文件并写入一些文字数据。

找到一个专门用于操作文件的Writer子类对象。FileWriter。
后缀名是父类名，前缀名是该流对象的功能。

*/
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建一个FileWriter对象，该对象一被初始化，就必须有被操作的文件存在。同时该文件会被创建到制定的目录下。
		//如果该目录下有同名文件,创建的时候,就会覆盖掉这个文件.
		//其实这一步就是在明确数据存放的目的地.
		FileWriter fileWriterDemo = new FileWriter("d:\\demo.txt"); //万一没有D盘呢，所以需要一个专门处理异常的处理。
		
		//第二步骤:写入字符串的时候,并没有直接写到文件中,而是将字符串写到流里面去了,所以需要调用flush()方法来刷新流对象缓冲中的数据
		fileWriterDemo.write("abcdef");
		fileWriterDemo.flush();
		
		//如果继续追加写的话,还是没有全部写到文件的.
		fileWriterDemo.write("ghish");
		
		//关闭刘子源,但是关闭之前,会刷新一次内部的缓冲中的数据.
		//将数据刷到目的地中.
		//和flush区别:flush刷新之后,流可以继续使用,但是close刷新后,会将流关闭,后续的就不可以继续写进去了,所以70行代码出错.
		fileWriterDemo.close();
		//fileWriterDemo.write("ijk");
	}
}
