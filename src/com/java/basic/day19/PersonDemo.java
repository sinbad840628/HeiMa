package com.java.basic.day19;

/*
   装饰设计模式：
   当想要对已有的对象进行功能增强的时候，
   可以定义类，将已有对象传入，基于已有的功能，并提供加强版的功能。
   那么这些自定义的类称为装饰类。
 */
public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		System.out.println("==========华丽的分割线==============");
		SuperPerson sp = new SuperPerson(p);
		sp.superEating();
	}
}
