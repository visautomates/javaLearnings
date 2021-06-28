package com.java;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
     inputfrmUser();

	}
	
	public static void inputfrmUser() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the firs value: ");
        String value1 = input.next();
        System.out.println("Enter the Second value: ");
        String value2 = input.next();
        
       System.out.println(value1);
       System.out.println(value2);
        
	}

}
