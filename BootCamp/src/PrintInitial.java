
public class PrintInitial {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("*");
			}			
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			if(i<5)
			{
			for(int l=0;l<3;l++)
			{
				System.out.print("*");
			}
			}
			if(i>=5)
			{
				for(int k=5;k<=i;k++)
				{
					System.out.print(" ");
				}
				for(int l=0;l<3;l++)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
	}
	//*** Print D
		System.out.println("\n");
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("*");
			}
			if(i==0 || i==8)
			{
				for(int j=0;j<9;j++)
				{
					System.out.print("*");
				}
			}
			
			for(int k=0;k<=9;k++) {
				System.out.print(" ");
			} 
			if(i==2 || i==6){
				System.out.print(" ");
			}
			if(i==3 || i==4 || i==5){
				System.out.print("  ");
			}
			if(i>=1 && i<=7)
			{
			for(int j=0;j<2;j++)
			{
				System.out.print("*");
			}
			}			
			System.out.println();			
		}
		//*********************************************************************
		System.out.println("\n");
		
		/*for(int i=0;i<9;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2;j++)
			{ 			
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		for(int i=0;i<9;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2;j++)
			{ 		//if(i!=8)	
				System.out.print("*");
			}
			if(i==8 || i==7){
				System.out.print("*");
			}
			for(int k=8;k>i;k--)
			{
				//if(i!=8 || i!=7)
				System.out.print(" ");
				
			}
			for(int j=0;j<2;j++)
			{ 			
				System.out.print("*");
			}
			
			System.out.println();
		}


	}
}