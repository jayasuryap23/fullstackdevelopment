package numbers;

import java.util.Scanner;

public class Sum_OF_N_NaturalNumbers3 {
	public static void main(String[] args) {
		Scanner  in =  new Scanner (System.in);
		System.out.println("enter a number to find first N natural  number ...");
		int number =  in.nextInt();
		
		Sum_OF_N_NaturalNumbers3 sn  =  new Sum_OF_N_NaturalNumbers3();
		sn.find_Sum_Of_NaturalNumbers(number);
		
	}

	private void find_Sum_Of_NaturalNumbers(int number) 
	{
		// sum of first n natural  number 
		
		int sum =0;
		for(int i  =  1; i<=number;i++)
		{
			sum += i;
			System.out.println(sum);
		}
	}

}
