package com.codewithjunaid_lab2;

import java.util.Scanner;
/** ques,15(b)-) To check given number is an Armstrong number or 
perfect number or palindrome or none of these?
*/
public class ArmstrongNumber {
	
	static boolean isArmstrong(int n) {
	
	int temp,digits=0,last=0,sum=0; 
	temp=n;
	while(temp>0) {
		temp=temp/10;
		digits++;
		
	}
	temp=n;
	while(temp>0) {
		last=temp%10;
		sum+=(Math.pow(last, digits));
		temp=temp/10;
	}
	if (n==sum) 
		return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number to check Armstrong number:");
		int num=sc.nextInt();
		
			if(isArmstrong(num)) 
				
			
				System.out.println("the number is Armstrong Number:"+num);
				else 
					System.out.println("the number is not Armstrong Number"+num);
	}
}	
	
                	//OR       
//   static boolean isArmstrong(int n) {
//   int z,count=0,digit,i,pro,sum=0;	
//   
//	z=n;
//	while(z>0) 
//	{	
//		z=z/10;
//        count++;
//	}
//	z=n;
//	while(z>0) {
//	digit=z%10;
//    sum+=(Math.pow(digit,count));
//    z=z/10;
//    }
//	
//	if(n==sum)
//    return true;
//    else return false;
//    }
//
//public static void main(String[] args) {
//	Scanner sc=new Scanner (System.in);
//	System.out.println("Enter number to check Armstrong number:");
//	int num=sc.nextInt();
//	if (isArmstrong(num))
//		System.out.println("Armstrong Number "+num);
//	else
//		System.out.println("not Armstrong Number "+num);
//}
//}


	


