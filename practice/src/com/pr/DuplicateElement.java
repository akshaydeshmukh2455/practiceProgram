package com.pr;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,2,5};
		System.out.println("Duplicate element in the given array:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

	}

	
}
