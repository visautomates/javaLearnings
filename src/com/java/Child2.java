package com.java;

public class Child2 extends Child1{

	public static void main(String[] args) {
		parent  obj = new parent();
		obj.name();
		parent obj1 = new Child2();
		obj1.name();
		Child1 obj2 = new Child1();
		obj2.name();
		Child1 obj3 = new Child2();
		obj3.name();
		Child2 obj4 = new Child2();
		obj4.name();
	
		

	}
	 public void  name() {
		 
		 System.out.println("this is child2 class");
	 }
	 
	

}
