/* doesnt store repeated values and returns in random order*/
package com.san.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetref {

	
	public HashSet<String> set()
	{
		HashSet<String> set=new HashSet<>();
		set.add("second");
		set.add("first");
		set.add("first");
		set.add(null);
		set.add("fourth");
		set.add("third");
		return set;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashsetref hset=new Hashsetref();
		HashSet<String> set=hset.set();
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
