package com.codewithjunaid;

import java.util.Scanner;

public class ArrayInput {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("Enter the Elements:");
	
	for(int i=0; i<10; i++) 
	{
	array[i] = sc.nextInt();
	sum= sum + array[i];
	}
	System.out.println("Sum of Array Elements is: "+sum);

}
}
