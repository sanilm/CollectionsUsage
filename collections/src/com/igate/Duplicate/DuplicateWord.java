package com.igate.Duplicate;

import java.util.HashSet;
import java.util.Iterator;

import com.igate.collections.Hasseteg;

public class DuplicateWord {
	public void dup(String s1)

	{
		HashSet<Character> hs=new HashSet<>();
		
		
		for(int i=0;i<s1.length();i++)
		{
			hs.add(s1.charAt(i));
		}
		
		Iterator<Character> it =hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DuplicateWord dw=new DuplicateWord();
dw.dup("saanji");
		
		
		
	}
	
}
