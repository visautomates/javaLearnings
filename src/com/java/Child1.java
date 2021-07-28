package com.java;

public class Child1 extends parent{
	
	public static void main(String args[]) {
		
		parent  obj = new parent();
		obj.name();
		parent obj1 = new Child1();
		obj1.name();
		Child1 obj2 = new Child1();
		obj2.name();
		//Child1 obj3 = new parent();
		//obj3.name();
		
	}
	
	
	 public void name() {
		 
		 System.out.println("this is child");
	 }

}
 

