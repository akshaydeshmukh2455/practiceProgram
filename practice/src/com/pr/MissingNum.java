package com.pr;

public class MissingNum {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of element is "+sum1);
		
		int sum2=0;
		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements "+sum2);
		System.out.println("Missing number "+(sum2-sum1));
	}

}
