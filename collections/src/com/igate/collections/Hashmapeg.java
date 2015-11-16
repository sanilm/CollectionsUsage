package com.igate.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapeg {

	void hmap()
	{
		
		HashMap hm= new HashMap<>();
		
		hm.put(null, "san");
		hm.put(8, "san");

		hm.put(2, "san");

		hm.put(3, "man");

		hm.put(4, "dan");
		
		Iterator entries = hm.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashmapeg h=new Hashmapeg();
		h.hmap();
		
		
	}

	
	
}
