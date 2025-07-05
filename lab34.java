/*program to check whether a number is even or odd*/
import java.util.*; 
public class lab34 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if(num % 2 == 0)
        System.out.println(num+" is even");
        else 
        System.out.println(num+" is odd");
    }
}