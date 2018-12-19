package com.imran.algorithms;

import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);
		/*        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();*/

		scanner.close();
	}
	private static String kangaroo(int x1, int v1, int x2, int v2) {
		double a=(x2-x1);
		double b=(v1-v2);
		double x=a/b;
		
		System.out.println("x : "+x);
		System.out.println(x%2);
		
		if((x>=0)&&(x==Math.round(x)))		
			return "YES";
		else 
			return "NO";
	}
}
//upload it