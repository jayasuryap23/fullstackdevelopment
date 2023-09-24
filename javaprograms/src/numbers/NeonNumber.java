package numbers;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) 
	{
		NeonNumber nn = new NeonNumber();
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find neon or not :");
		int number =  in.nextInt();
		int square =  number * number;
		int result =  nn.find_sum(square);
		if(number ==result)
		{
			System.out.println(" the number is neon .");
		}
		else
		{
			System.out.println(" the number is not neon.");
		}
		
		
		

	}

	private int find_sum(int square) 
	{
		int sum=0;
		while(square!=0)
		{
			int rem=  square %10;
			sum=  sum+rem;
			square =  square/10;
		}
		return sum;
	}

}
