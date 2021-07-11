package com.codewithjunaid;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		
		int i,count=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Prime Number or Not:");
		n=sc.nextInt();
		
		 i=1;
		while(i<=n) 
		{
			if(n%i==0)
			 count=count+1;
			i++;
		}
		if(count==2) 
			System.out.println(n+" is a Prime Number");
			else
				System.out.println(n+" is not a Prime Number");
		}
	}

                            //OR

     /*public static void main(String args[]) 
      { 
            int temp; 
            boolean isPrime=true; 
            Scanner scan= new Scanner(System.in); 
            System.out.println("Enter any number:"); 
            //capture the input in an integer
            int num=scan.nextInt(); 
             scan.close(); 
            for(int i=2;i<=num/2;i++) 
              { 
              temp=num%i; 
                if(temp==0) 
                 { 
                    isPrime=false; 
                     break; 
                  } 
                   } 
            //If isPrime is true then the number is prime else not
              if(isPrime) 
              System.out.println(num + " is a Prime Number"); 
              else
              System.out.println(num + " is not a Prime Number"); 
              } 
              } */