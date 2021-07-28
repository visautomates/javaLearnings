package com.java;

public class ReverseString {

	static String rev1 = "";
	static String rev2 = "";
    
	public static void main(String[] args) {
 
		System.out.println(revone(" yob doog si siv"));
		//System.out.println(revchar("love"));
		//UseStngBuff("life");

	}

	// using string concatenation)
	public static String revone(String Str) {
		int len = Str.length();// getting the lenth of the string

		for (int i = len - 1; i >= 0; i--) { // lenth-1 because index value start from zero

			rev1 = rev1 + Str.charAt(i);

		}
		return rev1;

	}
	// using character array
	public static String revchar(String str) {
		
		char a[] = str.toCharArray();
		
		 int length = a.length;
		 for (int i=length-1;i>=0;i--) {
			 
			 rev2 = rev2+a[i];
			 
			 
		 }return rev2;
	}
//using StringBuffer
	
	public static void UseStngBuff(String str) {
		
		StringBuffer sB = new StringBuffer(str);
			System.out.print(sB.reverse()); 
	}
}
