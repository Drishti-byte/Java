/*program to write into the file*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class file {
    public static void main(String[] args) {
        try 
        {
            FileOutputStream f = new FileOutputStream("story.txt");
            String a = "Java Programming";
            for(int i = 0;i < a.length();i++)
            {
                f.write(a.charAt(i));
            }
            f.close();
        }
        catch(FileNotFoundException f)
        {
            System.out.println("Cannot create file");
        }
        catch(IOException e)
        {
            System.out.println("Unable to write");
        }
    }
}