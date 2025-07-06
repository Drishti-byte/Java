/*program to print the table*/
import java.util.*;
public class lab35 {
    public static void main(String[] args) {
        int num,i,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        for(i = 1;i <= 10;i++)
        {
            p = num * i;
            System.out.println(num+" X "+i+" = "+p);
        }
    }
}