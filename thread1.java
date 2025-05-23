/*program to create a thread that implements Runnable interface*/
class MyThread implements Runnable 
{
    public void run()
    {
        System.out.println("This thread is running...");
    }
}
public class thread1 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}