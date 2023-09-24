package numbers;

import java.util.Scanner;

public class Powerof_Number {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter base  :");
		int base=in.nextInt();
		System.out.println(" enter power :");
		int power= in.nextInt();
		Powerof_Number pon =  new Powerof_Number();
		pon.find_PowerofNumber(base,power);
		

	}

	private void find_PowerofNumber(int base, int power) 
	{
		
		int val=1;
		while(power!=0)
		{
			val=  val*base;
			power--;
		}
		System.out.println(val);
		
	}

}
