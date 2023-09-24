package numbers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter a year to find the year is leap  or not ");
		Scanner sc =  new Scanner(System.in);
		int year =  sc.nextInt();
		LeapYear lp  = new LeapYear();
		lp.find_LeaporNot(year);
		

	}

	private void find_LeaporNot(int year) 
	{
		//  year % 400  && year % 4  ! 100
		if(year%400==0)
		{
			System.out.println(year + "  is a leap  year");
		}
		else if ( year %4==0 && year %100 !=0)
		{
			System.out.println(year+" is a leap  year");
		}
		else
		{
			System.out.println(year+ "  is not a leap  year");
		}
	}

}
