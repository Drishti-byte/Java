/*program to copy the content of one file to another file*/
import java.io.*;
public class file3 {
    public static void main(String[] args) {
        try 
        {
            FileInputStream f = new FileInputStream("story.txt");
            FileOutputStream o = new FileOutputStream("story1.txt");
            char ch;
            do 
            {
                int n = f.read();
                ch = (char)n;
                if(n == -1)
                break;
                o.write(n);
            }while(true);
            f.close();
            o.close();
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