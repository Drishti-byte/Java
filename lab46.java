/*program to create a class account*/
import java.util.*;
class Account 
{
    int accno;
    String name;
    String accname;
    int balance;
    Account()
    {
        accno = 1455;
        name = "Drishti";
        accname = "Private";
        balance = 20000;
    }
    void display()
    {
        System.out.println("Accno: "+accno);
        System.out.println("Name: "+name);
        System.out.println("Accname: "+accname);
        System.out.println("Balance: "+balance);
    }
    void withdrawal()
    {
        int amount = 2000;
        System.out.println("Balance after withdrawal: "+(balance-amount));
    }
    void deposit()
    {
        int a = 5000;
        System.out.println("Balance after deposit: "+(balance + a));
    }
}
public class lab46 {
    public static void main(String[] args) {
        Account a = new Account();
        a.display();
        a.withdrawal();
        a.deposit();
    }
}