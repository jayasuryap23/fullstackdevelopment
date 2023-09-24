package pattern;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		Pattern2 p  =   new Pattern2();
		
		//p.pattern2();
		//p.pattern3();
		p.pattern4();
	}

	private void pattern4() 
	{
		/* 
		 1 
		 2 3
		 4 5 6
		 7 8 9 10
		 11 12 13 14 15 
		 */
		int num=1;
		for(int count=1;count<=5;count++)
		{
			for(int no=1; no<=count;no++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

	private void pattern3() 
	{
		/* 
		     1  num =1   
            2 3
           4 5 6 
         78 9 10
         11 12 13 14 15 

		 */
		int k=1;
		for(int r=1; r<=5;r++)
		{
			for(int c=1; c<=r;c++)
			{
               System.out.print(k);
               k++;
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
                                 12345 */
		for(int count=5;count>=1;count--)
		{
			for(int no=1;no<count;no++)
			{
				System.out.print(" ");
			}
			for(int num=1; num<= 6-count;num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
     
	}

	private void pattern1()
	{
		/*
		 * * * * 1    number  star one       no+ one =6
		                                      one =  6-no
	                	5     4    1 
		                4     3    2
		                3     2    3
		                2     1    4
                        1     0    5 
		 * * * 1 1
		 * * 1 1 1 
		 * 1 1 1 1 
		 1 1  1 1 1 
		  */
		for(int count=5;count>=1;count--)
		{
			for(int no=1; no<count;no++)
			{
				System.out.print(" "); //  2 
			}
			for(int num=1;num<=6-count;num++)
			{
				System.out.print(num+"");  //  3 
			} 
			System.out.println();
		}
		
	}

}
