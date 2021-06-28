package com.java;

public class Numbervalida {

	static int num = 100;

	public static void main(String args[]) {

		for (int i = 0; i <= num; i++) {

			if (i % 3 == 0 & i % 5 == 0) {
				
				System.out.println("Values is divisble by 3&5:" + i);

			}
			else if (i % 3 == 0)
				System.out.println("Divisble by 3 : "+i);
			if (i % 5 == 0) {

				System.out.println("Divisble by 5 : " +i);
			}

		}

	}

}
