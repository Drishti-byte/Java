/*program to create three threads*/
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
        for(int j = 1;j <= 5;j++)
        {
            System.out.println("From Thread B: j = "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread 
{
    public void run()
    {
        for(int k = 1;k <= 5;k++)
        {
            System.out.println("From thread C: k = "+k);
        }
        System.out.println("Exit from c");
    }
}
public class thread2 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
        C c = new C();
        c.start();
    }
}