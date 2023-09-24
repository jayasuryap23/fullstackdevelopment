package pattern;

import java.util.Scanner;

public class InvertedDiamond 
{

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		System.out.println("enter the number of rows...");
		int no=in.nextInt();
		
		/*   
		             *         row  space star   space + row =7 space = 7-row 
		            * *         1    6      1
                   * * *        2    5      2        space + star=7   star =  7-space  space <=row 
                  * * * *       3    4      3
                 * * * * *      4    3      4
                                5    2      5
                * * * * * *     6    1      6
               * * * * * * *    7    0      7
		 */
		for(int row=1;row<=no;row++)
		{
			for(int space =  1;space<=no-row;space++)
			{
				System.out.print(" ");
				
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
			for(int row=1;row<=no-1;row++)
			{
				for(int space=1;space<=row;space++)
				{
					System.out.print(" ");
				}
				for(int star=1;star<=no-row;star++)
				{
					System.out.print(" *");
				}
				System.out.println();
			
		}
		                    
	}
}