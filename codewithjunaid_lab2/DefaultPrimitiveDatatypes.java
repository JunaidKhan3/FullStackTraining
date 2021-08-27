package com.codewithjunaid_lab2;
/*
*Question 2. Write a program to print default values of all primitive types
*/
public class DefaultPrimitiveDatatypes {
short s;
int i;
long l;
double d;
char c;
float f;
String str;
boolean boo;

	public static void main(String[] args) {

		DefaultPrimitiveDatatypes Dpdt=new DefaultPrimitiveDatatypes();
		
		System.out.println("\n short s:"+Dpdt.s);
		System.out.println("\n integer i:"+Dpdt.i);
		System.out.println("\n long l:"+Dpdt.l);
		System.out.println("\n double d:"+Dpdt.d);
		System.out.println("\n char c:"+Dpdt.c);
		System.out.println("\n float f:"+Dpdt.f);
		System.out.println("\n String str:"+Dpdt.str);
		System.out.println("\n boolean boo:"+Dpdt.boo);

	}

}
