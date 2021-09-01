package com.test.uptomethos;

public class ConversionApplication 
{

	public static void main(String[] args) 
	{
	  Conversion c = new Conversion();
	  int minToSec = c.getSeconds(3);
	  System.out.println("Value in sencond:"+ minToSec);
	 
	}

}
