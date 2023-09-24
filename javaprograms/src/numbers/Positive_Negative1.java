package numbers;
import java.util.Scanner;
public class Positive_Negative1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to find positive or negative ");
		int number =  in.nextInt();
		Positive_Negative1 pn =  new Positive_Negative1();
		pn.find_PostiveNegative(number);
		
		

	}

	private void find_PostiveNegative(int number) 
	{
		if (number>0)
		{
			System.out.println("the number is positive");
		}
		else if (number<0)
		{
			System.out.println(" the number is negative ");
		}
		else
		{
			System.out.println(" the number is zero");
		}
		
	}

}
