/*program to read and display the array and print sum and average*/
import java.util.*;
public class lab14 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a[];
            a = new int[5];
            System.out.println("Enter the elements of the array:");
            for(int i = 0;i < a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println("The elements of the array are:");
            for(int i = 0;i < a.length;i++)
            {
                System.out.println(a[i]);
            }
            int sum = 0;
            for(int i = 0;i < a.length;i++)
            {
                sum += a[i];
            }
            System.out.println("The sum is "+sum);
            int average;
            average = sum / a.length;
            System.out.println("The average of array elements is "+average);
        }
    }
}