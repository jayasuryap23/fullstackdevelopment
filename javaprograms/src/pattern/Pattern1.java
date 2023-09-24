package pattern;

public class Pattern1 {

	public static void main(String[] args) 
	{
		Pattern1 p  =  new Pattern1();
		// p.pattern1();
		// p.pattern2();
		// p.pattern3();
		// p.pattern4();
		// p.pattern5();
		//  p.pattern6();	
		// p.pattern7();
		// p.pattern8();
		// p.pattern9();
		// p.pattern10();
	      //  p.pattern11();
		// p.pattern12();
		// p.pattern13();
		p.pattern14();
		
		

	}

	private void pattern14() 
	{
		/* 
		  * * * * 
		  * * *
		  * *
		  * 
	   */
		for(int no=5;no>=1;no--)
		{
			for(int star=1;star<no;star++)
			{
				System.out.print("*"+" ");
			}
			for(int num=1;num<=5;num++)
			{
				System.out.print("1"+" ");
			}
			System.out.println();
		}
	}

	private void pattern13() 
	{
	   /*	15  14  13  12 11 
		    10  9  8  7
		    6   5   4 
		    3   2 
		    1 
		*/
		int num=15;
		for(int count=5;count>=1;count--)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
		
		
	}

	private void pattern12()
	{
		/* 
		 * 1 2 3 4 5
		 * 6 7 8 9
		 * 10 11 12
		 * 13 14 
		 * 15 
		 */
		int num=1;
		for(int count=5;count>=1;count--)
		{
			for(int no=1 ; no<=count;no++)
			{
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
		
	}

	private void pattern11() 
	{
		/* 
		 * 1 2 3 4 5
		 * 6  7  8  9 
		 * 10 11 12 
		 * 13 14 
		 * 15 
		 */
		int count=5;
		int num=1;
		while(count>=1)
		{
			for(int no=1; no<=count; no++)
			{
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
			count--; 
		}
		
	}

	private void pattern10() 
	{
		/* 
		 * 1 2 3 4 5 
		 * 2 3 4 5
		 * 3 4 5
		 * 4 5 
		 * 5 
		 */
		for(int count=1;count<=5;count++)
		{
			for(int no =count; no<=5;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}

	private void pattern9() 
	{
		/* 5 4 3 2 1
		 * 4 3 2 1 
		 * 3 2 1 
		 * 2 1 
		 * 1 
		 */
		for(int count =5 ; count>=1;count--)
		{
			for(int no =count; no>=1;no-- )
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern8() 
	{
		/* 
		 *  9  7 5 3 1 
		 *  9 7  5 3
		 *  9  7 5
		 *  9 7 
		 *  9  
		 */
		for(int count=1;count<=9;count+=2)
		{
			for(int no=9;no>=count; no=no-2) //  1 3 5 7 9  
			{
				System.out.print(no+" ");
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
		   
		 * */
		for(int count=1;count<=5;count++)
		{
			for(int no=5;no>=count;no--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void pattern6() 
	{
		/* 
		 * 5 4 3 2 1
		 * 5 4 3 2
		 * 5 4 3 
		 * 5 4
		 * 5*/
		for(int count=1;count<=5;count++)
		{
			for(int no=5;no>=count;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}
	private void pattern5() 
	{
		/*
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
		for(int count =5;count>=1;count--)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern4() 
	{
		for(int no=1;no<=25;no++)
		{
			System.out.print(no+" ");
			if(no%5==0)
			{
				System.out.println();
			}
		}
	}

	private void pattern3()
    {
		int count=1;
		while(count<=3)
		{
		for(int no=1;no<=9;no+=2)
		{
			System.out.print(no+" ");
		}
		count++;
		System.out.println();
    }
		
	}

	private void pattern2() 
	{
		
	}

	private void pattern1() 
	{
		for(int count=1;count<=4;count++)
		{
			for(int no=5;no>=1;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}
}
