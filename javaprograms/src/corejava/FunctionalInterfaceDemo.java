package corejava;

@FunctionalInterface
public interface FunctionalInterfaceDemo 
{
	/* 1.it should have only one abstract method
	 2. it can have static methods with definitions
	 3.it can have default methods 
	 */
     //  public void test();
      //  public void display();

      //  abstract void add ();

       abstract void subtract();
       
       static void test()
       {
    	   System.out.println(" testing ");
       }
       default void display2()
       {
    	   System.out.println(" display 2 ");	

       }
}
       /* lambda expression   
        * steps to create lambda expression *
        1.remove any access modifier if present 
        2. remove return datatype 
        3.remove method name
        4.remove data type in args
        5.add arrow after arguments 
        
        (no1,no2)->
        {
        System.out.println("welcome");
        }
        
         */
       
       
       
       
       
       
       
       
       
       
       
       
       