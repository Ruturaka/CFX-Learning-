import java.util.Scanner;

public class Fibbo {

    public static int fibbo(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args)
    {
        //Code to print n-th Fibonacci Number.
        /*int n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The "+n+"th Fibonacci number is: "+fibbo(n));*/

        //Code to print fibonacci series uptil nth number
        int n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int f=1;
        while(f<=n)
        {
            System.out.print(fibbo(f)+" ");
            f++;
        }
    }
}
