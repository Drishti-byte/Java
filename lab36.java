/*program to print pattern*/
public class lab36 {
    public static void main(String[] args) {
        int i,j;
        for(i = 5;i >= 1;i--)
        {
            for(j = 1;j <= i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}