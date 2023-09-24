package pattern;

public class Pattern4 {

	public static void main(String[] args) 
	{
		Pattern4 p  =  new Pattern4();
		// p.program1();
		p.program2();

	}

	private void program2() 
	{
		/* 
		 
	   * * * * 5
       * * * 5 4
       * * 5 4 3
       * 5 4 3 2
       5 4 3 2 1
       
       */
	}

	private void program1() 
	{
      /* 
       * * * * 5
       * * * 5 4
       * * 5 4 3
       * 5 4 3 2
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
		for(int row=1;row<=5;row++)
		 {
			for(int star =1; star<=5-row;star++)
			{
				System.out.print("  ");
			}
			for(int num=5;num>=6-row;num--)
			{
				System.out.print(num+" ");
			}
			 System.out.println();
		}
		
		
		
		
	}

}
