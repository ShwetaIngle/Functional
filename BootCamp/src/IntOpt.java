import java.util.*;
public class IntOpt {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter three integer numbers:");
		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
		
		System.out.println("(a+b*c)="+(a+b*c));
		System.out.println("(a*b+c)="+(a*b+c));
		System.out.println("(c+a/b)="+(c+a/b));
		System.out.println("(a%b+c)="+(a%b+c));
		
		x.close();
	}

}
