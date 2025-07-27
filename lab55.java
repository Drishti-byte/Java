/*program to demonstrate join method of threads*/
import java.lang.*;
public class lab55 implements Runnable{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "+t.getName());
        System.out.println("Is Alive: "+t.isAlive());
    }
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new lab55());
        t.start();
        t.join(1000);
        System.out.println("Joining after 1000" +" milliseconds: ");
        System.out.println("Current thread: "+t.getName());
        System.out.println("Is Alive: "+t.isAlive());
    }
}