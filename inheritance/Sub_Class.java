package inheritance;

public class Sub_Class extends  Super_Class{
    int num=10;
    //  display method of sub class
    public void display()
    {
        System.out.println(" this is the display method of subclass");
    }
    public void my_method()
    {
        //  instantiating sub class
        Sub_Class sub =  new Sub_Class();

        //  invoking the display() method of sub class
        sub.display();

        //invoking the display() method of super class
        super.display();

        //  printing the value of variable nuum of the subclass
        System.out.println(" value of the variable named num in sub class :"+sub.num);

        //  printing the value of variable nuum of the subclass
        System.out.println(" value of the variable named num in super class :"+super.num);


    }

    public static void main(String[] args) {
        Sub_Class obj =  new Sub_Class();
        obj.my_method();
    }
}
