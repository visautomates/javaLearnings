package com.java;

public class MissingValue {
	
	public static void main(String []args) {
	
	int []arr = {0,5,4,3,2,1,7};
	 int a = arr.length;
	 System.out.println(a);
	 int sum = (a*(a+1))/2;
	 System.out.println(sum);
	 
	 for(int i=0;i<a;i++) {
		
		 sum=sum-arr[i];
		
		 
	 }
	 
	 System.out.println("missing number:"+sum );
	 
	 
	}

}
