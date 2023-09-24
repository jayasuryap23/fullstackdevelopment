package numbers;

import java.util.Scanner;

public class Palindrome_Number10 {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter a number to find palindrome or not ");
		int number =  in.nextInt();
		Palindrome_Number10  pn =  new Palindrome_Number10();
		pn.find_Palindrome(number);
		

	}

	private void find_Palindrome(int number) 
	{
		int temp, rem,reverse=0;
		temp =  number;
		while(temp!=0)
		{
			rem =temp %10;
			reverse =  reverse  * 10+rem;
			temp =temp/10;
		}
		if(number == reverse)
		{
			System.out.println(number +  "  is palindrome");
		}
		else
		{
			System.out.println(number + "  is not a palindrome ");
		}
	}

}
