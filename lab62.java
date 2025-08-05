/*program to implement inheritance*/
import java.util.*;
class Vehicle 
{
    protected int vid;
    protected String vname;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter vehicle id:");
        vid = sc.nextInt();
        System.out.println("Enter vehicle name:");
        sc.nextLine();
        vname = sc.nextLine();
    }
    void display()
    {
        System.out.println("Vehicle id: "+vid);
        System.out.println("Vehicle name: "+vname);
    }
}
class LightMotor extends Vehicle 
{
    protected int lmid;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter light motor id:");
        lmid = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Light motor id: "+lmid);
    }
}
class HeavyMotor extends Vehicle 
{
    protected int hmid;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter heavy motor id:");
        hmid = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Heavy motor id: "+hmid);
    }
}
class GearMotor extends LightMotor
{
    protected int gmid;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter gear id:");
        gmid = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Gear motor id: "+gmid);
    }
}
class NonGearMotor extends LightMotor
{
    protected int mid;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter non gear motor id:");
        mid = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("No gear motor id: "+mid);
    }
}
class Passenger extends HeavyMotor
{
    protected int pid;
    protected String pname;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter passenger id:");
        pid = sc.nextInt();
        System.out.println("Enter passenger name:");
        sc.nextLine();
        pname = sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Pid: "+pid);
        System.out.println("Passenger name: "+pname);
    }
}
class Goods extends HeavyMotor 
{
    protected int gid;
    protected String gname;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter goods id:");
        gid = sc.nextInt();
        System.out.println("Enter name of goods:");
        sc.nextLine();
        gname = sc.nextLine();
    }
    void display()
    {
        System.out.println("Goods id: "+gid);
        System.out.println("Goods Name: "+gname);
    }
}
public class lab62 {
    public static void main(String[] args) {
        GearMotor gm = new GearMotor();
        gm.input();
        gm.display();
        NonGearMotor ngm = new NonGearMotor();
        ngm.input();
        ngm.display();
        Passenger p = new Passenger();
        p.input();
        p.display();
        Goods g = new Goods();
        g.input();
        g.display();
    }
}