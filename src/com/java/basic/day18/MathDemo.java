package com.java.basic.day18;

public class MathDemo {

	public static void main(String[] args) {
		
		for(int x = 0; x < 20 ; x++){
			int d = (int)(Math.random()*6 + 1);
			sop(d);
		}
	}
	
	public static void sop(Object obj) {
		System.out.println(obj);
	}
	
	public static void show(){
		double d = Math.ceil(12.34);
		sop("d = " + d);
		
		
		long l = Math.round(18.54);
		sop("l = " + l);
	}
}
