package com.java;

import java.util.HashMap;


public class Haspmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> value = new HashMap<String,Integer>();
		value.put("Vishnu",2);
		value.put("Don",5);
		value.put("rasc",3);
		
//		System.out.println(value);
//		value.put("lax", 8);
//		value.remove("Don", 5);
//		
//		System.out.println(value);
		value.forEach((k,v) ->{
			System.out.format("keys:%s, value :%d%n" , k,v);
			});
	
		
		/*
		 * for(String name : value.keySet()) { System.out.println("value = "+name); }
		 * for (Integer number : value.values()) {
		 * 
		 * System.out.println("Number = " +number); }
		 */


	}
	
	

}
