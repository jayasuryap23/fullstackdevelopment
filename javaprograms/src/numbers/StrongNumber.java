package numbers;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		StrongNumber sn =  new StrongNumber();
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find strong or not ...");
		int number =  in.nextInt();
		int sum  =  sn.find_sum(number);
		if(number==sum)
		{
			System.out.println(" the given number is strong...");
		}
		else
		{
			System.out.println("  the given number is not strong ...");
		}

	}

	private int find_sum(int number) 
	{
		int sum=0;
		while(number!=0)
		{
			int rem =  number%10;
			sum=  sum+find_factorial(rem);
			number =  number/10;
		}
		return sum;
	}

	private int find_factorial(int rem) 
	{
		int val=1;
		int no=1;
		while(no<=rem) // 6<=5 false 
		{
			val =  val* no; //  1 *1 , 1 *2 =2 *3 = 6  6 *4 = 24  24 * 5 = 120 
			no++; //  2 3 4  5  6 
		}
		return val;
	}

}
