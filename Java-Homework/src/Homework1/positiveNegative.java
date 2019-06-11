package Homework1;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
			
		System.out.println("\n Enter first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is positive");
		}
		else if(a<0)
		{
			System.out.println("Number is negative");
		}else
		{
			System.out.println("Number is zero");
		}
		
		
	
	}

}
