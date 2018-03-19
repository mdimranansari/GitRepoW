package com.Practice30days;

import java.util.Scanner;

public class Day2_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double tcost=meal_cost+(meal_cost*tip_percent+meal_cost*tax_percent)*0.01;
        int roundcost=(int) Math.round(tcost);
        System.out.println("The total meal cost is "+roundcost+" dollars");
	}
//upload
}
