package com.pr;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element of array");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of element is "+sum);
	}

}
