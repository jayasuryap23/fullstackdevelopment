package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Factorial f = new Factorial();
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find factorial..");
		int number =  in.nextInt();
		int fact_value = f.find_factorial(number);
		System.out.println(" factorial of a "+number +" is :"+fact_value);

	}

	private int find_factorial(int number) 
	{
		int val=1;
		int no=1;
		while(no<=number)
		{
			val=val*no;
			no++;
		}
		return val;
	}

}
