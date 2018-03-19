/*You have to identify the type of berth of a given seat in the sleeper class of the Indian Railways.

Every coach has  seats, divided into nine compartments. Each compartment has:

Six long berths: a pair of lower, a pair of middle and a pair of upper.
Two side berths: a side-lower and a side-upper.
The starting seat number in any compartment is one more than the seat number of the last berth in the previous compartment. In particular, the  berth (i.e lower) in the  compartment is numbered  . See the diagram below for the layout of the coach.

image

Given a seat with number , determine the type of berth it is.

Complete the function berthType which takes in an integer  and returns a string identifying the type of berth, as described in the output format section.

Input Format

The input consists of a single line containing a single integer  denoting the seat number.

Constraints

Output Format

Print a single line containing the type of berth:

Print LB if it is a lower berth.
Print MB if it is a middle berth.
Print UB if it is an upper berth.
Print SLB if it is a side-lower berth.
Print SUB if it is a side-upper berth.
Sample Input 0

1
Sample Output 0

LB
Explanation 0

Seat number  is a lower berth. You can check it on the diagram above as well.

Sample Input 1

72
Sample Output 1

SUB
Explanation 1

Seat number  is a side upper berth. You can check it on the diagram above as well.*/

package com.imran.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TrainTicket {
	/*
	 * Complete the berthType function below.
	 */
	static String berthType(int n) {
		// Return the type of berth as described in the output format section.
		n%=8;
		String s = null;
		if(n==1||n==4)
			s="LB";
		else if(n==2||n==5)
			s="MB";
		else if(n==3||n==6)
			s="UB";
		else if(n==7)
			s="SLB";
		else if(n==0)
			s="SUB";
		
		return s;
		
	}


	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		String result = berthType(n);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
//Upload