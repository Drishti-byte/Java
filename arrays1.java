/*Program to input and print the elements of the matrix*/
import java.util.*;
public class arrays1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[];
        a = new int[10];
        int i,j,r,c;
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        c = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i = 0; i < r;i++)
        {
            for(j = 0; j < c;j++)
            {
                a[i] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i = 0; i < r;i++)
        {
            for(j = 0; j < c;j++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}