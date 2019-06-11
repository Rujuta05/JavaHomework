package Homework1;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		System.out.println("\n Enter first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	 
		System.out.println("\n Enter Second number");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Result--");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	

	}

}
