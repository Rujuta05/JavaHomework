package Homework1;

import java.util.Scanner;

public class leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no_of_year;
	      System.out.println("Enter an year number ");
	      Scanner sc = new Scanner(System.in);
	      no_of_year = sc.nextInt();
    	  if(no_of_year%4==0)
	    	  {
	         System.out.println("year is a leap year");
	    	  }
	      else
	         System.out.println("year is not a leap year");

	}

}
