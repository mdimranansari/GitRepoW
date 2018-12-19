/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 */

package com.imran.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String s = scan.nextLine();	// taking input in  12-hour AM/PM format, co
		timeConversion(s);
	}

	public static void timeConversion(String s) {
		StringBuilder sb=new StringBuilder();

		String str[]=s.split(":",3);
		//		System.out.println(str[0]);
		//		System.out.println(str[1]);
		//		System.out.println(str[2]);

		String ampm[] = separateNumberAndTime(str[2]);
		//		System.out.println("Value of ampm1 : "+ampm[0]);
		//		System.out.println("Value of ampm2 : "+ampm[1]);

		if(ampm[1].equalsIgnoreCase("AM"))
		{
			if(str[0].equalsIgnoreCase("12"))
				str[0]="00";
		}
		else if(ampm[1].equalsIgnoreCase("PM"))
		{
			int t=Integer.parseInt(str[0]);
			//			System.out.println("value of t : "+t);
			if(t>0&&t<12)
			{
				t+=12;
				//				System.out.println("Now value of t : "+t);
				str[0]=Integer.toString(t);
				//				System.out.println("Now value of s[0] : "+str[0]);
			}
		}
		//		System.out.println("the military time is : "+str[0]+":"+str[1]+":"+ampm[0]);
		System.out.println(str[0]+":"+str[1]+":"+ampm[0]);
	}

	private static String[] separateNumberAndTime(String s) {
		// TODO Auto-generated method stub
		String str2[]=s.split("\\D+",2);		//Gives numerical value
		String str1[]=s.split("\\d+",2);		//Gives AM or PM
		String[] str= {str2[0],str1[1]};

		//		System.out.println(str2[0]);
		//		System.out.println(str1[1]);
		return str;
	}
}
//upload it