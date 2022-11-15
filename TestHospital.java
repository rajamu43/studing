package com.chainsys.novbatch;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital hos=new Hospital();
		hos.hospitalName="Apllo";
		hos.address="chennai";
		hos.wardno=10;
		hos.roomNumber=18;
		hos.checkup=true;
		hos.fees=1200.0;
		
		System.out.println("Hospital name:"+(hos.hospitalName));
		System.out.println("Hospital address:"+(hos.address));
		System.out.println("The hospital wardno:"+(hos.wardno));
		System.out.println("The patient roomno:"+(hos.roomNumber));
		System.out.println("The patient get general checkup:"+(hos.checkup));
		System.out.println("The patient admission fees:"+(hos.fees));

	}

}
