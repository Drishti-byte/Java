/*program to find sum of diagonal matrix*/
import java.util.*;
public class arrays3 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many rows are there:");
            int r = sc.nextInt();
            System.out.println("How many columns are there:");
            int c = sc.nextInt();
            int a[][];
            a = new int[5][5];
            int sum = 0;
            if(r == c)
            {
                System.out.println("Enter the elements:");
                for(int i = 0;i < r;i++)
                {
                    for(int j = 0; j < c;j++)
                    {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Matrix is:");
                for(int i = 0;i < r;i++)
                {
                    System.out.println();
                    for(int j = 0; j < c;j++)
                    {
                        System.out.print(a[i][j]+" ");
                        if(i == j || i + j == r -1)
                        {
                            sum = sum + a[i][j];
                        }
                    }
                    System.out.println();
                }
                System.out.println("The sum of diagonals is "+sum);
            }
        }
    }
}