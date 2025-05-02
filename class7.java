/*Create a program on dynamic binding or dynamic memory dispatch*/
class Base
{
    public void show()
    {
        System.out.println("Base Class");
    }
}
class Derv1 extends Base 
{
    public void show()
    {
        System.out.println("Derived Class 1");
    }
}
class Derv2 extends Base 
{
    public void show()
    {
        System.out.println("Derived class 2");
    }
}
public class class7 {
    public static void main(String args[])
    {
        Base a,b,c;
        a = new Base();
        a.show();
        b = new Derv1();
        b.show();
        c = new Derv2();
        c.show();
    }
}