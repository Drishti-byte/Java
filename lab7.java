/*Program to read a month number and display the number of months*/
import java.util.*;
public class lab7 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a month number:");
            int month = sc.nextInt();
            switch(month)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                System.out.println("31 days");
                break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("30 Days");
                break;
                default:
                System.out.println("Invalid option");
            }
        }
    }
}