package com.bridglabz.day2;
import com.bridgelabz.utility.*;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Utility u=new Utility();
		
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		int d0=u.day_of_week(m,d,y);
		
		System.out.println(d0);
		
		if(d0==0)
        	System.out.println("Sunday");
        else if(d0==1)
        	System.out.println("Monday");
        else if(d0==2)
        	System.out.println("Tuesday");
        else if(d0==5)
        	System.out.println("Wednesday");
        else if(d0==4)
        	System.out.println("Thursday");
        else if(d0==6)
        	System.out.println("Friday");
        else if(d0==7)
        	System.out.println("Saturday");
	}

}
