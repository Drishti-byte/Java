/*program to check whether you are an adult or not*/
import java.util.*;
public class condition 
{
   public static void main(String args[])
   {
      try (Scanner sc = new Scanner(System.in)) 
      {
         System.out.println("Enter the age:");  
         int age = sc.nextInt();
         if(age >= 18)
         {
            System.out.println("You are an adult");
         }
         else 
         {
            System.out.println("You are not an adult");
         }
      }
   }
}