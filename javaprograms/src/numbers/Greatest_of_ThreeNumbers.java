package numbers;

import java.util.Scanner;

public class Greatest_of_ThreeNumbers {

	public static void main(String[] args) 
	{
		// greatest of three numbers 
		Scanner in =  new Scanner(System.in);
		System.out.println(" enter number 1 :");
		int num1 =  in.nextInt();
		
		System.out.println("enter number 2 :");
		int num2 =  in.nextInt();
		
		System.out.println("enter  number 3 :");
		int num3 =  in.nextInt();
		
		Greatest_of_ThreeNumbers got =  new Greatest_of_ThreeNumbers();
		
		got.find_Greatest_of_ThreeNumbers(num1, num2,num3);
		

	}

	private void find_Greatest_of_ThreeNumbers(int num1, int num2, int num3) 
	{
		int temp ,result;
		
		//  find the largest number between num1 & num2 and store it in temp 
		
		temp  =  num1>num2?num1:num2;
		
		//  find the largest between temp  and num3 and store it in result 
		
		result =  temp>num3? temp:num3;
		
		System.out.println(result + " is the greatest"  );
	}

}
