package com.imran.thirtydaysofcode;

public class Student extends Person{
	private int[] testScores;
	
	int sum=0, len=0;
	/*	
	    *   Class Constructor
	    *   
	    *   @param firstName - A string denoting the Person's first name.
	    *   @param lastName - A string denoting the Person's last name.
	    *   @param id - An integer denoting the Person's ID number.
	    *   @param scores - An array of integers denoting the Person's test scores.
	    */
	    // Write your constructor here
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);

		firstName=this.firstName;
		lastName=this.lastName;
		identification=this.idNumber;
		len=testScores.length;
		
		for(int i=0;i<testScores.length;i++)
		{
				sum+=testScores[i];
		}
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(identification);
		
		
	}
	/*	
	    *   Method Name: calculate
	    *   @return A character denoting the grade.
	    */
	    // Write your method here
	public String calculate() {
		String grade=null;
		
		int a = sum/len;
		
		if(a<40)
			grade="T";
		else if(a>=40 && a<55)
			grade="D";
		else if(a>=55 && a<70)
			grade="P";
		else if(a>=70 && a<80)
			grade="A";
		else if(a>=80 && a<90)
			grade="E";
		else if(a>=90)
			grade="O";
		
		return grade;
	}

	
	

	    
}
