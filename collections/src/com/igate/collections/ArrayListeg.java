package com.igate.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListeg {
	
	void alist()
	{
		System.out.println("in class");
		ArrayList<String> al = new ArrayList<>();
		al.add("san");
		al.add("man");
		al.add("man");
		al.add("san");
		
		Iterator< String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (ListIterator iterator = al.listIterator(al.size()); iterator.hasPrevious();) {
			 
			  System.out.println(iterator.previous());
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListeg al=new ArrayListeg();
		System.out.println("inmain");
		al.alist();
		
		
		
	}

}
