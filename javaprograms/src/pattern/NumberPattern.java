package pattern;

import java.util.Scanner;

/*
3       
44
555
6666
555
44
3
*/
public class NumberPattern 
{
public static void main(String[] args) 
{
	NumberPattern p =  new NumberPattern();
	// p.pattern1();
	p.pattern2();
	
}

private void pattern2() 
{
	/*
	         3
             45
             678
             9101112
             678
             45
             3
	 */
	int no=3;
	for(int row=1;row<=4;row++)
	{
		for(int num=1;num<=row;num++)
		{
			System.out.print(no+" ");
			no++;
		}
		System.out.println();
	}
	int no1=6;
		for(int row=3;row>=1;row--)
		{
			for(int num=1; num<=row;num++)
			{
				System.out.print(no1+" ");
				no1++;
			}
			System.out.println();
				
				
		}
		
	}
	


private void pattern1() 
{
	int num=3;
	for(int row=1;row<=4;row++)
	{
		for(int no=1;no<=row;no++)
		{
		System.out.print(num+" ");
		}
		num++;

		System.out.println();
	}
	int end=6;
	for(int row=3;row>=1;row--)
	{
		end--;
		for(int no=1;no<=row;no++ )
		{
          System.out.print(end+" ");
		}
		System.out.println();
	}
	
}

}
