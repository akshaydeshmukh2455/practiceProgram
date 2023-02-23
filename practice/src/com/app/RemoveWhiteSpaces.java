package com.app;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
			
		String str="   j  a  va  s  ta  r   ";
		//System.out.println(str);
		//String trimmedString=str.trim();
		//System.out.println(trimmedString);
		
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
		
		
	}

}
