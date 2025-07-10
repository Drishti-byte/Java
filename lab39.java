/*program to convert binary number to decimal*/
import java.util.*;
public class lab39 {
    static int btod(int n)
    {
        int dec = 0;
        int base = 1;
        int temp = n;
        while(temp > 0)
        {
            int ld = temp % 10;
            temp = temp / 10;
            dec += ld * base;
            base = base * 2;
        }
        return dec;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        num = sc.nextInt();
        System.out.println("Decimal number: "+btod(num));
    }
}