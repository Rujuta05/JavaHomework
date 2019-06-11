package Homework1;

import java.util.Scanner;

public class charAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c;
		
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		
		System.out.println("Character is "+c);
		int asciivalue=(int)c;
		
		System.out.println("Asccii value is "+asciivalue);
		if(asciivalue>=65 && asciivalue<=90 || asciivalue>=97 && asciivalue<=122)
		{		 
			System.out.println("\n character is alphabet");
			System.out.println(" my message");
		}
		
		else
		{
			System.out.println("\n character is not a alphabet");
		}
	}

}
