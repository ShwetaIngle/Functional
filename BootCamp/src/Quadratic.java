import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the values of a, b and c: ");
		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
		
		int delta=b*b-4*a*c;
		double root1=0,root2=0;
		
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of x: "+root1);
		System.out.println("Root 2 of x: "+root2);
		
		x.close();
	}

}
