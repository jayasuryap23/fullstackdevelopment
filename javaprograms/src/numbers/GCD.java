package numbers;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) 
	{
		GCD gcd =  new GCD();
		Scanner in =  new Scanner(System.in);
		System.out.println("enter number 1 ");
		int number1 =  in.nextInt();
		System.out.println("enter number 2 ");
		int number2 = in.nextInt();
		gcd.find_gcd(number1,number2);
		
		
		
		

	}

	private void find_gcd(int number1, int number2) 
	{
		int div=2;
		int gcd =1;
		int small= (number1<number2)?number1:number2;
		while(div<=small)
		{
			if(number1%div==0 && number2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		System.out.println(" the gcd of a number is :"+gcd );
	}

}
