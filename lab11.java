/*program to calculate sum of first 15 natural numbers*/
public class lab11 {
    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 2;i < 15;i+=2)
        {
            sum += i;
        }
        System.out.println("The sum of first 15 even numbers: "+sum);
        sum = 0;
        for(int i = 2;i < 15;i+=2)
        {
            sum = sum + (i * i);
        }
        System.out.println("The sum of squares of first 15 even numbers: "+sum);
    }
}