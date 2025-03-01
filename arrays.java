/*program to print the sum of array elements*/
import java.util.*;
public class arrays {
    public static void main(String args[])
    {
       try (Scanner sc = new Scanner(System.in)) {
           int i,n,sum = 0;
           System.out.println("How many elements are there:");
           n = sc.nextInt();
           int a[];
           a = new int[n];
           System.out.println("Enter the elements:");
           for(i=0; i < n;i++)
           {
                a[i] = sc.nextInt();
           }
           System.out.println("The elements are:");
           for(i=0; i < n;i++)
           {
                System.out.println(a[i]);
                sum = sum + a[i];
           }
           System.out.println("The sum is "+sum);
        }
    }
}