package com.pr;

import java.util.Scanner;

public class CountEvenOddNum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int even_ct=0;
        int odd_ct=0;
        while (num>0){
            int rem=num%10;
            if (rem%2==0){
                even_ct++;
            }
            else {
                odd_ct++;
            }
            num=num/10;
        }
        System.out.println("number of even digits in a number is:"+even_ct);
        System.out.println("number of odd digits in a number is:"+odd_ct);
    }
}
