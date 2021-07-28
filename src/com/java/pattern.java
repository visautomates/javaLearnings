package com.java;

public class pattern {
	static int i, j, row = 5;

	public static void main(String[] args) {
		righttriangle();
		lettriangle();
		Atriangle();
	}

	public static void righttriangle() {

		for (i = 0; i <= row; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void lettriangle() {

		for (i = 0; i < row; i++) {

			for (j = 2*(row-i); j >= 0; j--) {
				
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}
	}
	public static void Atriangle() {

		for (i = 0; i < row; i++) {

			for (j = row-i; j >= 0; j--) {
				
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}
	}
	
}
