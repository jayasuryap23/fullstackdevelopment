package pattern_practices;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
		Pattern pt =  new Pattern();
		//pt.pattern1();
		//pt.pattern2();
		// pt.pattern3();
		// pt.pattern4();
		// pt.pattern5();
		// pt.pattern6();
		// pt.pattern7();
		// pt.pattern8();
		pt.pattern9();

	}

	private void pattern9() 
	{
		/*
		   *
		   * *
		   *  *  *
		   *  *  * *
		   *  *  *  *  *
		  */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows.");
		int no=in.nextInt();
		for( int row =1;row<=no;row++ )
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(" * "+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern8() 
	{
	   /*
	      1 
         1 2
         1 2 3
         1 2 3 4 
         1 2 3 4 5

	      */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows.");
		int no=in.nextInt();
		for( int row =1;row<=no;row++ )
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern7() 
	{
		/*
		   * * * * * 
           * * * *
           * * * 
           * *
           * 
		 */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int no=in.nextInt();
		for(int row=no;row>=1;row--)
		{
			for(int num=row;num>=1;num--)
			{
				System.out.print(" * "+" ");
			}
			System.out.println();
		}
	}

	private void pattern6() 
	{
		/* 
		   15 14 13 12 11
           10  9  8  7
           6 5 4
           3 2 
           1
		 */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int no=  in.nextInt();
		int num=15;
		for(int row=no;row>=1;row--)
		{
			for(int no1=1;no1<=row;no1++)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}

	private void pattern5() 
	{
		 /* 1 2 3 4 5
            6 7 8  9 
            10 11 12 
            13 14 
            15 
    	   */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter  the number of rows ");
		int no  =  in.nextInt();
		int num=1;
		for(int row=no;row>=1;row--)
		{
			for(int n=1;n<=row;n++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}

	private void pattern4() 
	{
		/* 
		 5 4 3 2 1
         4 3 2 1
         3 2 1
         2 1
         1 
		 */
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int no=in.nextInt();
		for(int row=no;row>=1;row--)
		{
			for(int num=row;num>=1;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern3() 
	{
		/* 
		 1 2 3 4 5
         2 3 4 5
         3 4 5
         4 5
         5
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of rows..");
		int no=  in.nextInt();
		for(int row=1;row<=no;row++)
		{
			for(int num=row;num<=no;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern2() 
	{
		/* 
		 5 4 3 2 1 
		 5 4 3 2
         5 4 3 
         5 4
         5
         */
		Scanner in =  new Scanner(System.in);
		System.out.println(" enter a number :");
		int no=  in.nextInt();
		for(int row=1;row<=no;row++)
		{
			for(int num=no;num>=row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		
	}

	private void pattern1() 
	{
		/*
             1 2 3 4 5
             1 2 3 4 
             1 2 3 
             1 2 
             1
		 */
		Scanner in =  new Scanner(System.in);
		System.out.println(" enter a number :");
		int num=  in.nextInt();
		for(int row=num;row>=1;row--)
		{
			for(int no=1;no<=row;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}

}
