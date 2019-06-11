package Homework1;

import java.util.Scanner;

public class rootsOfQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c;
		System.out.println("\n Enter first number - ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
	
		System.out.println("\n Enter second number - ");
		b=sc.nextInt();
		
		System.out.println("\n Enter third number - ");
		c=sc.nextInt();
		
		double determinant;
		
		determinant=(b*b)-(4*a*c);
		
		if(determinant>0)
		{
			
			System.out.println("Roots are " + (-b+Math.sqrt(determinant))/(2*a)
                    + " and " + (-b-Math.sqrt(determinant))/(2*a));
		}else
		{
			System.out.println("Roots : -"+ (-b/(2*a)));
		}
		
	}

}
