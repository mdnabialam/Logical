package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TryClass {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("FFF");
		System.out.println("ORG LIST" +list);
		int index1=1,index2=3;
		if (index1 >=0 && index1<list.size()
				&& index2 >=0 && index2 <list.size()) {
			Collections.swap(list, index1, index2);
			System.out.println(list);
		}
	}
}
