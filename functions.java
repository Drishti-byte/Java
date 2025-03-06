/*program to print my name using functions*/
import java.util.*;
public class functions {
    public static void printMyName(String name)
    {
        System.out.println("Enter your name:");
        System.out.println("Your name is"+name);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            printMyName(name);
        }
    }
}