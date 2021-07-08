package com.codewithjunaid;

import java.util.Scanner;

public class MultiplicationOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter Second number:");
		int y=sc.nextInt();
		
		int z=x*y;
		
		System.out.println("Multiplication of both number is:"+z);
	}
}
