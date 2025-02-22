/*program to print the number of vowels*/
import java.util.*;
public class strings1 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String s = sc.nextLine();
            int n, v = 0;
            n = s.length();
            s = s.toLowerCase();
            for(int i = 0;i < n;i++)
            {
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                v++;
            }
            System.out.println("NUmber of vowels in string are "+v);
            System.out.println("Number of characters in string are "+n);
        }
    }
}