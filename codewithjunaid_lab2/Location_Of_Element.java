package com.codewithjunaid_lab2;

public class Location_Of_Element {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println(("Initial ELement : "));
	int temp=0;
	for(int i: a) {
		System.out.println(i+" ");
		
	}

	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
	System.out.println();
	System.out.println("Reversed Element: ");
	
	for(int f:a) {
System.out.println(f+" ");

	}
	}

}
