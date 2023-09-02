package basics;

public class Puppy
{
    int puppyAge;
    public Puppy(String name)
    {
        System.out.println("  passed Name is :"+name);
    }
    public void setAge(int age)
    {
        puppyAge=age;// global variable name =  local variable name
    }
    public int getAge()
    {
        System.out.println(" puppy age is :"+puppyAge);
        return  puppyAge; //  global  variable
    }

    public static void main(String[] args) {
        Puppy myPuppy  =  new Puppy("tommy"); // oject creation
        //  calling class method to set puppy age
        myPuppy.setAge(2);
        //  calling another class method to get puppy age
        myPuppy.getAge();
        /* you can acess instance variables as follows as well*/
        System.out.println(" variable value :"+myPuppy.puppyAge);

    }
}
