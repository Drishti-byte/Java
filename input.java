/*program to take input*/
import java.util.Scanner;
public class input {
    public static void main(String args[])
    {
        try (Scanner scaner = new Scanner(System.in)) 
        {
            String name = scaner.nextLine();
            System.out.println(name);
        }
    }
}