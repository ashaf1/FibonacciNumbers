package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What unit of temperature you would like to convert from? (C)elsius or (F)arenheit");
		String unitInput = scan.nextLine();
		char unit = unitInput.charAt(0);
		System.out.println("Please enter the number of degrees: ");
		String tempInput = scan.nextLine();
		int tempPreConv = Integer.parseInt(tempInput);
		if (unit == 'C' || unit == 'c'){
			int tempFarenheit = (int)(tempPreConv*1.8 + 32); 
			System.out.println(tempPreConv +" degrees Celcius is equal to " + tempFarenheit + " degrees Farenheit.");
		} if (unit == 'F' || unit == 'f'){
			int tempCelcius = (int)((tempPreConv - 32)/1.8);
			System.out.println(tempPreConv + " degrees Farenheit is equal to " + tempCelcius + " degrees Celcius.");
		}
	
	}

}
