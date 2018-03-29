package com.imran.algorithms;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of items ordered : ");
		int items=scan.nextInt();

		System.out.println("Enter the item number that Anna did not eat : ");
		int dne=scan.nextInt();

		System.out.println("Enter the cost of items : ");
		int cost[] = new int[items];
		for(int i=0;i<items;i++)
		{
			cost[i]=scan.nextInt();
		}

		System.out.println("Enter the money charged to Anna : ");
		int bcharge=scan.nextInt();

		System.out.println(cost[dne]);
		calculate(items,dne,bcharge,cost);
	}

	private static void calculate(int items, int dne, int bcharge, int[] cost) {
		int totcost=0;

		for(int i=0;i<items;i++)
		{
			totcost+=cost[i];
		}

		int bactual=(totcost-cost[dne])/2;

		if(bcharge==bactual)
			System.out.println("Bon Appetit");
		else
			System.out.println("Extra charged : "+(bcharge-bactual));
	}
}