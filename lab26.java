/*program to implement run time polymorphism*/
class A 
{
    void show()
    {
        System.out.println("A's show method");
    }
}
class B extends A 
{
    void show()
    {
        System.out.println("B's show method");
    }
}
class C extends B 
{
    void show()
    {
        System.out.println("C's show method");
    }
}
public class lab26 {
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.show();
        r = b;
        r.show();
        r = c;
        r.show();
    }
}