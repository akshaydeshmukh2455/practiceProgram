package com.pr;

public class FindDuplicateString {

	public static void main(String[] args) {
		String arr[]= {"java","c","abc","c"};
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				//int m=0;
				if(arr[i].equals(arr[j]))
				{
					System.out.println("Duplicate string "+arr[i]);
				}
			}
		}
		if(flag==true)
		{
			System.out.println("No duplicate string");
		}
	}

}
