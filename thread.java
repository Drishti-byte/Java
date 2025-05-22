/*program to create a thread by extending thread*/
class MyThread extends Thread 
{
    public void run()
    {
        System.out.println("This thread is running...");
    }
}
public class thread {
    public static void main(String[] args) {
        MyThread thr1 = new MyThread();
        thr1.start();
    }
}