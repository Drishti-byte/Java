/*program to create a class bank*/
import java.util.*;
class bank 
{
    protected int accno;
    protected String name;
    protected int balance;
    Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter account no:");
        accno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your balance:");
        balance = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Accno: "+accno);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
class savings extends bank 
{
    public void withdraw()
    {
        int w;
        int amount = 0;
        super.input();
        System.out.println("Enter amount to withdraw:");
        w = sc.nextInt();
        if(w < balance)
        {
            amount = balance - w;
            System.out.println("Balance after withdrawal: "+amount);
        }
        else 
        System.out.println("Insufficient balance");
    }
    public void deposit()
    {
        int d;
        int amount = 0;
        System.out.println("Enter amount to deposit:");
        d = sc.nextInt();
        amount = balance + d;
        System.out.println("Balance after deposit: "+amount);
    }
}
class fd extends bank 
{
    private int p;
    private int r;
    private int t;
    public void input()
    {
        System.out.println("Enter to amount for fixed deposit: ");
        p = sc.nextInt();
        System.out.println("Enter rate:");
        r = sc.nextInt();
        System.out.println("Enter time period:");
        t = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Principal amount: "+p);
        System.out.println("Rate of fd: "+r);
        System.out.println("Time of fd: "+t);
    }
    public void amount()
    {
        int a;
        int si;
        si = (p*r*t)/100;
        a = balance + si;
        System.out.println("Amount of interest: "+si);
    }
}
public class inheritance3 {
    public static void main(String args[])
    {
        savings s = new savings();
        fd ob = new fd();
        s.withdraw();
        s.show();
        s.deposit();
        s.show();
        ob.input();
        ob.show();
        ob.amount();
    }
}