package com.codewithjunaid_lab2;

import java.lang.reflect.Array;
import java.util.Scanner;
/*
*Ques-5. Write a program to calculate average of the n number using a 
separate function other than main. 
*/

public class AverageOfNNumbers {
public static void main(String[] args) {
	
	int n,count=1;
	
	float f, averageA, sumS = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n=sc.nextInt();
	
	while (count<=n) {//if count <=given number
		System.out.println("Enter the "+ count +" number ?");
		f=sc.nextInt();
		sumS+=f;
		++count;
	}
	
	averageA=sumS/n;
	System.out.println("The Average is :"+averageA);
	
	
}
}

