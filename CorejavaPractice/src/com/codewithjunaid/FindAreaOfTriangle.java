package com.codewithjunaid;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		
		double Base,Height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of Triangle:");
		Base =sc.nextDouble();
		System.out.println("Enter height of Triangle:");
		Height=sc.nextDouble();
		
		double area=(Base*Height)/2;
		System.out.println("Area of Triangle is:"+area);
		

	}

}
