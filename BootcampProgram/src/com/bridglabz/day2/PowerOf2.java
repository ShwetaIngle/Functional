package com.bridglabz.day2;

public class PowerOf2 {

	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		int table=0;
		
		int power=(int)Math.pow(2, n);
		
		for(int i=1;i<=power;i++)
		{
			for(int j=1;j<=10;j++)
			{
				table=i*j;
				System.out.println(table);
			}
			System.out.println();
		}
		
	}
}
