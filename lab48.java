/*program to count the number of objects created in a program*/
public class lab48 {
    static int count = 0;
    lab48()
    {
        count++;
    }
    public static void main(String[] args) {
        lab48 ob1 = new lab48();
        lab48 ob2 = new lab48();
        lab48 ob3 = new lab48();
        lab48 ob4 = new lab48();
        System.out.println("Number of objects: "+count);
    }
}