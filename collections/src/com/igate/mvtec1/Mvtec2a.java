package com.igate.mvtec1;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Mvtec2a {

	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Name : ");
		String name = sc.nextLine();

		
		char ch;
		String str;
		char[] charArray;
		int  v1=96;
		int v2=0;
		int value,j,ct = 0;
		HashMap<Integer, String> hs=new HashMap<>();
		
		//String[] sb=new String()[];
		String[] sb = name.split(" ");
		for(String i:sb)
		{  
		    charArray=i.toCharArray();
		    ct = 0;
		    for (char ch1 : charArray) 
		    {
				value = (int)ch1;
				v2=value-v1;
				ct = ct + v2;
			}  
		    
		    hs.put(ct, i);
		}
		Iterator entries = hs.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object key = thisEntry.getKey();
		  Object value1 = thisEntry.getValue();
		  System.out.println("key"+ key +" value"+ value1);
		}
	}
}
