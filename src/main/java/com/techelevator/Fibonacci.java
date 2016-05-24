package com.techelevator;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
 Write a command line program which displays a Fibonacci sequence to the console. The program accepts an integer value as a command line 
 argument which specifies when to terminate the Fibonacci sequence, and quit the program.
  
 $ java Fiboncci 25
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {
	
	public static void main(String[] args) {
		long fibEnd = Integer.parseInt(args[0]);
		long fibFirst = 0;
		long fibNext = 1;
		long fibNum = 0;
		System.out.print(fibFirst + " " + fibNext);
		
		for(fibNum = 0; fibNum <= fibEnd; fibNum++){
			fibNum = fibFirst + fibNext;
			fibFirst = fibNext;
			
			fibNext = fibNum;
			
			if (fibNum <= fibEnd)
			System.out.print(" " + fibNum);
		 } 
	   System.out.println();
	}

}
