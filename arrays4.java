/*program to perform binary search on the array*/
import java.util.*;
public class arrays4 {
    public static void main(String args[])
    {
       System.out.println("How many elements are there in the array:");
       try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
           System.out.println("Enter the elements of the array:");
           int a[];
           a = new int[5];
           for(int i = 0; i < n;i++)
           {
               a[i] = sc.nextInt();
           }
           System.out.println("Enter the number to be searched:");
           int num = sc.nextInt();
           int st = 0, end = n-1;
           while(st <= end)
           {
                int mid = (st + end) / 2;
                if(a[mid] == num)
                {
                    System.out.println("Number found at position "+mid);
                }
                else if(num > a[mid])
                {
                    st = mid + 1;
                }
                else 
                {
                    end = mid - 1;
                }
            }
    }   }
}