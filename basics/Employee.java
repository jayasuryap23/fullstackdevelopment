package basics;
public class Employee
{
    String name;
    int age;
    String designation;
    double salary;
    public Employee(String name)
    {
        this.name=name;
    }
    public void empAge(int empage)
    {
        age=empage;
    }
    public void setDesignation(String empdesignation)
    {
        designation=empdesignation;
    }
    public void setSalary(double empsalary)
    {
        salary=empsalary;

    }
    public void printEmployee_details()
    {
        System.out.println("name is :"+name);
        System.out.println("age is :"+age);
        System.out.println("designation  is :"+designation);
        System.out.println("salary is :"+salary);
    }

    public static void main(String[] args)
    {
        // creating two objects using constructor
        Employee empone =  new Employee("james smith");
        Employee emptwo =  new Employee("mary anne");;

        //  invoking methods for each  object
        empone.empAge(24);
        empone.setDesignation("senior software engineer");
        empone.setSalary(100000.55);
        empone.printEmployee_details();

        emptwo.empAge(21);
        emptwo.setDesignation("associate software engineer");
        emptwo.setSalary(20000);
        emptwo.printEmployee_details();
    }
}
