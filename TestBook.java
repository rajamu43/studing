package com.chainsys.novbatch;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book bo=new Book();
		bo.bookNumber=342;
		bo.bookName="Java";
		bo.ch='Y';
		bo.rate=1500.0;
		bo.author="Robert";
		bo.status=true;	
		
		System.out.println("book no :" +(bo.bookNumber));
		System.out.println("Book name is:" +(bo.bookName));
		System.out.println("The book is Studing purpose:"+(bo.ch));
		System.out.println("Book price of:"+(bo.rate));
		System.out.println("The author name is:"+(bo.author));
		System.out.println("A book is usefull of studeid in java:"+(bo.status));

	}

}
