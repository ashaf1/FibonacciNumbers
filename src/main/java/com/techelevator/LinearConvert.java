package com.techelevator;
import java.util.Scanner;
/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the unit of measurement to convert from: Meters (m) or Feet (f)");
		String unitInput = input.nextLine(); 
		char unit = unitInput.charAt(0);
		System.out.println("Please enter the lenghth: ");
		String lengthInput = input.nextLine();
		int lengthPreConv = Integer.parseInt(lengthInput);
		if (unit == 'm'){
			int lengthFeet = (int)(lengthPreConv * .3048); 
			System.out.print(lengthPreConv + " Meters is equal to " + lengthFeet + " feet.");
		}
		if (unit == 'f') {
			int lengthMeters = (int)(lengthPreConv * 3.2808399);
			System.out.println(lengthPreConv + " Feet is equal to " + lengthMeters + " meters.");
		} System.out.println();
	}

}
