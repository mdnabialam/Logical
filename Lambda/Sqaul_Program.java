package com.java.Lambda;

@FunctionalInterface
interface Sqlinterface{
	public int cube(int i);
}

public class Sqaul_Program {
	public static void main(String[] args) {
		 Sqlinterface s = (i) -> i*i*i;
		 System.out.println(s.cube(3));
	}
}
