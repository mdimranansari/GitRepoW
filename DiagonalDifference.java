package com.imran.algorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference{

	static int diagonalDifference(int[][] a) {
		// Complete this function
		int i=0, j=0, sum1=0, sum2=0;
		int len=a[0].length;
		System.out.println(len);
		for(i=0, j=0; i<len; i++, j++)
		{
			if(i==j)
				sum1+=a[i][j];
		}
		for(i=0; i<len; i++)
		{
			for(j=len-1;j>=0;j--)
			{
				if((i+j)==(len-1))
					sum2+=a[i][j];
			}
		}

		System.out.println("sum 1 is "+sum1);
		System.out.println("sum 2 is "+sum2);
		return Math.abs(sum1-sum2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for(int a_i = 0; a_i < n; a_i++){
			for(int a_j = 0; a_j < n; a_j++){
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}
}