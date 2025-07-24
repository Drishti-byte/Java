/*program to implement method overloading*/
public class lab52 {
    public int sum(int x,int y)
    {
        return x + y;
    }
    public int sum(int a,int b,int c)
    {
        return a + b + c;
    }
    public double sum(double x,double y)
    {
        return x + y;
    }
    public static void main(String[] args) {
        lab52 l = new lab52();
        System.out.println(l.sum(10,20));
        System.out.println(l.sum(14,12,19));
        System.out.println(l.sum(13.4,12.9));
    }
}