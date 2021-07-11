package com.codewithjunaid;
import java.util.*;

public class PyramidExample {
	public static void main(String[] args) {
//1st //input directly given in program	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
}
//2nd //input taking by user
//		Scanner sc=new Scanner(System.in);
//System.out.println("enter number of lines:");
//int lines =sc.nextInt();
//int mid=(lines+1/2);
//
////program for first mid 
//
//for(int i=1;i<=lines;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
	}
}

class ReversePyramidExample{
	public static void main(String[] args) {
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class FloydsTriangle{
	public static void main(String[] args) {
		
	int rows,number=1,counter,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the nu of rows of floyd's Triangle:");	
	//Coping user input into an integer variable name rows
	rows=sc.nextInt();
	
	System.out.println("floyds Triangle");
	System.out.println("***************");
	
	for( counter=1 ; counter<=rows ; counter++) {
		for( j=1 ; j<=counter; j++) {
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
	}

	}
	}
	
