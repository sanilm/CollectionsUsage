package com.igate.mvtec1;

import java.util.Scanner;

public class Mvtec3a {
	public static void main(String args[])
	{
		
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int even = 0,odd = 0;
 String[] str1=str.split(" ");
 char[] ch;
 
 for (String i : str1) {
	 int count=0;
	 ch=i.toCharArray();
	 for (char c : ch) {
		count++;
		 
	}
	 if(count%2==0)
	 {
		 even++;
	 }
	 else
		 odd++;
	 
}
 System.out.println(even );
 System.out.println(odd);
		
	}
	
	}

