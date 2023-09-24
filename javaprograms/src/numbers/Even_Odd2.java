package numbers;
import java.util.Scanner;
public class Even_Odd2 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to find even or odd ");
		int number = in.nextInt();
		Even_Odd2 eo =  new Even_Odd2();
		eo.find_EvenOdd(number);
		

	}

	private void find_EvenOdd(int number)
	{
		if(number %2==0)
		{
			System.out.println(number + "  is even");
		}
		else
		{
			System.out.println(number + "  is odd ");
		}
	}

}
