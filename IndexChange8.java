package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexChange8 {
	public static void main(String[] args) throws Exception {
	
		//List<String> list = List.of("AA", "BB", "CC", "DD", "EE", "FF", "GG");
		 List<String> list = new ArrayList<>();
		 list.add("AA");
		 list.add("BB");
		 list.add("CC");
		 list.add("DD");
		 list.add("EE");
		 list.add("FF");
		 list.add("GG");
		
		System.out.println("Original List String -> "+list);
		System.out.println();
		
		int index1=0;
		int index2=6;
		

        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            Collections.swap(list, index1, index2);
            System.out.println("List after swapping elements at index " + index1 + " and " + index2 + ": " + list);
        } else {
            System.out.println("Invalid index positions.");
        }
		
	}

}
