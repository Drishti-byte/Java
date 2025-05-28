/*program to accept name, address, phone number,grade*/
import java.util.Scanner;
public class lab2 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Your name is "+name);
            System.out.println("Enter yor address:");
            String address = sc.nextLine();
            System.out.println("Your address is "+address);
            System.out.println("Enter your phone number:");
            int phone = sc.nextInt();
            System.out.println("Your phone number is "+phone);
            System.out.println("Enter your grade:");
            String grade = sc.next();
            System.out.println("Your grade is "+grade);
        }
    }
}