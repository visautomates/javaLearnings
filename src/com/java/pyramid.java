package com.java;

public class pyramid {

	public static void main(String[] args) {
		
		int x, y,row = 3;
		for (x = 0; x < row ; x++) {

			for (y = row - x; y > 1; y--) 
			{
				System.out.print("  ");
			}
			for (y = 0; y <= x; y++) {

				System.out.print(" *  ");
			}
			System.out.println();
		}
		 

		//cop();

	}

	public static void cop() {

		int x, y, row = 5;

		for (x = 0; x < row; x++) {

			for (y = row - x; y > 1; y--) {

				System.out.print(" ");
			}

			for (y = 0; y <= x; y++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
