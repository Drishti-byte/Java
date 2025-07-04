/*program to calculate displacement*/
import java.util.*;
public class lab33 {
    public static void main(String[] args) {
        int a,u,t,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acceleration(m/s^2): ");
        a = sc.nextInt();
        System.out.println("Enter initial velocity(m/s): ");
        u = sc.nextInt();
        System.out.println("Enter time(mins): ");
        t = sc.nextInt();
        s = u * t + 1/2 * a * t * t;
        System.out.println("Displacement(m): "+s);
    }
}