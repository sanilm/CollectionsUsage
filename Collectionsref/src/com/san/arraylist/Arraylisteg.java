/*doesnt store repeated content returns in the order inserted*/
package com.san.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylisteg {

	public ArrayList<String> list()
	{
		
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("fourth");
		arraylist.add("second");
		arraylist.add("second");
		arraylist.add("third");
		arraylist.add(null);
		arraylist.add("first");
		
		
		return arraylist;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Arraylisteg arraylist=new Arraylisteg();
				ArrayList<String> list=arraylist.list();
				
				Iterator< String> it = list.iterator();
				
				
				
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				//print in reverse order
				
				for (ListIterator iterator = list.listIterator(list.size()); iterator.hasPrevious();) {
					 
					  System.out.println(iterator.previous());
					}
				
		
	}

	
	
}
