package pattern;

public class Pattern3 {

	public static void main(String[] args) 
	{
		Pattern3 p  =  new Pattern3();
		//p.program1();
		//p.program2(); {2}
		//p.program3();
		// p.program4(); {4}
		// p.program5();
		// p.program6(); {***}
		//p.program7();
		// p.program8();
		// p.program9(); {same}
		// p.program10();
		//p.program11(); {check  11 }
		// p.program12(); {same}
		// p.program13(); {same}
		//  p.program14(); {same}
		//  p.program15(); { again}
		p.program16(); // {check 16} {row}
		
		
		
		
		
		

	}

	private void program16() 
	{
		
	/* 
		 * * * * 5
		 * * * 4 5
		 * * 3 4 5 
		 * 2 3 4 5
		 1 2 3 4 5 
		 row star 
		 1     4
		 2     3
		 3     2
		 4     1
		 5     0
		 row + star =5
		 row = 5-row 
		 
	*/
		for(int row =5;row>=1;row--)
		{
			for(int star=1;star<row;star++)
			{
				System.out.print("* ");
			}
			for(int num=row;num<=5;num++)
			{
			System.out.print(num+" ");
			}
			System.out.println();
			
		}
		
	}
	

	private void program15() 
	{
		/*
		 */
		for(int row=5;row>=1;row--)
		{
			for(int star=1;star<row;star++)
			{
				System.out.print("  ");
			}
			for(int no=5; no>=row;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}

	private void program14() 
	{
		/* 
		 5 
        5 4 
        5 4 3 
        5 4 3 2 
        5 4 3 2 1 
     */
		for(int count=5;count>=1;count--)
		{
			for(int no=5; no>=count; no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void program13() 
	{
	 /* 
		 5 
         5 4 
         5 4 3 
         5 4 3 2 
         5 4 3 2 1 
      */
		for(int end=5;end>=1;end--)
		{
			for(int no=5; no>=end;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();

		}
		
	}

	private void program12() 
	{
	/*
		 5
		 5 4 
		 5 4 3
		 5 4 3 2 
		 5 4 3 2 1 
	*/
		for(int count=5;count>=1;count--)
		{
			for(int no=5; no>=count;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}

	private void program11() 
	{
	/* 
		 * * * * 5
		 * * * 5 4 
		 * *  5 4 3 
		 *  5 4 3 2 
		  5 4 3 2 1 
		row  star number
		1     4   {5}- 1 { starts from 5 }
		2     3   5- 2
		3     2   5- 3
		4     1   5- 4 
		5     0   5= 5
		row +  star=5 
		star = row -5 
		
		num --> row :
		num-->  
		row 1 - 5 -- 6 
		row 2 - 4
		row 3 - 3
		row 4 - 2
		row 5 - 1 
		
		row+ num= 6 - row 
	*/
		
	}

	private void program10()
	{
		/*
		 1 
		 2 3
		 4 5 6
		 7 8 9 10
		 11 12 13 14 15 */
		int num=1;
		for(int count=1;count<=5;count++)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	private void program9() 
	{
		for(int count=5;count>=1;count--)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print(" ");
			}
			for(int num=1;num<=6-count;num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}

	private void program8()
	{
		for(int count=5;count>=1;count--)
		{
			for(int no=1 ;no<count;no++)
			{
				System.out.print(" ");
			}
			for(int num=1;num<=6-count;num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}

	private void program7() 
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

	private void program6() 
	{
	  /* * 1 2 3 4 5
		 * 6  7  8  9 
		 * 10 11 12 
		 * 13 14 
		 * 15 
		 */
		int num=1;
		for(int count=5;count>=1;count--)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

	private void program5() 
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
			for(int num=count;num<=5;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	private void program4() 
	{
		/* 5 4 3 2 1
		 * 4 3 2 1 
		 * 3 2 1 
		 * 2 1 
		 * 1 
		 */
		
		for(int count=5;count>=1;count--)
		{
			for(int no=count;no>=1;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}

	private void program3() 
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
			for(int num=9;num>=count;num-=2)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void program2() 
	{
		/* 
		 * 5 4 3 2 1
		 * 5 4 3 2
		 * 5 4 3 
		 * 5 4
		 * 5*/
		for(int num=1;num<=5;num++)
		{
			for(int count =5 ; count>=num;count--)
			{
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
	}
		
		
		
	
		
	

	private void program1() 
	{

		/*
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
		for(int count=5;count>=1;count--)
		{
			for(int num=1;num<=count;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
