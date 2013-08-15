package com.java.basic.day18;

import java.util.Properties;

/*
	System:类中的方法和属性都是静态的;
	out:标准输出,默认是控制台
	in:标准输入,默认是键盘
	
	描述系统一些信息
	获取系统属性信息:Properties getProperties()
*/
public class SystemDemo {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		
		//因为Properties是Hashtable的子类,也就是Map集合的一个子类对象
		//那么可以通过map方法去除该集合中的元素.
		//该集合中存储的都是字符串,没有泛型
		
		//如何在系统类中自定义一些特有的信息?
		System.setProperty("myKey", "This is Sinbad.");
		
		//获取指定属性信息
		String Info = System.getProperty("os.name");
		System.out.println("value = " + Info);
		
		//可不可以在jvm启动时,动态加载一些属性信息呢?
		String v = System.getProperty("haha");
		System.out.println("v = " + v);
		
		//可以使用  java -Dhaha=ValueString ClassName
		
		for(Object obj:prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj + " => " + value);
		}
		
		
		
	}
}
