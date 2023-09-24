package array;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		ArrayDemo3 ar3 = new ArrayDemo3();
		// ar3.linear_Search();
		// ar3.count_of_arrayElements();
		// ar3.finding_addition_of_oddIndex();
		// ar3.array_ofOddNumber();
		ar3.count_of_oddElements();// {to be continued }
		// linear search- searching the element in direct way
		/*
		 * minimum - 1 maximum =4 ( number of elements in an array) average : (minimum+
		 * maximum)/2 --> (1+4) / 2 ---> 2 int average :2 10 power 8 seconds --> 5 secs
		 * linear search is not suitable for large set of data . searching algorithm -
		 * binary search
		 */
		/*
		 * print only multiples of 10 and not multiples of 15
		 */

		/*
		 * find odd elements and store them in another array
		 *  1.finding count of odd  elements
		 *  what is the smallest size of an array is 0
		 *  the largest size of an array is max int size - 1223444566 ( continous memory
		 *  allocation )
		 */
	}

	private void count_of_oddElements() 
	{
		
		int [] a = {10,20,30,15,25,35};
		int count=0;
		//  finding number of odd numbers 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				count++;
		}
		System.out.println(" count "+count);
		int b[] =  new int [count];//  create an array based on size of count
		int j=0;
		for(int i=0; i<a.length;i++) //  loop runs total array length times 
		{
			if(a[i]%2!=0)
			{
			b[j] =  a[i];
			System.out.println(b[j]);
			j++;
			}
		}
		
		
	}

	private void array_ofOddNumbers() {

		int[] a = { 10, 20, 30, 15, 25, 35 };
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 != 0) 
			{
				System.out.println(a[i]);
			}
		}

	}

	private void finding_addition_of_oddIndex() {
		/*
		 * finding addition of odd index numbers in a given array
		 */
		int[] ar = { 89, 80, 73, 96, 100 };
		int total = 0;
		for (int i = 1; i < ar.length; i += 2) {
			total += ar[i];
		}
		System.out.println(" odd index total is : " + total);
	}

	private void count_of_arrayElements() {
		int[] ar = { 5, 4, 5, 4, 5, 4, 5, 4 };
		System.out.println("enter a number to find the count");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				count++;
			}
		}
		System.out.println(" the count of the element is :" + count);
	}

	private void linear_Search() {
		int[] ar = { 5, 8, 3, 4 };
		Scanner in = new Scanner(System.in);

		System.out.println("enter a number to search the element in the array ");
		int no = in.nextInt();
		boolean present = false;

		for (int i = 0; i < ar.length; i++) {
			if (no == ar[i]) {
				System.out.println("yes, we got the number in index " + i);
				present = true;
				break;
			}
		}
		if (present == false) {
			System.out.println(" number is not present ");
		}

	}

}
