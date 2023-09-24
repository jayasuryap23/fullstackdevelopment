package numbers;

import java.util.Scanner;

public class Sum_Of_TwoNumbers4 {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter number1 :");
		int number1 =  in.nextInt();
		System.out.println("enter number2:");
		int number2 =  in.nextInt();
		
		Sum_Of_TwoNumbers4 stn =  new Sum_Of_TwoNumbers4();
		stn.find_greatest_of_TwoNumbers(number1, number2);
		
		

	}

	private void find_greatest_of_TwoNumbers(int number1, int number2) 
	{
		if(number1== number2)
		{
			System.out.println(" both are equal");
		}
		else
		{
			int temp  =  number1>number2 ? number1:number2;
			System.out.println(temp+" is largest  ");
			
		}
	}

}
