package string;

public class StringDemo1 
{
public static void main(String[] args) 
    {
	StringDemo1 sd =  new StringDemo1();
	// sd.first();
	// sd.check_starting("good morning","good"); //  starts with 
	// sd.endsWith("good morning","good morning");
	sd.space("MonTuesWednesThursFri");
	//sd.space1("MonTuesWednesThursFri");
	
	// sd.
    }



private void space1(String day) 
{
  for(int i=0;i<day.length();i++)
  {
	  System.out.print(day.charAt(i));
  }
}



private void space(String days) 
{
	for(int i=0;i<days.length();i++)
	{
		if(days.charAt(i)>='A' && (days.charAt(i)<='Z'))
		{
			// if it is not first letter  give space 
			if(i!=0) // ( 0==0)  1 !=0 0!=0
				System.out.print("day"+" "+days.charAt(i));
			else
				System.out.print(days.charAt(i)); //  if it is not first letter 
			// print like this 
			
		}
		else
		{
			System.out.print(days.charAt(i));
		}
	}
	
}



private void endsWith(String s1, String s2)
{
	int count=0;
	int len1= s1.length();
	int len2=s2.length();
	for(int i=1;i<=s2.length();i++)
	{
		if(s2.charAt(len2-1)==s1.charAt(len1-1))
		{
			count++;
			continue;
		}
		else
		{
			System.out.println(" not ends with ");
			break;
		}
		
	}
	if(count==s2.length())
	{
		System.out.println(" yes  ends  with ");
	}
	
	
	
}



private void check_starting(String s1, String s2) 
{
	int count =0;
	for(int i=0;i<s2.length();i++)
	{
		if(s2.charAt(i)==s1.charAt(i))
		{
			count++;
			continue;
		}
		else
		{
			System.out.println(" not starts with ");
			break;
		}
		
	}
	if(count==s2.length())
	{
		System.out.println(" yes  starts with ");
	}
	
	
}



private void first() 
{
	/* 
	 */
  String name = "welcome";
  System.out.println(name.length());
  
  char ch  =name.charAt(0);
  System.out.println(ch);
  System.out.println(name.contains("come")); //  boolean
  System.out.println(name.endsWith("me")); // boolean  
  System.out.println(name.startsWith("we"));// boolean  
  
  
  /*
   it is presentt in lang package 
   *  1.Non -  static ,  
   *  argument data type -  int , 
   *   return type -  char 
   */
  
}
}
