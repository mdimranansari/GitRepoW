package com.imran.thirtydaysofcode;

import java.util.Scanner;

public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int base=2;
		String s=new String();
		String onezero="";

		while(n>=1)
		{
			onezero+=n%base;
			n=n/base;
		}
//		System.out.println(onezero);
		int count=0;
		findmaxconsicutiveone(onezero, count);

	}

	private static void findmaxconsicutiveone(String onezero,int count) {
		// TODO Auto-generated method stub
		int co=0;
		for(char c: onezero.toCharArray())
		{
			if(c=='1')
			{
				co+=1;
				if(co>count)
					count=co;
			}
			else if(c=='0')
			{
				co=0;
			}
		}
		System.out.println(count);
	}
}

//to upload
/*Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .*/