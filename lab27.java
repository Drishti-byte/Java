/*program to implement multiple inheritances using interfaces*/
interface adder 
{
    void add();
    void subtract();
}
interface multiplier 
{
    void multiply();
    void divide();
}
class Calculate implements adder,multiplier 
{
    int a,b;
    Calculate(int x,int y)
    {
        a = x;
        b = y;
    }
    public void add()
    {
        System.out.println("Sum: "+(a+b));
    }
    public void subtract()
    {
        System.out.println("Difference: "+(a-b));
    }
    public void multiply()
    {
        System.out.println("Product: "+(a*b));
    }
    public void divide()
    {
        System.out.println("Quotient: "+(a/b));
    }
}
public class lab27 {
    public static void main(String args[])
    {
        Calculate c = new Calculate(13,18);
        c.add();
        c.subtract();
        c.multiply();
        c.divide();
    }
}