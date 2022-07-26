import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1. code to print first n odd no.s using for loop
        /*int i;
        for(i=n;i>0;i--)
        {
                System.out.println(i);
        }*/

        //2. code to print number from 1 to 10 and but not 6. It is specified that
        //you have to do this using loop and only one loop is allowed to use.

        /*for(int i=1;i<=10;i++)
        {
            if(i!=6)
                System.out.println(i);
            else
                continue;
        }*/

        //3. Code to print the sum of first n even numbers using while loop
        /*int i=0,sum=0;
        while(i<=n)
        {
            if((i&1)==0) {
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);*/

        //4. code to print multiplication table of a given number n
        /*for (int i = 1; i <= 10; i++)
            System.out.println(n+"*"+i+"="+n*i);*/

        //5. code to print multiplication of 10 in reverse order

        /*for(int i=n;i>0;i--)
            System.out.println(n+"*"+i+"="+n*i);*/

        //6. code to find factorial of a given number using for loop
        /*int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println("factorial of "+n+" is: "+fact);*/

        //7. code to calculate the sum  of the numbers occuring in
        //the multiplication table of 8

        /*int i=1,sum=0;
        while(i<=10)
        {
            sum+=n*i;
            i++;
        }
        System.out.println("sum="+sum);*/





    }
}
