/*program to print transpose of a matrix*/
import java.util.*;
public class arrays2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][];
        a = new int[5][5];
        int i,j;
        System.out.println("Enter the no. of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int c = sc.nextInt();
        System.out.println("Enter the elements:");
        for(i = 0; i < r;i++)
        {
            for(j = 0; j < c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i = 0; i < r;i++)
        {
            for(j = 0; j < c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The transpose of matrix is:");
        for(i = 0; i < c;i++)
        {
            for(j = 0; j < r;j++)
            {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}