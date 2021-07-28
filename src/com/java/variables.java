package com.java;

public class variables {

	
	static int x = 10;//static variable 
	int y=20;//instance varible
	
	public int display() {
		int z = 30;//local variable
		return z;
		
	}
	
	public static void main(String[] args) {
     
		System.out.println(x);
		 variables a = new variables();
		 System.out.println(a.y);
		 System.out.println(a.display());

	}

}
