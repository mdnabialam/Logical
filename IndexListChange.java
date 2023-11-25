package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexListChange {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(2);
		integers.add(78);
		integers.add(45);
		integers.add(25);
		integers.add(6);
		integers.add(44);
		System.out.println("This Real List"+integers);
		int index1=0,index2=5;
		if (index1 >=0 && index1 <integers.size() && index2>=0 && index2 <integers.size()) {
			Collections.swap(integers, index1, index2);
			System.out.println(integers);
		} else {
			System.out.println("Invaild Index Number");
		}
	}

}
