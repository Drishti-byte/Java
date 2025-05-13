/*program to count the number of vowels in a file*/
import java.io.*;
public class file2 {
    public static void main(String[] args) {
        try 
        {
            FileInputStream f = new FileInputStream("story.txt");
            char ch;
            int v = 0;
            do 
            {
                int n = f.read();
                if(n == -1)
                break;
                ch = (char)n;
                System.out.print(ch);
                if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u')
                {
                    v++;
                }
            }while(true);
            System.out.println("\nNo. of vowels is "+v);
            f.close();
        }
        catch(FileNotFoundException f)
        {
            System.out.println("Cannot create file");
        }
        catch(IOException e)
        {
            System.out.println("Cannot read file");
        }
    }
}