package pattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter  the number :");
		int no=in.nextInt();
		for(int row=1;row<=no;row++)
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=no-1;row>=1;row--)
		{
			for(int num=1; num<=row;num++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
