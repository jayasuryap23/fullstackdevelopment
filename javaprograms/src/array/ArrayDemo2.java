package array;

public class ArrayDemo2 {

	public static void main(String[] args) 
	{
		ArrayDemo2 d2 =  new ArrayDemo2();
		// d2.nextBig(); //  find the next biggest element of each element given. 
		//d2.secondBig(); // 5 8 30 11 
		char[] name ={'w','e','l','c','o','m','e','t','o','f','u','l','l','s','t','a','c','k'};
		//d2.find_a(name);
		d2.find_palindrome();

	}

	private void find_palindrome() 
	{
		char[] name =  {'m','a','l','a','y','a','l','a','m'};
		int count=0;
		int len =  name.length-1;
		int i=0;
		while(i<len)
		{
		char first =  name[i];
		char last = name[len];
		if(first ==last)
		{
			 count++; 
		}
		else
		{
			System.out.println(" not a palindrome..");
			break;
		}
		i++;
		len--;
		}
		if(count==name.length/2)
		{
		System.out.println("palindrome");
		}
		
	}

	private void find_a(char[] name) 
	{
		char ch=name[0];
		int count=0;
		for(int i=0;i<name.length;i++)
		{
			if(ch==name[i])
				count++;
		}
		System.out.println("count of "+ch+" is "+count);
	}

	private void secondBig() 
	{
		int [] ar= {5,8,30,11};
		int big = ar[0];
		int second_big = ar[0];
		for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>big)
		{
			second_big =big;
			big=ar[i];
		}
		else if (ar[i]>second_big)
		{
			second_big =ar[i];
		}
	}
		System.out.println(" biggest is :"+big);
		System.out.println(" second biggest is :"+second_big);
	}

	private void nextBig() 
	{
		int [] ar= {4,8,6,9};
		for(int j=0;j<ar.length;j++)
		{
		int no=ar[j]; //  first number 
		int big=Integer.MAX_VALUE;

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>no)
			{
				if(ar[i]<big)
				{
					big=ar[i];
				}
			}
		}
		if(big==100)
		{
			System.out.println(no+"-->"+no);
		}
		else
		System.out.println(no+" -->"+big);

		
	}
	}
}

	


