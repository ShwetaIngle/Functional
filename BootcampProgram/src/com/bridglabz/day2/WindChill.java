package com.bridglabz.day2;
import com.bridgelabz.utility.*;
public class WindChill {

	public static void main(String[] args) {
		
		Utility x=new Utility();
		
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		
		double w=x.windchill(t,v);
				
		System.out.println("Temperature: "+t);
		System.out.println("Wind speed: "+v);
		System.out.println("Wind chill: "+w);
	}

}
