package Homework1;

import java.util.Scanner;

public class largeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		System.out.println("\n Enter first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	 
		System.out.println("\n Enter Second number");
		b=sc.nextInt();
		
		System.out.println("\n Enter Third number");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			
				System.out.println("\n numeber a is large"+a);
		}
		else if(a<b && b>c)
		{
			System.out.println("\n numeber b is large"+b);
		}
		else
		{
			System.out.println("\n number c is large"+c);
		}
	
	}

}
