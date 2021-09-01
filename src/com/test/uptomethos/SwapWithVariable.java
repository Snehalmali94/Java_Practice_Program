package com.test.uptomethos;

import java.util.Scanner;

public class SwapWithVariable {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number a:");
		System.out.println("Enter number b:");
		int a = s.nextInt();
	    int b = s.nextInt();
		System.out.println(b);
		System.out.println(a);
		int temp;
		
		temp = a;
		a=b;
		b = temp;
	
		System.out.println("After swapping a ="+ a);
	    System.out.println("After swapping b ="+ b);
	    s.close();
	    
	}
	
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number a:");
		System.out.println("Enter number b:");
		int a = s.nextInt();
	    int b = s.nextInt();
		System.out.println("Before swapping a:"+ a);
		System.out.println("Before swapping b:"+ b);
		
		System.out.println("After swapping a ="+( a == b));
	    System.out.println("After swapping b ="+ (b == a));
	    s.close();
	    
	}

}
