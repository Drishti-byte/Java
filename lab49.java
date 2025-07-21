/*program to implement call by value*/
import java.util.*;
public class lab49 {
    static void swap(int a,int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Numbers before swapping: "+num1+" "+num2);
        swap(num1,num2);
        System.out.println("Numbers after swapping: "+num1+" "+num2);
    }
}