package com.imran.thirtydaysofcode;

class MyBook extends Book {
	int price=0;
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price=price;
	}

	void display() {	//implementing the abstract method from super class
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
