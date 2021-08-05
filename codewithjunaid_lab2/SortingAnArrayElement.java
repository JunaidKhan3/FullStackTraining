package com.codewithjunaid_lab2;

import java.util.Scanner;

public class SortingAnArrayElement {

		int a[]=new int[5];
		void getdata() {
Scanner sc=new Scanner(System.in);
int i;
for(i=0;i<5;i++) {
	System.out.println("Enter number");
a[i]=sc.nextInt();
}
}
		
void sorting() {
	int i,j,t;
	for(i=0;i<4;i++) {
		for(j=i+1;j<5;j++) {
			if(a[i]>a[j]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
}
		void putdata() {
			int i;
			for(i=0;i<5;i++) {
				System.out.println(a[i]);
			}
		}
		public static void main(String[] args) {
		SortingAnArrayElement SAAE=new SortingAnArrayElement();
		SAAE.getdata();
		System.out.println("Unsorted Array");
		SAAE.putdata();
		System.out.println("Sorted Array is:");
		SAAE.sorting();
		SAAE.putdata();
		}
		
	}



