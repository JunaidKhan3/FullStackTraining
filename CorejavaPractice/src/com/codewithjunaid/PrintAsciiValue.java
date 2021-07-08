package com.codewithjunaid;

public class PrintAsciiValue {

	public static void main(String[] args) {
	char ch='H';
    char Ascii=ch;
    
  //you can also cast char to int
    
    int castAscii=(int) ch;
   
    System.out.println("The Ascii value of "+ ch +"is"+Ascii);
    System.out.println("The Ascii value of "+ ch +"is"+castAscii);
	
	}
}
