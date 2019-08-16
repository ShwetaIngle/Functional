
package com.bridglabz.day2;
import java.util.*;
import com.bridgelabz.utility.*;

public class Trig {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.println("Enter angle in degrees: ");
		double angle=x.nextDouble();
		double radian=Math.toRadians(angle);
		
		Utility u=new Utility();
		
		double s=u.SinFunction(radian);
		System.out.println("Sin("+angle+"):"+s);
		
		double c=u.CosFunction(radian);
		System.out.println("cos("+angle+"):"+c);
		
		double t=u.TanFunction(radian);
		System.out.println("tan("+angle+"):"+t);
		
		x.close();
	}

}
