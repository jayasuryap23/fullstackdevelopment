package abstraction;

public class Abstractdedmo {
    public static void main(String[] args) {
        //  would raise an error
        Salary s = new Salary("Mohd", "Ambehta", 3, 3600.00);
        Employee e = new Salary("john adams", "Boston", 2, 2400.00);
        System.out.println("Call mailCheck using salary reference--");
        s.mailCheck();
        System.out.println("\n mailCheck using employee reference--");
        e.mailCheck();

    }
}
