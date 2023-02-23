package com.interview;

public class DuplicateString {

	public static void main(String[] args) {
		String str[]= {"java","c","java","python","c++"};
		boolean flag=false;
		
		for(int i=0;i<=str.length;i++)
		{
			for(int j=i+1;j<=str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					System.out.println("Duplicate String "+str[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("No Duplicates");
		}
	}

}
