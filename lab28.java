/*Create a class BankAccount with methods deposit and withdraw*/
import java.util.*;
class BankAccount 
{
    protected int aid;
    protected String name;
    protected int balance;
    protected int amount;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter account number: ");
        aid = sc.nextInt();
        System.out.println("Enter name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the initial amount: ");
        balance = sc.nextInt();
    }
    void display()
    {
        System.out.println("Account number: "+aid);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
    void deposit()
    {
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Balance after deposit: "+balance);
    }
    void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextInt();
        balance = balance - amount;
        System.out.println("Balance after withdrawal: "+balance);
    }
}
class SavingsAccount extends BankAccount 
{
    void withdraw()
    {
        try 
        {
            if(amount > 100)
            System.out.println("Balance is sufficient");
        }
        catch(Exception e)
        {
            System.out.println("Insufficient balance");
        }
    }
}
public class lab28 {
    public static void main(String args[])
    {
        BankAccount a = new BankAccount();
        a.input();
        a.deposit();
        a.withdraw();
        a.display();
        SavingsAccount s = new SavingsAccount();
        s.withdraw();
    }
}
