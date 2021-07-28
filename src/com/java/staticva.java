package com.java;

public class staticva {

	static int a = 5;

	public int b = 5;

	public void increment(int x, int y) {
		
		x = ++x;
		y = ++y;

		a = x;
		b = y;

		System.out.print(x);
		System.out.print(y);

	}

	public static void main(String args[]) {

		staticva obj = new staticva();
		obj.increment(a, obj.b);
		//obj.increment(a, obj.b);

		staticva obj1 = new staticva();
		obj1.increment(a, obj1.b);
		obj1.increment(a, obj1.b);

	}

}
