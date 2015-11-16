package com.igate.equals;

public class Equalseq {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1=new String("san");
	String s2=new String("san");
	
	System.out.println(s1==s2);
	
	String s3="san";
	String s4="san";
	
	System.out.println(s3==s4);

	String s5=new String("san");
	 /*  s5="man";
	   
	   System.out.println(s5==s5);
	 */  System.out.println(s1.equals(s5));
	
	
	}
	
	
}
