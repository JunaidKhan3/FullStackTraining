package com.codewithjunaid;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		int num=0;
		int reverseNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for reverse: ");
		num=sc.nextInt();
		
		while(num!=0)
		{
			reverseNum=reverseNum*10;
			reverseNum=reverseNum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of input number is:"+reverseNum);
	}
}
