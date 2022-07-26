import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Functions {

    //1. function to print multiplication table of a no. n using recursion
    /*public static int Mul(int n,int i)
    {
        if(i==1)
            return n;
        return n+Mul(n,i-1);
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+"x"+i+"="+Mul(n,i));
    }*/

    /*2. Code to print pattern using Function
         *
         * *
         * * *
         * * * *
         * * * * *

    public static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern1(n);
    }*/

    //3. Write a recursive function to calculate sum of first n natural numbers

    /*public static int sum(int n)
    {
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is: "+sum(n));

    }*/
    //4. Code to print pattern using Function
    /*
     * * * *
     * * *
     * *
     *
     */
    /*
    public static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern2(n);
    }*/

    //5. Function to find avg of a set of no.s passes as arguments
    /*public static float avg(int ...arr)
    {
        float sum=0f;
        /*for(int a=0;a<arr.length;a++)
        {
            sum+=arr[a];
        }*/
        /*for(int a:arr) //enhanced for loop
            sum+=a;
        sum=(float)sum/arr.length;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(avg(2,4,5,8,6,5,6));
    }*/


    //6. Repeat 2 pattern1 using recurssion

    /*public static void pattern1(int n)
    {
        if(n>0)
        {
            pattern1(n-1);
            for(int i=0;i<n;i++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern1(n);
    }*/

    //7. Repeat 4 pattern2 using recurssion

   /*public static void pattern2(int n)
    {
        if(n>0)
        {
            for(int i=0;i<n;i++)
                System.out.print("* ");
            System.out.println();
            pattern2(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern2(n);
    }*/

    //8. Function to convert Celsius to temp into fahrenheit
    /*public static float cToF(float temp)
    {
        float f=temp*1.8f+32;
        return f;
    }
    public static void main(String[] args)
    {
        float t;
        System.out.println("Enter temperature: ");
        Scanner sc = new Scanner(System.in);
        t = sc.nextFloat();
        System.out.printf("Temp in Fahrenheit is: %.1f",cToF(t));
    }*/

    //9. Repeat 3 using iterative approach i.e. sum of first n natural numbers
        public static int sum(int n)
        {
            int sum=0;
            for(int i=n;i>0;i--)
            {
               sum+=i;
            }
            return sum;
        }
        public static void main(String[] args)
       {
        int n;
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("Sum of first "+n+" natural numbers is: "+sum(n));

        }
}
