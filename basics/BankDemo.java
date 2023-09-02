package basics;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c=new CheckingAccount(101);
        System.out.println("depositing $500...");
        c.deposit(500.00);
        try {
            System.out.println("\n withdraw $100...");
            c.withdraw(100.00);
            System.out.println("\n withdrawing $600");
            c.withdraw(600.00);

        }
        catch (InsufficientFundsException e)
        {
            System.out.println("sorry ,  but you are short $"+e.getAmount());
            e.printStackTrace();
        }
        finally {
            //System.exit(0);
            System.out.println("you don't have sufficient balance ");
        }
    }
}
