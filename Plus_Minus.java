package com.imran.algorithms;

import java.util.Scanner;

public class Plus_Minus {
	/*
	 * Complete the plusMinus function below.
	 */
	static void plusMinus(int[] arr) {
		/*
		 * Write your code here.
		 */
		int len=arr.length;
		double p=0,n=0,z=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]<0)
				n++;
			else if (arr[i]==0)
				z++;
			else
				p++;
		}
		double d=0.0;
        d=p/len;
		System.out.println(d);
        d=n/len;
		System.out.println(d);
        d=z/len;
		System.out.println(d);
		
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		int[] arr = new int[n];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);
	}
}
//upload it
/*Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array. 
The proportions of occurrence are positive: , negative:  and zeros: .*/