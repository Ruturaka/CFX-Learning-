package codewithrutu;
import java.util.Scanner;

/**
 * This class throws a user-defined exception if the user enters invalid operator.
 */
class InvalidInputException extends Exception
{
    public String toString()
    {
        return "The opertor u entered isn't valid.";
    }
}
/**
 * This class throws a user-defined exception if the user enters any input greater than
 * specified limit.
 */
class MaxInputException extends Exception
{
    public String toString()
    {
        return "Any input cannot be greater than 100000";
    }
}
/**
 * This class throws a user-defined exception if the user enters MaxMultiplierException above
 * the specified limit.
 */
class MaxMultiplierException extends Exception
{
    public String toString()
    {
        return "Any input cannot be greater than 7000";
    }

}

/**
 * This Calc class is used to do  add, sub, mul or div of any 2 numbers.
 * This also does - <i>itallic</i> <p>Exception handling both built-in & user-defined exceptions. </p>
 * @author Rutu (codewithrutu)
 * @version 0.2
 * @since 2022
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Exception.html" target="_blank"> Java Docs Exception class</a>
 */
class Calc
{
    /**
     *
      * @param a
     * @param b
     * @return Addition of 2 numbers as an int
     */
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

    /**
     *
     * @param a
     * @param b
     * @return Subtraction of 2 numbers as an int
     */
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

    /**
     *
     * @param a
     * @param b
     * @return Multiplication of 2 numbers as an int
     */
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

    /**
     *
     * @param a
     * @param b
     * @return Division of 2 numbers as an int
     * @throws  ArithmeticException if b is 0
     */
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

/**
 * This is our class in which the main method is written.
 */
public class CustomCalc
{
    /**
     *
     * @param args These are arguments supplied to the command line
     */
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
