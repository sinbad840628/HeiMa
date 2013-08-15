package com.java.basic.day19;

public class SuperPerson {

	private Person p;
	
	public SuperPerson(Person p) {
		this.p = p;
	}
	
	public void superEating(){
		System.out.println("¿ªÎ¸²Ë");
		p.eat();
		System.out.println("Ìðµã");
		System.out.println("³éÑÌ");
	}
}
