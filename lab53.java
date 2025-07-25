/*program to demonstrate equals(),length() and other in string class*/
public class lab53 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello, World";
        String s3 = "Hello World";
        System.out.println("s1 equals s2: "+s1.equals(s2));
        System.out.println("s1 equals s3: "+s1.equals(s3));
        System.out.println("s1.trim(): "+s1.trim());
        System.out.println("Length of s1: "+s1.length());
        System.out.println("Substring of s1 (from index 7): "+s1.substring(7));
        System.out.println("s1 compareTo s2: "+s1.compareTo(s2));
        System.out.println("s1 compareTo s3: "+s1.compareTo(s3));
    }
}