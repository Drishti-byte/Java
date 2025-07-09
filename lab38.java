/*program to check whether a string is palindrome or not*/
public class lab38 {
    public static void main(String[] args) {
        String str = "Malayalam";
        String rev = "";
        for(int i = str.length() - 1;i >= 0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        System.out.println("String is palindrome");
        else 
        System.out.println("String is not palindrome");
    }
}