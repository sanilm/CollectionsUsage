/* hashmap doesnt store repeated keys and doesnt return in order*/

package com.san.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapref {

	
	public HashMap<String, Integer> hmap()
	{
		
		HashMap<String, Integer> hashmap=new HashMap<>();
		
		hashmap.put("fourth", 4);
		hashmap.put("fourth", 4);
		hashmap.put("second", 2);
		hashmap.put("third", null);
		hashmap.put(null, 4);
		hashmap.put("first", 1);
		
		return hashmap;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashmapref hashmap=new Hashmapref();
		HashMap<String, Integer> hmap=hashmap.hmap();
		
		Iterator entries = hmap.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value);
		
		}
		
	}

}
