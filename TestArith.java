package com.chainsys.novbatch;

import java.util.Scanner;

public class TestArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Arith ar=new Arith();
		
		System.out.println("Enter the Nos");
		int no1=s.nextInt();
		int no2=s.nextInt();
		ar.a=no1;
		ar.b=no2;
		System.out.println("The addtion is"+(ar.a+ar.b));
		System.out.println("The subtraction is"+(ar.a-ar.b));
		System.out.println("The multiplication is"+(ar.a*ar.b));
		System.out.println("The division is"+(ar.a/ar.b));
		System.out.println(ar.a%ar.b);
	}

}
