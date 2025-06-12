/*program to reverse the contents of the array*/
import java.util.*;
public class lab15 {
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
            int i,j;
            for(i=0,j=a.length - 1;i < a.length/2;i++,j--)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            System.out.println("The elements of the array are:");
            for(i = 0;i < a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
}