/*program to implement throw*/
import java.util.*;
class Throw 
{
    int age = 8;
    void demo()
    {
        try 
        {
            if(age < 10)
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid age");
        }
    }
}
public class lab30 {
    public static void main(String[] args) {
        Throw ob = new Throw();
        ob.demo();
    }
}