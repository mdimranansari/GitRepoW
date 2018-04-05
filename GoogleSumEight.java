package com.imran.thirtydaysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class GoogleSumEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=scan.nextInt();

		int[] input=new int[len];

		System.out.println("enter the sum to find");
		int s=scan.nextInt();
		System.out.println("Enter the elements in array : ");
		for (int i=0; i<len;i++)
		{
			input[i]=scan.nextInt();
		}
		int init=0;

		int i=0;
		Arrays.sort(input);
		boolean b=false;

		while(i<len && input[i]<=s)
		{
			init=input[i];
			for(int j=i+1;j<len;j++)
			{
				if(input[j]==(s-init))
					b=true;
				else
					b=false;
			}
			i++;
		}
		if(b==true)
			System.out.println("Yes");
	}
}
//to upload