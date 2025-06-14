/*Create a class student having fields name,id,marks(in 5 subjects)*/
import java.util.*;
class student{
    private int id;
    private String name;
    int marks[] = new int[5];
    private int average;
    int total;
    void accept()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter student id:");
            id = sc.nextInt();
            System.out.println("Enter name:");
            name = sc.nextLine();
            System.out.println("Enter marks:");
            for(int i = 0;i < marks.length;i++)
            {
                marks[i] = sc.nextInt();
            }
            for(int i = 1;i <= marks.length;i++)
            {
                total += marks[i];
            }
            average = total/marks.length;
        }
    }
    void show()
    {
        System.out.println("Student ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Average marks are: "+average);
    }
}
public class lab17 {
    public static void main(String args[])
    {
        student s = new student();
        s.accept();
        s.show();
    }
}