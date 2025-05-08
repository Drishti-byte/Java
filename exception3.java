/*program to create user defined exception*/
import java.util.*;
class InvalidAgeException extends Exception 
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class exception3 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();
        try 
        {
            vote(age);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void vote(int age) throws InvalidAgeException 
    {
        if(age < 18)
        {
            throw new InvalidAgeException("Not eligible for voting");
        }
        else 
        {
            System.out.println("Eligible for voting");
        }
    }
}