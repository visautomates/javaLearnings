package com.java;

public class Cstr {
	
	int id , age;
	String name;
	
	Cstr(int i , int a){
		
		id = i;
		
		age = a;
	}
	Cstr(String n , int i, int a){
		
		id=i;
		age =a;
		name = n;
	}
	void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
	
           Cstr obj = new Cstr(1205, 10);
           obj.display();
           Cstr obj2 = new Cstr("Vishnu", 20111, 27);
           obj2.display();
     
	}

}
