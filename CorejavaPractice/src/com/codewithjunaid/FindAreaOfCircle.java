package com.codewithjunaid;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		
		/*we are using radius in double 
		because a user can enter radius in decimals*/
		
		double radius=sc.nextDouble();
		
		//area =pi*(radius*radius)
		double area=Math.PI*(radius*radius);
		System.out.println("The area of circle is: "+area);
		//circumference=2*pi*radius
		
		double circumference=Math.PI*2*radius;
		System.out.println("The circumference of the circle is :"+circumference);
	}
}
