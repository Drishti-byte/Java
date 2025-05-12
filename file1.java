/*program to read from a file*/
import java.io.*;
public class file1 {
    public static void main(String[] args) {
        try 
        {
            FileInputStream f = new FileInputStream("story.txt");
            char ch;
            do 
            {
                int n = f.read();
                if(n == -1)
                break;
                ch = (char)n;
                System.out.print(ch);
            }while(true);
            f.close();
        }
        catch(FileNotFoundException f)
        {
            System.out.println("Cannot create file");
        }
        catch(IOException e)
        {
            System.out.println("Unable to read");
        }
    }
}