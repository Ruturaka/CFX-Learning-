package codewithrutu;
import java.util.Scanner;

class InvalidInputException extends Exception
{
    public String toString()
    {
        return "The opertor u entered isn't valid.";
    }
}
class MaxInputException extends Exception
{
    public String toString()
    {
        return "Any input cannot be greater than 100000";
    }
}
class MaxMultiplierException extends Exception
{
    public String toString()
    {
        return "Any input cannot be greater than 7000";
    }

}

class Calc
{
     int add(int a,int b)
    {
        if(a>=100000 ||b>=100000)
        {
            try
            {
                throw new MaxInputException();
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.exit(1);
            }
        }
        return a+b;
    }
    public int sub(int a,int b)
    {

        if(a>=100000 ||b>=100000)
        {
            try
            {
                throw new MaxInputException();
            }
            catch(Exception e)
            {
                System.out.println("Max input exception: "+e);
                System.exit(1);
            }
        }return a-b;
    }
    public int mul(int a,int b)
    {
        if(a>=7000 || b>=7000)
        {
            try
            {
                throw new MaxMultiplierException();
            }
            catch (Exception e)
            {
                System.out.println("Max multiplier exception: "+e);
                System.exit(1);
            }
        }
        return a*b;
    }
    public int div(int a,int b) throws ArithmeticException
    {
        if(b==0) {
            try{
                throw new ArithmeticException();
            }
            catch (Exception e) {
                System.out.println("Arithmetic Exception: "+e);
                System.exit(1);
            }
        }
        return a/b;
    }
}
public class CustomCalc
{
    public static void main(String[] args)
    {
        System.out.println("This is a Custom Calculator -");
        System.out.println("What u wanna do: Add, sub, mul or div?");
        System.out.println("Enter + for addition\n - for subtraction\n * for mul\n / for div");

        while(true)
        {
            Scanner sc=new Scanner(System.in);
            int op=sc.next().charAt(0);
            if(op!='+' && op!='-' && op!='*' && op!='/')
            {
                try{
                    throw new InvalidInputException();
                }
                catch(Exception e)
                {
                    System.out.println("Invalid input exception "+e);
                    System.out.println("Please enter valid operator: ");
                    continue;
                }
            }
            System.out.println("Enter 2 no.s");
            int num1=sc.nextInt();
            int num2=sc.nextInt();

            Calc c=new Calc();
            switch(op)
            {
                case '+':
                    System.out.println("Addition: "+c.add(num1,num2));
                    break;

                case '-':
                    System.out.println("Subtraction: "+c.sub(num1,num2));
                    break;

                case '*':
                    System.out.println("Multiplication: "+c.mul(num1,num2));
                    break;
                case '/':
                    System.out.println("Division: "+c.div(num1,num2));
                    break;

            }
        }

    }

}
