import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the year:");
		int y=x.nextInt();
		int flag=0;
		
		if(y>=1582)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					flag=1;
				}
			}
			else if(y%4==0)
			{
				flag=1;			
			}
			else{
				flag=0;
			}
		}
		else{
			flag=0;
		}
		if(flag==1)
		{
			System.out.println("Year "+ y +" is Leap year.");
		}
		else{
			System.out.println("Year "+ y +" is not Leap year.");
		}
	x.close();	
	}

}
