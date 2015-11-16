
/*to reverse am array from length k*/
package com.igate.creek;

public class Reversek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] number={1,2,3,4,5,6,7};
		
		int num=4;
		int i,j;
		int temp=0;
		for(i=0; i < num;i++)
		{
			for(j=number.length-1;j>0;j--)
			{
				temp=number[j];
				number[j]=number[j-1];
				number[j-1]=temp;
			}
		}
		for(i=0;i<number.length;i++)
		{
		System.out.println(number[i]);
		
		}
		
		}

}
