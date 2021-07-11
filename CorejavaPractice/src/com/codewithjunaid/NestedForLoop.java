package com.codewithjunaid;

public class NestedForLoop {

	public static void main(String[] args) {
		int number[]=new int[3];
		for(int i=1;i<=number.length;i++) {
			for(int j=1;j<=number.length;j++) {
				System.out.println(i+" "+j);
			}
		}

	}

}
