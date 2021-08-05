package com.codewithjunaid_lab2;

import java.util.Scanner;

public class Reverse_A_Array {
		int arr []= new int[5];
		void getdata() {		
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++) {
	System.out.println("Enter no of array");
	arr[i]=sc.nextInt();
}

System.out.println("Original length is:");
for( int i=0;i<5;i++) 
{
	System.out.println(arr[i]+" ");	
}

System.out.println();

System.out.println("Array in reverse order:");
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]+" ");
}
		}
		
public static void main(String[] args) {
	Reverse_A_Array aa=new Reverse_A_Array();
     aa.getdata();

	}
}

