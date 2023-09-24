package pattern;

public class Pattern5 {

	public static void main(String[] args) 
	{
		Pattern5 p  =  new Pattern5();
		// p.pattern1();
	  //	p.pattern2();
		//p.pattern3();
		// p.pattern4();
		//p.pattern5();
		p.pattern6();
		
		
		

	}

	
	

	private void pattern6() 
	{
		/*
		 5 
         45
         345
         2345
         12345
         */
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}




	private void pattern5() 
	{
		for(int row=5;row>=1;row--)
		{
			for(int num= 5; num>=row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}




	private void pattern4() 
	{
		/* 
		 5 4 3 2 1
		 5 4 3 2
		 5 4 3
		 5 4 
		 5 
		
		*/
		for(int row=1;row<=5;row++)
		{
			for(int num=5;num>=row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}




	private void pattern3() 
	{
		/* 
		     1
            2 3
           4 5 6 
         78 9 10
         11 12 13 14 15 
    */
		int no=1;
		for(int row=1;row<=5;row++)
		{
            for(int star=1;star<=5-row;star++)
				
			{
				System.out.print(" ");
			}
			for(int num=1;num<=row;num++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

	private void pattern2() 
	{
		/* 
    1
   12
  123
 1234
12345
      */
		for(int row=1;row<=5;row++)
		{
        for(int star=1;star<=5-row;star++)
				
			{
				System.out.print("  ");
			}
			
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
		 
		   * * * * 5
	       * * * 5 4
	       * * 5 4 3
	       * 5 4 3 2
	       5 4 3 2 1
	       
	       row  star number
	       1      4    5 -1
	       2      3    5-2
	       3      2     5-3
	       4      1     5-4
	       5      0      5-5
	       row+star=5
	       
	       star = 5-row
	       
	       row+num= 6;
	       num =6-row
	       
	       */
		for(int row=1;row<=5;row++)
		{
			for(int star=1;star<=5-row;star++)
				
			{
				System.out.print("  ");
			}
			for(int num=5; num>=6-row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
