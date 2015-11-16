package com.igate.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hasseteg {

	void hset()
	{
		
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("san");
		hs.add("kong");
		hs.add("san");
		hs.add("ssss");
		hs.add("ssswweew");
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
HashSet<Integer> hs1=new HashSet<>();
		
		hs1.add(3);
		hs1.add(1);
		hs1.add(3);
		hs1.add(4);
		hs1.add(2);
		
		
		Iterator<Integer> it1 =hs1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hasseteg h=new Hasseteg();
		h.hset();
		
		
	}
	
	
}
