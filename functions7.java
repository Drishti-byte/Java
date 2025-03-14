/*program to find average of three numbers usng functions*/
import java.util.*;
public class functions7 {
    public static void average(int n1,int n2,int n3)
    {
        int average = (n1+n2+n3)/3;
        System.out.println("Average of three numbers is "+average);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            average(n1,n2,n3);
        }
    }
}