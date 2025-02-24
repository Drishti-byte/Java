/*program to perform stringbuffer class*/
public class strings2 {
    public static void main(String args[])
    {
        StringBuffer a = new StringBuffer("Java Object");
        System.out.println(a);
        System.out.println("Number of characters "+a.length());
        System.out.println("First character is "+a.charAt(0));
        a.append(" Oriented Language");
        System.out.println(a);
        a.insert(5,"is an ");
        System.out.println(a);
        System.out.println("Object word found at position "+a.indexOf("Object"));
        //a.delete(11,18);
        //System.out.println(a);
        a.replace(11,18,"Data ");
        System.out.println(a);
    }
}