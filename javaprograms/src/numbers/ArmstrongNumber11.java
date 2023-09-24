  package numbers;

import java.util.Scanner;

public class ArmstrongNumber11 {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find armstrong");
		int number =  in.nextInt();
		ArmstrongNumber11 an = new ArmstrongNumber11();
		int count  =  an.find_count(number);
		int result =  an.find_armstrong(number,count);
		if(number==result)
		{
			System.out.println(number + " is a armstrong ");
		}
		else
		{
			System.out.println(number + "  is not a armstrong ");
		}
		
		/* 
		 * 1.find count
		 * 2. find power
		 * 3.find armstrong */
		//  1 5 3  =  1 *3 + 5 * 3 + 3 *3 
		
		
		

	}

	private int find_armstrong(int number, int count) 
	{
		int arm=0;
		while(number!=0)
		{
			int rem =  number%10;
			arm =  arm+ find_arm(rem,count);
			number=number/10;
		}
		return arm;
	}

	private int find_arm(int base , int power) 
	{
		int val=1;
		while(power!=0)
		{
			val= val*base;
			power--;
		}
		return val;
	}

	private int find_count(int number) 
	{
		int count=0;
		while(number!=0)
		{
			count++;
			number/=10;
		}
		return  count;
	}

}
