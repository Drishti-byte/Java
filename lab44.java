/*program to add,subtract and multiply two matrices*/
import java.util.*;
class add 
{
    int sum[][] = new int[10][10];
    int i,j;
    public void show(int a[][],int b[][],int r1,int c1)
    {
        for(i = 0;i < r1;i++)
        {
            System.out.println();
            for(j = 0;j < c1;j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
class sub
{
    int diff[][] = new int[10][10];
    int i,j;
    public void show(int a[][],int b[][],int r1,int c1)
    {
        for(i = 0;i < r1;i++)
        {
            System.out.println();
            for(j = 0;j < c1;j++)
            {
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(diff[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
class mul 
{    
    int p[][] = new int[10][10];
    int i,j,k;
    public void show(int a[][],int b[][],int r1,int r2,int c2)
    {
        for(i = 0;i < r1;i++)
        {
            System.out.println();
            for(j = 0;j < c2;j++)
            {
                p[i][j] = 0;
                for(k = 0;k < r2;k++)
                {
                    p[i][j] = a[i][k] * b[k][j];
                    System.out.print(p[i][j]+"  ");
                }
            }
            System.out.println();
        }
    }
}
public class lab44{
    public static void main(String[] args) {
        int ch,i,j,r1,r2,c1,c2;
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and columns are there in 1st matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("How many rows and columns are there in 2nd matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if(r2 == c1)
        {
            System.out.println("Enter the elements of 1st matrix: ");
            for(i = 0;i < r1;i++)
            {
                for(j = 0;j < c1;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd matrix: ");
            for(i = 0;i < r2;i++)
            {
                for(j = 0;j < c2;j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Press 1 - Add");
            System.out.println("Press 2 - Subtract");
            System.out.println("Press 3 - Multiply");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                add res = new add();
                res.show(a,b,r1,c1);
                break;
                case 2:
                sub s = new sub();
                s.show(a,b,r1,c1);
                break;
                case 3:
                mul m = new mul();
                m.show(a,b,r1,r2,c2);
                break;
            }
        }
        else 
        System.out.println("Operation not possible");
    }
}