package com.chainsys.novbatch;

import java.util.Scanner;

public class TestBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		Bus bus=new Bus();
		
		System.out.println("Enter busno");
		int busNumber=s.nextInt();
		bus.busno=busNumber;
		System.out.println("Enter bus brand");
		String brand=s.next();
		bus.busBrand=brand;
		System.out.println("Enter seat no");
		int sno=s.nextInt();
		bus.seats=sno;
		System.out.println("Bus Tank Fueltype");
		String fuel=s.next();
		bus.type=fuel;
		System.out.println("Bus Tank capacity of petrol");
		double  capa=s.nextDouble();
		bus.capacity=capa;
		System.out.println("This bus permitted for goverment:");
		boolean per=s.nextBoolean();
		bus.permit=per;
       System.out.println("Bus no:"+bus.busno);
		System.out.println("Bus Brand:"+bus.busBrand);
		System.out.println("Seat no:"+bus.seats);
		System.out.println("Bus fueltype:"+bus.type);
		System.out.println("Capacity of Tank:"+bus.capacity);
		System.out.println("This bus permitted for goverment:"+bus.permit);
		
       
	}

}
