package com.test.uptomethos;

import java.util.Scanner;

public class SwapWithoutVariable 
{

	public static void main(String[] args)
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
