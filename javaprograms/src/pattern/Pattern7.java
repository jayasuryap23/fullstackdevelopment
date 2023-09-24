package pattern;

public class Pattern7 {

	public static void main(String[] args) 
	{
		Pattern7 alphabet =  new Pattern7();
		//alphabet.print_c();
		// alphabet.print_E();
		// alphabet.print_F();
		alphabet.print_O(); // {status:200}
		alphabet.print_8(); //  9 * 9 
		alphabet.print_8();
		alphabet.print_8();
		alphabet.print_8();
		alphabet.print_8();
		alphabet.print_8();
		
		
		

	}

	
		
	

	private void print_8() {
		// TODO Auto-generated method stub
		
	}





	private void print_O() 
	{
		
	}





	private void print_F() 
	{
		for(int row=1;row<=6;row++)
		{
			if(row==1)
			{
			System.out.print("");
			}
			else
			{
				System.out.print(" *");
			}
		}
		System.out.println("*");
		for(int star=1;star<=8;star++)
		{
			System.out.println("*");
		}
		
		for(int col=1;col<=6;col++)
		{
		
			System.out.print(" *");
		}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			System.out.println("*");
		}
		
	}

	private void print_E() 
	{
		/* 
  * * * * *
*
*
*
*
*
*
*
  * * * * *
*
*
*
*
*
*
*
 * * * * *
		 
		 */
		
		for(int row=1;row<=6;row++)
		{
			if(row==1)
			{
			System.out.print("");
			}
			else
			{
				System.out.print(" *");
			}
		}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			System.out.println("*");
		}
		for(int col=1;col<=6;col++)
		{
			if(col==1)
			{
				System.out.print(" ");
			}
			else
			{
			System.out.print(" *");
			}
			
		}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			System.out.println("*");
		}
		for(int row=1;row<=6;row++)
		{
			if(row==1)
			{
			System.out.print("");
			}
			else
			{
				System.out.print(" *");
			}
		}
		
		
	}

	

	private void print_c() 
	{
		/*
  * * * * * 
*
*
*
*
*
*
*
  * * * * *
		 */
		for(int row=1;row<=6;row++)
		{
			if(row==1)
			{
			System.out.print("");
			}
			else
			{
				System.out.print(" *");
			}
		}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			System.out.println("*");
		}
		for(int col=1;col<=6;col++)
		{
			if(col==1)
			{
				System.out.print(" ");
			}
			else
			{
			System.out.print(" *");
			}
			
		}
		
		
		
	}

}
