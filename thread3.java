/*program to print numbers in three threads*/
class A extends Thread 
{
    public void run()
    {
        for(int i = 1;i <= 5;i++)
        {
            System.out.println("From thread A: i = "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread 
{
    public void run()
    {
        for(int j = 6;j <= 10;j++)
        {
            System.out.println("From thread B: j = "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread 
{
    public void run()
    {
        for(int k = 11;k <= 15;k++)
        {
            System.out.println("From thread C: k = "+k);
        }
        System.out.println("Exit from C");
    }
}
public class thread3 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
        C c = new C();
        c.start();
    }
}