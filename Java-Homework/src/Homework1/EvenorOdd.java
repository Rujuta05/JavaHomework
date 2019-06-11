package Homework1;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("\n Enter  number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even "+n);
		}
		else
		{
			System.out.println("number is odd "+n);
		}
	}

}
