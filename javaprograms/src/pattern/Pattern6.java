package pattern;

public class Pattern6 {

	public static void main(String[] args) 
	{
		Pattern6 p  =  new Pattern6();
		//p.pattern1();
		//p.pattern2();
		// p.pattern3();
		//p.pattern4();
		//p.pattern5();
		//p.pattern6();
		//p.pattern7();
		// p.pattern8();
		// p.pattern9();
		p.pattern10();
		
		


	}

	private void pattern10() 
	{
		for(int row=1;row<=7;row++)
		{
			System.out.print("* ");
		
		}
		for(int star=1;star<=10;star++)
		{
			System.out.println("*");
		}
		for(int col=1;col<=7;col++)
		{
			System.out.print("*");
		}
		
	}

	private void pattern9()
	{
		for(char row='E'; row<='A'; row--)
		{
			for(char star='A'; star<='E'-row;row++)
			{
				System.out.print(" ");
			}
			for(char col='A'; col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern8() 
	{
		/*
		 1 1 1 1 1 
		    3 3 3 3
		       5 5 5 
		          7 7 
		             9 
		 */
		for(int row=1;row<=9;row+=2)
		{
			for(int star=1;star<=6-row;star++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern7() 
	{
	/*
		 11111
		  2222
		  333
		  44
		  5
	*/
		for(int row=1;row<=5;row++)
		{
			for(int star=1;star<=6-row;star++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern6() 
	{
	/*
	
		 5 4 3 2 1
		 4 3 2 1
		 3 2 1
		 2 1
		 1
	 */
		for(int row=5;row>=1;row--)
		{
			for(int num=row;num>=1;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	private void pattern5() 
	{
		for(int row=5;row>=1;row--)
		{
			for(int star=1;star<=5-row;star++)
			{
				System.out.print("");
			}
			for(int num=1;num<=row;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	private void pattern4() 
	{
	/*
		 1 
		 22
		 333 
		 4444
		 55555
	*/
		for(int row=1;row<=5;row++)
		{
			for(int star=1;star<=5-row;star++)
			{
				System.out.print("  ");
			}
			for(int num=1;num<=row;num++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern3() 
	{
		/* 
		 1 
		 1 2 
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5
		 
		 */
		for(int row=1;row<=5;row++)
		{
			for(int star=1;star<=5-row;star++)
			{
				System.out.print(" *");
			}
			for(int num=1;num<=row;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	private void pattern2()
	{
		/*
		 1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5 
		 */
		for(int  row=1;row<=5;row++)
		{
			for(int num=1;num<=row;num++)
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
		for(int row=5;row>=1;row--)
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
