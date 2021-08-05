package com.codewithjunaid_lab2;

import java.util.Scanner;

public class Two_Dimensional_Rectangular_Array_Q10 {
	int a1=4,b1=4;
int a[][]=new int[a1][b1];

void getdata() {
	Scanner sc=new Scanner(System.in);
	for (int i=0;i<a1;i++) 
		for(int j=0;j<b1;j++) {
			System.out.println("Enter Number:");
			a[i][j]=sc.nextInt();
		}
}
void putdata() { 
	System.out.println("Entered ("+a1+" x "+b1+") Matrix is: ");
	System.out.println("------------------------------------");
	for(int a[]:a) {
		for(int e:a) {		
		System.out.print(e+"\t");
	}
	System.out.println(" ");
}
		}

public static void main(String[] args) {
	Two_Dimensional_Rectangular_Array_Q10 TDRA=new Two_Dimensional_Rectangular_Array_Q10();
	TDRA.getdata();
	TDRA.putdata();
}
}



//                                     or



//	public static void main(String[] args) {
//		int a=4,b=4,z=1;
//		int matrix[][]=new int[a][b];
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < b; j++) {
//				matrix[i][j]=z;
//				z++;
//			}
//		}
//		System.out.println("Entered ("+a+" x "+b+") Matrix is: ");
//		System.out.println("------------------------------------");
//		for (int o[]: matrix) {
//			for (int e : o) {
//				System.out.print(e+"\t");
//			}
//			System.out.println(" ");
//		}
//		System.out.println("------------------------------------");
//	}
//	}
