/*program to print sum of digits using do-while*/
import java.util.*;
public class loops31 {
    public static void main(String args[]){
        int choice;
        do{
            System.out.println("Enter a number:");
            try (Scanner sc = new Scanner(System.in)) {
                int num = sc.nextInt();
                int i,d,sum = 0;
                for(i=0; i <= num;i++)
                {
                    d = num % 10;
                    sum = sum + d;
                    num = num / 10;
                }
                System.out.println("The sum is "+sum);
                System.out.println("Do you want to try again:");
                System.out.println("Press 1-Yes");
                choice = sc.nextInt();
            }
        }while(choice == 1);
}
}