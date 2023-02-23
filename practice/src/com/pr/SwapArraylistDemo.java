package com.pr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArraylistDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("Element before swapping: "+list);

		Collections.swap(list, 1, 2);
		
		System.out.println("After swapping: "+list);
	}

}
