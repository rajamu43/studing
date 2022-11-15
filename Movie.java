package com.chainsys.novbatch;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seatno=123;
		boolean confirmed=true;
		String moviename="RRR";
		String movietype="horror";
		double rate=125.25;
	    char ch;
	    ch='N';
	    
		
	    System.out.println("Seat no :" +seatno);
	    
		System.out.println("Ticket is confirmed:" +confirmed );

		System.out.println("The movie name is:"+moviename);
		
		System.out.println("The movie category is:"+movietype);
		
		System.out.println("The ticket rate is:"+rate);
		System.out.println("Ticket cancellation facility:"+ch);
	}

}
