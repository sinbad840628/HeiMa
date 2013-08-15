package com.java.basic.day14;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		method_get();
	}
	
	public static void method_02(){
		ArrayList  al1 = new ArrayList();		
		//1.添加元素
		al1.add("Java01");
		al1.add("Java02");
		al1.add("Java03");
		al1.add("Java04");
		
		ArrayList  al2 = new ArrayList();		
		//1.添加元素
		al2.add("Java03");
		al2.add("Java04");
		al2.add("Java05");
		al2.add("Java06");
		
		//al1.retainAll(al2); //去交集，al1中只会保留存在的。没有交集就什么也没有，提取交集用的，类似于改变数据的事情。
		al1.removeAll(al2);
		sop(al1);
		sop(al2);
	}
	
	public static void base_method(){
		//创建一个集合容器，使用Collection接口的子类，ArrayList
		
				ArrayList  al = new ArrayList();
				
				//1.添加元素
				al.add("Java01");
				al.add("Java02");
				al.add("Java03");
				al.add("Java04");
				
				//打印 改变前的集合
				sop(al);
				
				//3. 删除集合
				//al.remove("Java02");
				//清空集合
				al.clear();
				
				//打印 改变前的集合
				sop(al);
				
				//2.获取集合长度
				sop("Size: "+ al.size());
				
				//4.判断元素
				sop("Java03 是否存在？" + al.contains("Java03"));
				sop("Java集合是否为空？" + al.isEmpty());
	}
	
	public static void method_get(){
		
		//Iterator 接口，有三个方法，好简单啊。。。
		
		ArrayList  al1 = new ArrayList();		
		//1.添加元素
		al1.add("Java01");
		al1.add("Java02");
		al1.add("Java03");
		al1.add("Java04");
		
		Iterator it = al1.iterator();

		while ( it.hasNext()) {
			sop(it.next());			
		}
		
		for(Iterator itr = al1.iterator(); itr.hasNext();){
			sop(itr.next());		
		}
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
