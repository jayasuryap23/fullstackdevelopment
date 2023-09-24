package numbers;

import java.util.Scanner;

public class ReverseNumber9 {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to reverse ");
		int number =  in.nextInt();
		ReverseNumber9  rn  =  new ReverseNumber9();
		rn.find_ReverseNumber(number);

	}

	private void find_ReverseNumber(int number)
	{
		int rem;
		int reverse=0;
		while(number!=0)
		{
			rem = number%10;
			reverse = reverse  * 10+ rem;
			number = number / 10;
		}
		System.out.println("reversed number is :"+reverse);
	}

}
