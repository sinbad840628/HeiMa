package com.java.basic.day19;

public class SuperPerson {

	private Person p;
	
	public SuperPerson(Person p) {
		this.p = p;
	}
	
	public void superEating(){
		System.out.println("��θ��");
		p.eat();
		System.out.println("���");
		System.out.println("����");
	}
}
