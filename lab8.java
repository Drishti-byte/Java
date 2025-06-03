/*Program to accept grade and display description*/
import java.util.*;
public class lab8 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your grade:");
            char grade = sc.next().charAt(0);
            if(grade == 'A')
            System.out.println("Excellent");
            else if(grade == 'B')
            System.out.println("Good");
            else if(grade == 'C')
            System.out.println("Fair");
            else if(grade == 'D')
            System.out.println("Poor");
            else if(grade == 'E')
            System.out.println("Need Improvement");
            else  
            System.out.println("Fail");
        }
    }
}