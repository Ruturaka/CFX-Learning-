import java.util.Scanner;
public class Recursion {
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    public static int factIter(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("You want factorial of which number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=0)
        {
            System.out.println("Factorial by Recursion is: "+fact(n));
            System.out.println("Factorial by Iterative or using loop is: "+factIter(n));
        }
        else
            System.out.println("Negative number is not allowed.Please enter a positive number. ");


    }

}
