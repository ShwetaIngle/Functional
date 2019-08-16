package com.bridglabz.day2;

public class CarLoan {

	public static void main(String[] args) {
		double principal=Double.parseDouble(args[0]);
		double year=Double.parseDouble(args[1]);
		double rate=Double.parseDouble(args[2]);
		
		double r=rate/(12*100);   //monthly interest rate
		double n=12*year;         //no of months
		
		double payment= (principal*r)/(1-Math.pow(1+r,-n));
		double interest= payment * n/principal;
		
		System.out.println("Monthly paymen: "+payment);
		System.out.println("Total interest: "+interest);
	}

}
