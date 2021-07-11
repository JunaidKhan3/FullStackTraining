package com.codewithjunaid;

public class SumOfArrayValues {
public static void main(String[] args) {
	
	int Array[]= {10,20,30,40,50,60,70,80};
	int sum = 0;
	//Advanced for Loop
	
	for(int num : Array) {
		sum=sum + num;
		
	}
	System.out.println("Sum of Array elements is :"+sum);
}
}
