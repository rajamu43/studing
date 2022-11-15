package com.chainsys.novbatch;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel h=new Hotel();
		h.hotelName="abc hotel";
		h.hotelAddress="Ambattur";
		h.orderno=234;
		h.foodName="dosa";
		h.cancel='Y';
		h.chennai=true;
		
		System.out.println("Hotel Name:"+(h.hotelName));
		System.out.println("HotelAddress:"+(h.hotelAddress));
		System.out.println("Food order no:"+(h.orderno));
		System.out.println("Food name is:"+(h.foodName));
		System.out.println("Food cancellation availlable:"+(h.cancel));
		System.out.println("The hotel location on chennai:"+(h.chennai));

	}

}
