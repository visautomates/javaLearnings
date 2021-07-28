package com.java;



public class SeprateNAS {

	public static void main(String[] args) {

   separateNumberAlpSepi("vishnu123@#$");
	}
	
	public static void separateNumberAlpSepi(String data) {
		
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer() , Special = new StringBuffer();
		
		for (int i =0;i<data.length();i++) {
			
			if(Character.isAlphabetic(data.charAt(i))) {
				
				alpha.append(data.charAt(i));
	
			}else if(Character.isDigit(data.charAt(i))) {
				num.append(data.charAt(i));
			}else Special.append(data.charAt(i));
		}
		System.out.println("Aplabets are: "+alpha);
		System.out.println("numbers are: "+num);
		System.out.println("Special charters are: "+Special);
		
		
	}
}
