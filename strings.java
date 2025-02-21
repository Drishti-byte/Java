/*program to input a string*/
import java.util.*;
public class strings {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Welcome "+name);
        }
    }
}