/*program to implement function overloading*/
public class lab45 {
    static void swap(int num1,int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping: "+num1+" "+num2);
    }
    static void swap(double x,double y)
    {
        double temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Numbers after swapping: "+x+" "+y);
    }
    static void swap(char c,char d)
    {
        char temp;
        temp = c;
        c = d;
        d = temp;
        System.out.println("Characters after swapping: "+c+" "+d);
    }
    public static void main(String[] args) {
        int m = 31,n = 13;
        System.out.println("Numbers before swapping: "+m+" "+n);
        swap(m,n);
        double a = 3.14,b = 4.13;
        System.out.println("Numbers before swapping: "+a+" "+b);
        swap(a,b);
        char z = 'a',i = 'b';
        System.out.println("Characters before swapping: "+z+" "+i);
        swap(z,i);
    }
}