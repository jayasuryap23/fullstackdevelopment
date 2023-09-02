package abstraction;

public class Salary1 extends Employee1
{
    private  double salary;

    @Override
    public double computePay()
    {
        System.out.println("computing salary pay for ");
        return salary/52;
    }
}
