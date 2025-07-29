/*program to create a class box*/
class Box 
{
    double width;
    double height;
    double depth;
    Box()
    {
        width = height = depth = 1;
    }
    Box(double len)
    {
        width = height = depth = len;
    }
    Box(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    void volume()
    {
        System.out.println("Volume is "+(width*height*depth));
    }
}
public class lab57 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        mybox1.volume();
        Box mybox2 = new Box();
        mybox2.volume();
        Box mybox3 = new Box(7);
        mybox3.volume();
    }
}