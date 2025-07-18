/*program to print even and odd numbers using threads*/
class Even extends Thread 
{
    public void run() 
    {
        for(int i = 2;i <= 20;i += 2)
        {
            System.out.println("For thread even: i"+i);
        }
        System.out.println("Exit from even");
    }
}
class Odd extends Thread 
{
    public void run() 
    {
        for(int j = 1;j <= 20;j += 2)
        {
            System.out.println("For thread odd: j"+j);
        }
        System.out.println("Exit from odd");
    }
}
public class lab47 {
    public static void main(String[] args) {
        Even e = new Even();
        e.start();
        Odd o = new Odd();
        o.start();
    }
}