package com.codewithjunaid_lab2;

import java.util.Scanner;

public class Two_Dimensional_Rectangular_Array_Q11 {
int a=4;
int arr[] []=new int[a][a];
void getdata() {
	Scanner sc =new Scanner(System.in) ;
	for(int i=0;i<a;i++) 
	for(int j=0;j<=i;j++) {
		System.out.println("Enter numbers:");
		arr[i][j]=sc.nextInt();
		
	}
}
	void putdata() {
		System.out.println("Entered ("+a+" x "+a+") Matrix is: ");
		System.out.println("------------------------------------");
		for (int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println(" ");
		}
	
	}
	public static void main(String[] args) {
		Two_Dimensional_Rectangular_Array_Q11 aa=new Two_Dimensional_Rectangular_Array_Q11();
		aa.getdata();
		aa.putdata();
	}
	}

//	public static void main(String[] args) {
//		int a=4,z=1;
//		int matrix[][]=new int[a][a];
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j <= i; j++) {
//				matrix[i][j]=z;
//				z++;
//			}
//		}
//		System.out.println("Entered ("+a+" x "+a+") Matrix is: ");
//		System.out.println("------------------------------------");
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//			System.out.println(" ");
//		}
//		System.out.println("------------------------------------");
//	}
//}



	  