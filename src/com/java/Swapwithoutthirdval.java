 package com.java;

public class Swapwithoutthirdval {
	
	public static void main(String args[]) {


	int x = 50;
	int y = 20;
	int z;
	 System.out.println("X value before swap:" +x);
	 System.out.println("Y value before swap:" +y);
		/*
		 * x = x+y; y = x-y; x = x-y;
		 */
	 
	 z = y-x;
	 y = y-z;
	 x = y+z;
	 
	 
	 System.out.println("X value after  swap:" +x);
	 System.out.println("Y value after swap:" +y);
}
	
}