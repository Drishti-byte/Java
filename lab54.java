/*program to demonstrate sleep method of threads*/
import java.lang.*;
public class lab54 implements Runnable{
    Thread t;
    public void run()
    {
        for(int i = 0;i < 4;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
            try 
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new lab54());
        t.start();
        Thread t2 = new Thread(new lab54());
        t2.start();
    }
}