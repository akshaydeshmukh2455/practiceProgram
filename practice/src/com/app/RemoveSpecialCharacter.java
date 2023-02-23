package com.app;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str="2hfhhh@7&!java";
		
		String plainString=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainString);
	}
	
	
}
