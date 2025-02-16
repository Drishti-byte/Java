/*program to calculate sum, percentage and grade*/
import java.util.*;
public class condition5 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter marks in five subjects:");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            int m5 = sc.nextInt();
            int total = m1 + m2 + m3 + m4 + m5;
            System.out.println("The total marks is "+total);
            int per = total / 5;
            System.out.println("The percentage is "+per);
            if(per >= 90)
            {
                System.out.println("Your grade is A+");
            }
            else if(per >= 80 && per < 90)
            {
                System.out.println("Your grade is A");
            }
            else if(per >= 60 && per < 80)
            {
                System.out.println("Your grade is B");
            }
            else if(per >= 50 && per < 60)
            {
                System.out.println("Your grade is C");
            }
            else if(per < 50)
            {
                System.out.println("Your grade is D");
            }
        }
    }
}