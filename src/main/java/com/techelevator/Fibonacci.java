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
//		Takes number in command line prompt and converts from string to a long (I use 'long' just 
//		to be able to use larger numbers)	
		long fibEnd = Long.parseLong(args[0]);
//		First number in fibonacci sequence and the lesser of the two addends in finding the next fib number.
		long fibFirstAddend = 0;

//		Next number in fibonacci sequence and greater of the two addends in finding the next fib number.
		long fibNextAddend = 1;
		
//		Current fibonacci number
		long fibNum = 0;
		
//		Prints out 0 1 each time Fibonacci.java is run
		System.out.print(fibFirstAddend + " " + fibNextAddend);
		
//		Loop iterates until current fibonacci number <= max number (fibEnd) set by user in command line. 		
		for(fibNum = 0; fibNum <= fibEnd; fibNum++){
//			Assigns value of current fibonacci number to equal the sum of previous iteration's addends.
			fibNum = fibFirstAddend + fibNextAddend;
//			First addend for next iteration is assigned the value from most recent iteration's next addend.
			fibFirstAddend = fibNextAddend;
//			Current fibonacci number becomes second addend for next iteration.
			fibNextAddend = fibNum;
			
//			Prints the fibonacci number if it is less than or equal to the max fib number set by user in command line.
			if (fibNum <= fibEnd)
			System.out.print(" " + fibNum);
		 } 
//		prints a line for aesthetic purposes in command line
	   System.out.println();
	}

}
