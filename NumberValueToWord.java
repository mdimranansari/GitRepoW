/*
 * 	Input:- 5556778	(number form)
	Output:- Five-3 Six-1 Seven-2 Eight-1
 */

package com.imran.algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class NumberValueToWord {

	static HashMap<String, Integer> hmap=new HashMap<String, Integer>();
	static int arr[]=new int[10];
	static int ar[]=new int[10];


	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();


		int onum=num, temp=0, prev=0, count=0, i=0;
		
		int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		while(num>0)
		{
			temp=num%10;
			switch(temp)
			{
			case 0:
				++zero;
				num/=10;
				break;
			case 1:
				++one;
				num/=10;
				break;
			case 2:
				++two;
				num/=10;
				break;
			case 3:
				++three;
				num/=10;
				break;
			case 4:
				++four;
				num/=10;
				break;
			case 5:
				++five;
				num/=10;
				break;
			case 6:
				++six;
				num/=10;
				break;
			case 7:
				++seven;
				num/=10;
				break;
			case 8:
				++eight;
				num/=10;
				break;
			case 9:
				++nine;
				num/=10;
				break;
			default:
				System.out.println("This is default block");
			}
		}

		hmap.put("Zero",zero);
		hmap.put("One",one);
		hmap.put("Two",two);
		hmap.put("Three",three);
		hmap.put("Four",four);
		hmap.put("Five",five);
		hmap.put("Six",six);
		hmap.put("Seven",seven);
		hmap.put("Eight",eight);
		hmap.put("Nine",nine);
		
		hmapKeeper(hmap);
	}

	public static void hmapKeeper(HashMap<String, Integer> hmap)
	{
		if(hmap.isEmpty())
			System.out.println("No Values, its Empty");
		else 
		{
			if(hmap.get("Zero")!=0)
				System.out.print(" Zero-"+hmap.get("Zero")+" ");
			if(hmap.get("One")!=0)
				System.out.print(" One-"+hmap.get("One")+" ");
			if(hmap.get("Two")!=0)
				System.out.print(" Two-"+hmap.get("Two")+" ");
			if(hmap.get("Three")!=0)
				System.out.print(" Three-"+hmap.get("Three")+" ");
			if(hmap.get("Four")!=0)
				System.out.print(" Four-"+hmap.get("Four")+" ");
			if(hmap.get("Five")!=0)
				System.out.print(" Five-"+hmap.get("Five")+" ");
			if(hmap.get("Six")!=0)
				System.out.print(" Six-"+hmap.get("Six")+" ");
			if(hmap.get("Seven")!=0)
				System.out.print(" Seven-"+hmap.get("Seven")+" ");
			if(hmap.get("Eight")!=0)
				System.out.print(" Eight-"+hmap.get("Eight")+" ");
			if(hmap.get("Nine")!=0)
				System.out.print(" Nine-"+hmap.get("Nine")+" ");
			
		}
	}
}
//upload it