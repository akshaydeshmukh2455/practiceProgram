package com.pr;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println(org_str+"is a palindrome number");
		}
		else
		{
			System.out.println(org_str+ " is not a palindrome number");
		}
	}

}
