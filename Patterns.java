import java.util.Scanner;

public class Patterns {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
