package com.java;

import java.util.*;

public class ArraysList {

	public void lisExampls() {

		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();

		list.add("vishnu");
		list.add(0, "Vijay");
		list.add(2, "bashass");
		list.add(3, "kumks");
		list.add("lavas");

		// list.addAll(2, list);
		// list.remove(list.get(1));
		// boolean a = list.addAll(list);
		System.out.println("List1 is " + list);
		// System.out.println("List2 is "+list2);
		// System.out.println(a);

		Iterator itr = list.iterator();
		while (itr.hasNext())
			;
		System.out.println(itr);
	}
	
	public void listint() {
		
		ArrayList <Integer> list = new ArrayList();
		list.add(30);
		list.add(0, 20);
		list.add(1, 40);
		//System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext());
		System.out.println(it);
			
	}

	public static void main(String[] args) {
		ArraysList al = new ArraysList();
		//al.lisExampls();
		al.listint();

	}

}
