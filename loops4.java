/*program to make a menu driven program using loops*/
import java.util.*;
public class loops4 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number(1 or 0):");
            int num;
            do
            {
                System.out.println("Enter your marks:");
                int marks = sc.nextInt();
                if(marks >= 90)
                {
                    System.out.println("This is good");
                }
                else if(marks >= 60 && marks < 89)
                {
                    System.out.println("This is also good");
                }
                else
                {
                    System.out.println("This is good as well");
                }
                System.out.println("Do you want to continue(yes = 1 | no = 0):");
                num = sc.nextInt();
            }while(num == 1);
        }
    }
}