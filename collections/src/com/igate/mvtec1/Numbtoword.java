package com.igate.mvtec1;

public class Numbtoword {

	private static final String[] hundredsname = {
        "",
        " onehundred",
        " twohundred",
        " threehundred",
        " fourhundred",
        " fivehundred",
        " sixhundred"
    };
  
	
	
	private static final String[] specialNames = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	    };
	 
	 private static final String[] tensNames = {
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	    };
	    
	    private static final String[] numNames = {
	        "",
	        " one",
	        " two",
	        " three",
	        " four",
	        " five",
	        " six",
	        " seven",
	        " eight",
	        " nine",
	        " ten",
	        " eleven",
	        " twelve",
	        " thirteen",
	        " fourteen",
	        " fifteen",
	        " sixteen",
	        " seventeen",
	        " eighteen",
	        " nineteen"
	    };
	 
	 
	 
	private String convert(int numb)
	{int num = 0;
	String str;
	int last;
	int remai;
	
	int length = String.valueOf(numb).length();
	System.out.println(length);
	
	for(int i=0;i<length;i++)
	{
		 last=numb%10;
		 numb=numb/10;
		 
	}
	
	
	
	
	
	
		return convert(num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numbtoword nw=new Numbtoword();
		
		
		
		
		
		
	}

}
