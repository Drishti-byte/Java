/*program to create a class bank*/
import java.util.*;
class bank 
{
    private int accno;
    private String name;
    private int balance;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter account number:");
        accno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter balance:");
        balance = sc.nextInt();
    }
    void show()
    {
        System.out.println("Account Number: "+accno);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
public class class2 {
    public static void main(String args[])
    {
        bank a,b;
        a = new bank();
        b = new bank();
        a.input();
        b.input();
        a.show();
        b.show();
    }
}