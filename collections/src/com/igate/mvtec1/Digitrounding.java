package com.igate.mvtec1;

import java.math.BigDecimal;
import java.util.Arrays;

public class Digitrounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Double num=2.3439999;
		int num1=4;
		
		/*String str=num.toString();
		System.out.println(str);
		String[] split=str.split(".");
		for(String i : split)
		{
			System.out.println(split);
		}
		System.out.println(Arrays.toString(split));
		*/
		
		/*double x = num - Math.floor(num);*/
		/*double x = num % 1;
		
		System.out.println(x);
		
		*
		*/
		
		BigDecimal bd=new BigDecimal(num);
		bd=bd.setScale(5, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd.doubleValue());
		
		/*String numberD = String.valueOf(num);
        numberD = numberD.substring ( numberD.indexOf ( "." ) );
        System.out.println(numberD);

		int length=numberD.length();
		System.out.println(length);
		String num4="5";
		for(int j=0;j<num1-1;j++)
		{
			num4=num4+0;
		}
		System.out.println(num4);
		int foo=Integer.parseInt();
		System.out.println(foo);
		
*/		
	}

}
