package com.java;

 public class  Privateclass {  
		/*
		 * The private access modifier is accessible only within the same class. We
		 * can't assign private to outer class and interface. The best use of private
		 * keyword is to create a fully encapsulated class in Java by making all the
		 * data members of that class private. If we make any class constructor private,
		 * we cannot create the instance of that class from outside the class. If we are
		 * overriding any method, overridden method (i.e., declared in the subclass)
		 * must not be more restrictive. According to the previous point, if we assign a
		 * private modifier to any method or variable, that method or variable can be
		 * overridden to sub-class using all type of access modifiers. However, still,
		 * we can't invoke private method outside the class.
		 */ 

	 private class a{
		 
		 void display()  
		 {  
		     System.out.println("Try to access outer private class");  
		 }
	
}
void display()  
{  
    System.out.println("Try to access outer private class");  
}  
public static void main(String[] args) {  
	

Privateclass obj = new Privateclass();
obj.display();
 
 
      
}  


}  
