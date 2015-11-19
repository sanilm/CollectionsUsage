package com.igate.numbeerword;

public class Numberofwords {

	
	public static void main(String[] args) {
	
		int count = 0;
		String str= "hello how are you";
		 String[] str1=str.split(" ");
		 for(String i : str1)
		 {
			 
			 count++;
			 
		 }
		 System.out.println(count);
	}
	
	
}
