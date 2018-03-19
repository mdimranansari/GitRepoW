package com.Practice30days;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int ii=0;
		double dd=0.0;
		String str=null;
		/* Read and save an integer, double, and String to your variables.*/
		ii=scan.nextInt();
		dd = scan.nextDouble();
		scan.nextLine();	// Consume newline left-over

		str=scan.nextLine();

		// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i+ii);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d+dd);
		/* Concatenate and print the String variables on a new line; 
	                	the 's' variable above should be printed first. */
		System.out.println(s.concat(str));
		scan.close();
	}
//upload

}
