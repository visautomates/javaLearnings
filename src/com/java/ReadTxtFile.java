package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTxtFile {

	
	public static void main(String args[]) throws Exception {
		
		File Filepath = new File( "C:\\Users\\Vishnu\\eclipse-workspace\\javap\\src\\utilities\\javalearn.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(Filepath));
		
		String st;
		
	   while((st=br.readLine()) !=null)
	   {
		   System.out.println(st);
	   }
		
	}
}
