package com.codewithjunaid_lab2;

public class ResizeAnArray {

	public static void main(String[] args) {
		
		int arr1[]= {0,1,2,3,4,5};
		int arr2[]= {5,10,20,30,40,50};
		
		System.arraycopy(arr2, 0, arr2, 0, 0);
		System.out.print("array2 = ");
		System.out.print(arr2[0]+ " ");
		System.out.print(arr2[1]+ " ");
		System.out.print(arr2[2]+ " ");
		System.out.print(arr2[3]+ " ");
		System.out.print(arr2[4]+ " ");
		System.out.print(arr2[5]+ " ");
		
		
	}

}
