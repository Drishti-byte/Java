/*program to make calculator using classes*/
class add 
{
    void show()
    {
        int a = 10,b = 13;
        System.out.println("Sum: "+(a+b));
    }
}
class sub
{
    void show()
    {
        int a = 23,b = 12;
        System.out.println("Difference: "+(a-b));
    }
}
class mul
{
    void show()
    {
        int a = 24,b = 18;
        System.out.println("Product: "+(a*b));
    }
}
class divide
{
    void show()
    {
        int a = 25,b = 5;
        System.out.println("Quotient: "+(a/b));
    }
}
class mod 
{
    void show()
    {
        int a = 45,b = 3;
        System.out.println("Remainder: "+(a%b));
    }
}
public class lab43 {
    public static void main(String[] args) {
        add ad = new add();
        ad.show();
        sub s = new sub();
        s.show();
        mul m = new mul();
        m.show();       
        divide d = new divide();
        d.show();
        mod mo = new mod();
        mo.show();
    }
}