package com.java.day20130531;

import java.util.Properties;

public class SystemDemo1 {

	
	public static void main(String[] args) {
		
		System.setProperty("Joan", "Sinbad's Wife");
		
		String result = System.getProperty("Sinbad");
		System.out.println("Sinbad " + result);
		
		Properties props = System.getProperties();
		
		for(Object objs :props.keySet()){
			String value = (String)props.get(objs);
			System.out.println(objs +" : "+ value);
		}		
	}
}
