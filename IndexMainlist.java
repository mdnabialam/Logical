package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexMainlist {
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("NABI ALAM");
		list.add("MD NABI");
		list.add("NABI");
		list.add("Zohan");
		list.add("Fatima");
		
		System.out.println(list);
		int index1=1,index2=4;
		if (index1 >=0 && index1<list.size() && index2 >=0 && index2<list.size()) {
			Collections.swap(list, index1, index2);
			System.out.println(list);
		} else {

		}
	}

}
