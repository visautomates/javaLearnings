package com.java;

public class PrimeNUm {

	public static void main(String[] args) {

		getPrime(27);
		getPrime(5);
		getPrime(6);
		
	}

	public static void getPrime(int n) {

		int flag = 0, m = 0;

	

		if (n == 0 || n == 1) {

			System.out.println(n + " is not a prime number");

		} else {
			m = n / 2;
			for (int i = 2; i <= m; i++) {
				
				if (n % i == 0) {
					System.out.println("given number is  " + n + "  not a  prime");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(n + " is a prime");

			}
		}
	}
}
