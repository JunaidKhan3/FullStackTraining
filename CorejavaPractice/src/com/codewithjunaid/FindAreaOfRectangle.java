package com.codewithjunaid;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		double length,width;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter length of rectangle:");
		length=sc.nextDouble();
		System.out.println("enter width of rectangle:");
		width=sc.nextDouble();
		
		double area=length*width;
		
		System.out.println("Area of rectangle is:"+area);
	}

}
