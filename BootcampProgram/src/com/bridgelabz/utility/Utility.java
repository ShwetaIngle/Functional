package com.bridgelabz.utility;

public class Utility {
	
	//***Method to calculate WindChill (S.A-9)
		public double windchill(double t,double v) {
			double w=35.74+ (0.6215*t) + (0.4275*t -35.75) * Math.pow(v,0.16);
			return w;
		}
		//Method for conversion of temperature 
		public double CelsiusToFahrenheit(double c){
			double f=(c*(9/5)+32);
			return f;
		}
		public double FahrenheitToCelsius(double f) {
			double t=(f-32)*5/9;
			return t;
		}
		//***method to calculate trigonometric function (S.A-13)
		public double SinFunction(double a) {
			double s=Math.sin(a);
			return s;
		}
		public double CosFunction(double a) {
			double c=Math.cos(a);
			return c;
		}
		public double TanFunction(double a) {
			double t=Math.tan(a);
			return t;
		}
		//***Method to calculate percentage of head vs tail when coin is filped (S.A-1.5-1)
		
		public void CoinFlip(int n) {
			int chead=0,ctail=0;
			for(int i=0;i<n;i++)
			{
				if(Math.random()<=0.5){
					System.out.println("Head");
					chead++;
				}
				else{
					System.out.println("Head");
					ctail++;				
				}
					
			}
			double phead=(chead*100)/n;
			double ptail=(ctail*100)/n;
			
			System.out.println("percentage of head: "+phead+ "\t percentage of tail: "+ptail);
			
		}
		//****Method to calculate  sum of Harmonic number (S.A-1.5-3) 
		
		public double HarmonicNum(int n) {
			double hn = 0.0;
	        for (int i = 1; i <= n; i++) {
	            hn += 1.0 / i;
	        }
			return hn;
		}
		
		//***Method to calculate day of week (S.A-1.4-10)
		
		public int day_of_week(int m,int d,int y)
		{
			int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        return(d0);
	  	}
	//***
	
	
	
	
	
	
}
