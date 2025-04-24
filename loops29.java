/*program to print prime numbers in a range*/
import java.util.*;
public class loops32{
    public static void main(String args[]){
        System.out.println("Enter a starting number:");
        try (Scanner sc = new Scanner(System.in)) {
            int a,num,st,end;
            st = sc.nextInt();
            System.out.println("Enter an ending number:");
            end = sc.nextInt();
            boolean isPrime = true;
            System.out.println("All prime in the range "+st+" and "+end+" are:");
            for(num = st; num <= end;num++)
            {
                isPrime = true;
                for(a=2;a < num; a++)
                {
                    if(num % a == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime == true)
                {
                    System.out.println(num);
                }
            }
        }
    }
}