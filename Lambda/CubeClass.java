package com.java.Lambda;
@FunctionalInterface
interface cub{
	public int cubNew (int i);
}


public class CubeClass {
	public static void main(String[] args) {
		
		cub c = (i) -> i*i*i;
		System.out.println(c.cubNew(5));
	}
}
