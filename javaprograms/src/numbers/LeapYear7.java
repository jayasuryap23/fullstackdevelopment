package numbers;

import java.util.Scanner;

public class LeapYear7 {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find prime or not ");
		int number = in.nextInt();
		LeapYear7 lp  =  new LeapYear7();
		lp.find_PrimeorNot(number);
		
		

	}

	private void find_PrimeorNot(int number) 
	{
		int count =0;
		int div=2;
		while(div<number)
		{
			if(number%div==0)
			{
				count++;
			}
			div++;
		}
		if(count==0)
		{
			System.out.println(number+" is prime");
		}
		else
		{
			System.out.println(number + "  is not a prime ");
		}
	}

}
