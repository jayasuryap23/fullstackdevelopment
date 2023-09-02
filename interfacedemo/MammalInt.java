package interfacedemo;

public class MammalInt implements Animal
{

    @Override
    public void eat()
    {
        System.out.println("mammal  eats");
    }

    @Override
    public void travel()
    {
        System.out.println("mamaml travels");

    }
    public int noOfLegs()
    {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
