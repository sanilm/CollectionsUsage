/* null cannot be key values are retuned randomly*/
package com.san.hashtree;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Hashtreeref {
	
	
	
	public TreeMap<String, Integer> map()
	{
		TreeMap<String, Integer> treemap=new TreeMap<>();
		treemap.put("second", 2);
		treemap.put("second", 2);
		treemap.put("first", 1);
		/*treemap.put(null, 1);*/
		treemap.put("third", 3);
		treemap.put("fourth", 4);
		return treemap;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtreeref treemap=new Hashtreeref();
		TreeMap<String, Integer> map=treemap.map();
		Iterator entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value);
		}
	}

}
