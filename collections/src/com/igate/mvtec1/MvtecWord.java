package com.igate.mvtec1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MvtecWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String str1="saan";
		String str2="man";
		
		HashMap hashmap= new HashMap<Character ,Integer>();
		
		int i,j;
		int val;
		
		
		for(i=0;i<str1.length();i++)
		{System.out.println(i);
			for(j=0;j<str2.length();j++)
			{  System.out.println(j);
			System.out.println(str1.charAt(i)==(str2.charAt(j)));
				if(str1.charAt(i)==(str2.charAt(j)))
				{
					if(hashmap.containsKey(str1.charAt(i)))
					{
						int val1=(int) hashmap.get(str1.charAt(i));
						System.out.println(val1);
						hashmap.put(str1.charAt(i), val1 +1);
					}
					
					
					
					/*if(hashmap.containsKey(str1.charAt(i)))
		            {
		                // increment count corresponding to c
						hashmap.put(  str1.charAt(i) ,  hashmap.get(str1.charAt(i)) +1 );
		            }
		            */else
		            {
		            	hashmap.put(str1.charAt(i),1);
		            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			}
		}
		
		Iterator entries = hashmap.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value);
		}
		
		
		
		
		
		
		
	}
	
	
}
