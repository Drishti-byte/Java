/*program to use keyword abstract*/
abstract class Base 
{
    abstract void show();
}
class Derv1 extends Base 
{
    public void show()
    {
        System.out.println("Derived Class One");
    }
}
class Derv2 extends Base 
{
    public void show()
    {
        System.out.println("Derived Class Two");
    }
}
public class class8 {
    public static void main(String args[])
    {
        Base b,c;
        b = new Derv1();
        b.show();
        c = new Derv2();
        c.show();
    }
}