/*program to implement three threads*/
class ThreadOne extends Thread 
{
    public void run()
    {
        for(int i = 1;i <= 5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : "+i);
        }
    }
}
class ThreadTwo extends Thread
{
    public void run()
    {
        for(int i = 6;i <= 10;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : "+i);
        }
    }
}
class ThreadThree extends Thread
{
    public void run()
    {
        for(int i = 11;i <= 15;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : "+i);
        }
    }
}
public class lab60 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.setName("Thread-1");
        t1.setPriority(3);
        Thread t2 = new Thread();
        t2.setName("Thread-2");
        t2.setPriority(6);
        Thread t3 = new Thread();
        t3.setName("Thread-3");
        t3.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
    }
}