package com.codewithjunaid;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	
	int num;
	System.out.println("Enter a number to find Even or Odd:");
	
	Scanner sc=new Scanner(System.in);
	num =sc.nextInt();
	//The input provided by user stored in j
	
/* if a number is divisible by 2 then it's a even number
 * else odd number*/
	
	if(num % 2==0)
	{
		System.out.println("The given number is even.....");
	}
	else
		System.out.println("The given number is odd......");
}
}
