package array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) 
	
	{
		ArrayDemo1 ad =  new ArrayDemo1();
		// ad.findGreatest();
		 // ad.example2();
		ad.example3();
		ad.example4();
		
		
	}

	private void example4() 
	{
		int [] first = {90,76,87};
		int [] second = {96,98,45};
		int count=0;
		for(int i=0;i<first.length;i++)
		{
			if(second[i]>first[i])
			{
				count++;
			}
		}
		System.out.println();
		int [] total=  new int [first.length];
		
		for(int i=0;i<total.length;i++)
		{
			total[i]= first[i]+second[i];
			System.out.println("total is :"+total[i]);
			
		}
		
		/*
		 * total[0]= first[0]+ second[0]; total[1] = first[1]+ second[1]; total[2] =
		 * first[2]+ second[2];
		 */
		
		
	}

	private void example3() 
	{
		int [] first = {90,76,87};
		int [] second = {56,98,45};
		// int j=0;
		int[] total =  new int [first.length+second.length];
		
		/*
		 * total[0] = first[0]; total[1] = first[1]; total[2] = first[2]; total[3] =
		 * second[1]; total[4] = second[2]; total[5] = second[3];
		 */
		
		for(int i=0;i<total.length;i++)
		{
			if(i<first.length)
			{
				total[i]= first[i];
				System.out.println(total[i]);
			}
			else
			{
				total[i]= second[i-first.length];
				// j++;
				
				System.out.println(total[i]);
			}
		}

		
	}

	private void example2() 
	{
		int [] tour= {1000,1500,300,450};
		
		int[] trip = {343,400};
		int total=0;
		
		for(int i=0;i<tour.length;i++)
		{

			total=  total+tour[i];
		}
		for(int i=0;i<trip.length;i++)
		{
			total =  total+trip[i];
		}
		System.out.println(" Total Expenditure is :"+total);
	}

	private void findGreatest() 
	{
		System.out.println(" enter number of subjects ");
		Scanner sc =  new Scanner(System.in);

		int subjects =  sc.nextInt();
		
		int [] marks =  new int [subjects ];
		int total=0;
		int count=0;
		int big=0;
		int small=101;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the mark: ");
			marks[i] = sc.nextInt();
			if(marks[i]>big)
			{
				big=marks[i];
			}
			if(marks[i]<small)
			{
				small=marks[i];
			}
			total+=marks[i];
		// 	System.out.println(marks[i]);
		}
		System.out.println("TOTAL:"+total);
		System.out.println(" big is :"+big);
		System.out.println(" small is :"+small);
	}


	
}
