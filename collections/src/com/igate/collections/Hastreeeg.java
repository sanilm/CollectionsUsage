package com.igate.collections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Hastreeeg {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hastreeeg h=new Hastreeeg();
	
		
		
	}

	public Hastreeeg() {
		super();
		TreeMap<Integer, String> ht= new TreeMap<>();
		ht.put(1, "san");
		ht.put(1, "san");
		ht.put(2, "san");
		ht.put(8, "gfg");
		ht.put(4, "man");
		ht.put(5, "dan");
		
		Iterator entries = ht.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value);
		}
		
		System.out.println("hello");
		// TODO Auto-generated constructor stub
	}
	
	
}
