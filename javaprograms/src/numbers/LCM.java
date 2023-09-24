package numbers;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) 
	{
		LCM lcm  =  new LCM();
		Scanner in =  new Scanner(System.in);
		System.out.println("enter number 1 ");
		int number1=  in.nextInt();
		System.out.println(" enter number 2 ");
		int number2 = in.nextInt();
		lcm.find_Lcm(number1, number2);
		

	}

	private void find_Lcm(int number1, int number2) 
	{
		int big= number1>number2?number1:number2;
		int div=2;
		while(true)
		{
			if(big%number1==0 && big%number2 ==0)
			{
				System.out.println(" lcm is "+big);
				break;
			}
			big++;
		}
	}

}
