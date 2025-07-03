/*program to display floating and integral part of a number*/
public class lab32 {
    public static void main(String[] args) {
        double num = 39.5;
        System.out.println("Floating part: "+num);
        num = (int)num;
        System.out.println("Integral part: "+num);
    }
}