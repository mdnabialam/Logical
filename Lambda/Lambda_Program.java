package com.java.Lambda;

public class Lambda_Program {
	public static void main(String[] args) {
		Cube_Interface cube_Interface = (i) ->i*i*i;
		System.out.println(cube_Interface.cub(2));
	}

}
