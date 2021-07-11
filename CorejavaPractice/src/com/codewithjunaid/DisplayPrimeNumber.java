package com.codewithjunaid;
import java.util.*;
public class DisplayPrimeNumber {

	public static void main(String[] args) {
		int i=0;
		int num=0;
		//Empty String
		String PrimeNumbers=" ";

		for(i=1;i<=100;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				//Appended the prime number to the String
				PrimeNumbers=PrimeNumbers + i + " "; 
			}
		}
		System.out.println("Prime Numbers from 1 to 100 are:");
		System.out.println(PrimeNumbers);
	}
		
}	 
                          //OR
class check{
	public static void main(String[] args) {
		int i,num;
for(i=1;i<=100;i++) {
	int count=0;
	for(num=1;num<=i;num++) {
		if(i%num==0)
			count=count+1;		
	}
	if(count==2) 
		System.out.println(i);
}
}
}	
