package com.java.basic.day19;

/*
   װ�����ģʽ��
   ����Ҫ�����еĶ�����й�����ǿ��ʱ��
   ���Զ����࣬�����ж����룬�������еĹ��ܣ����ṩ��ǿ��Ĺ��ܡ�
   ��ô��Щ�Զ�������Ϊװ���ࡣ
 */
public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		System.out.println("==========�����ķָ���==============");
		SuperPerson sp = new SuperPerson(p);
		sp.superEating();
	}
}
