package com.chainsys.novbatch;

public class TestVechicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle1 vec=new Vehicle1();
		vec.vehicleType="Twowheller";
		vec.vehicleNumber=1515;
		vec.vehicleName="bike";
		vec.gearType="withgear";
		vec.vehicleColor="blue";
		vec.fueltype=true;
		vec.checkup='y';
		 System.out.println("Vehicle type:"+(vec.vehicleType));
		 System.out.println("vehicle no:"+(vec.vehicleNumber));
		 System.out.println("vehicle name:"+(vec.vehicleName));
		  System.out.println("Vehicle geartype:"+(vec.gearType));
		  System.out.println("Vehicle color is:"+(vec.vehicleColor));
		  System.out.println("This Vehicle petrol fuel type:"+(vec.fueltype));
		  System.out.println("This vehicle is govt authorised:"+(vec.checkup));
 
	}

}
