package com.igate.mvtec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mvetec1b {

	
	
	
	    public static void main(String[] args)
	    {
	        String original = "edcba";
	        char[] chars = original.toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        System.out.println(sorted);
	    }
	

	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		String str1="usewan";
		
		
		Set<Character> hs=new HashSet<>();
		
		
		
		for(int i=0;i<str1.length();i++)
		{
			hs.add(str1.charAt(i));
		}
		
		
		Iterator<Character> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	*/
	
}
