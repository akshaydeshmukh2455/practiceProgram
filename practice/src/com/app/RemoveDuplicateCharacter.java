package com.app;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String str="programming";
		
		//Approach 1 using java8
		
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println(sb);
		
		//using indexOf
		
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			
			if(idx==-1)
			{
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		
		//using character array
		
		char [] arr=	str.toCharArray();
		StringBuilder sb2=new StringBuilder();
		
		for(int i=0;i<arr.length;i++)	
		{
			boolean repeated=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
			}
			
			if(!repeated)
			{
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);
		
		//using set interface
		
		StringBuilder sb3=new StringBuilder();
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		for (Character character : set) {
			sb3.append(character);
		}
		System.out.println(sb3);
	}

}
