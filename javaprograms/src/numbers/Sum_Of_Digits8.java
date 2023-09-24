package numbers;

import java.util.Scanner;

public class Sum_Of_Digits8 {

	public static void main(String[] args)
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find sum  of the digits :");
		int number =  in.nextInt();
		
		Sum_Of_Digits8 sd =  new Sum_Of_Digits8();
		sd.find_Sum_ofDigits(number);
		

	}

	private void find_Sum_ofDigits(int number)
	{
		//  1234 
		int sum=0;
		while(number!=0)
		{
			sum+= number%10;// 4  3 2 1
			number =  number /10; // 123 12 1 
		}
		System.out.println("sum  of digits is :"+sum);
	}

}
