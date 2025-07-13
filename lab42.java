/*program to illustrate static member data and static member function*/
class Static 
{
    static int a = 3;
    int b = 10,c = 1;
    static void show()
    {
        System.out.println("a: "+a);
    }
    void show1()
    {
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
public class lab42 {
    public static void main(String[] args) {
        Static ob1 = new Static();
        Static ob2 = new Static();
        ob1.show();
        ob2.show1();
    }
}