package com.app;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {
	public static <list> void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("Apple");
        l.add("Mango");
        l.add("Apple");
        l.add("Mango");
        System.out.println("original list :"+l);
        Set<String> s=new LinkedHashSet<String>();
        s.addAll(l);
        System.out.println("Duplicate elements :"+s);
    }
}
