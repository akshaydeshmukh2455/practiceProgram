package com.pr;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapKeySort {

	public static void main(String[] args) {
		
		Map<String , String> unSorted=new HashMap<String, String>();
		unSorted.put("banana", "banana");
		unSorted.put("apple", "apple");
		unSorted.put("guava", "guava");
		unSorted.put("pineapple", "pineapple");
		
		for(Map.Entry<String, String> entry:unSorted.entrySet())
		{
			System.out.println("unSorted Key: "+entry.getKey());
		}

		Map<String, String> treeMap=new TreeMap<String, String>(unSorted);
		for(Map.Entry<String, String> entry:treeMap.entrySet())
		{
			System.out.println("Sorted Key: "+entry.getKey());
		}
	}

}
