/*program to perform operations of string class*/
public class strings3 {
    public static void main(String args[])
    {
        String a = new String("Computer Science");
        System.out.println(a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('e','?'));
        System.out.println(a.indexOf("ut"));
        System.out.println(a.substring(3,6));
        System.out.println(a);
    }
}