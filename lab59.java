/*program to create a user defined exception*/
import java.util.*;
class NoMatchException extends Exception 
{
    public NoMatchException(String msg)
    {
        super(msg);
    }
}
public class lab59 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if(num != 10)
            {
                throw new NoMatchException("The number entered does not match 10");
            }
            System.out.println("The number entered is 10");
        }
        catch(NoMatchException e)
        {
            System.out.println(e.getMessage());
        }
    }
}