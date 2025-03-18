/*program to check whether a person is eligible for voting or not using functions*/
import java.util.*;
public class functions11 {
    public static void vote(int age)
    {
        if(age > 18)
        System.out.println("You are eligible to vote");
        else 
        System.out.println("You are not eligible to vote");
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            vote(age);
        }
    }
}