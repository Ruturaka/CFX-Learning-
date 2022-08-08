package codewithrutu;
import java.util.Scanner;

/*class InvalidInputException extends Exception
{
    public String toString()
    {
        return "Invalid input exception";
    }
}*/
class MaxMultiplierException extends Exception
{
    @Override
    public String toString()
    {
        return "Max multiplier reached exception -  Any i/p cannot be greater than 7000";
    }
}
class MaxInputException extends Exception
{
    //Max input exception - if any of the i/p is greater than 100000.
    @Override
    public String toString()
    {
        return "Any i/p cannot be grater than 100000";
    }
}
public class Calculator {
    public static int add(int num1,int num2)
    {
        return num1+num2;
    }
    public static int sub(int num1,int num2)
    {
        return num1-num2;
    }
    public static int mul(int num1,int num2) throws MaxMultiplierException
    {
        if(num1>=7000 || num2>=7000)
        {
            throw new MaxMultiplierException();
        }
        return num1*num2;
    }
    public static int div(int num1,int num2)
    {
        return num1/num2;
    }

    public static void main(String[] args)
    {
        // You have to create a custom calculator with following operations:
        //Add, Sub, Mul and Div
        //which throws the foll exceptions:
        //1. Invalid input exception ex - 8 & 9
        //2. Cannot divide by zero exception
        //3. Max input exception - if any of the i/p is greater
        //than 100000.
        //4. Max multiplier reached exception - don't allow any
        //multiplication i/p to be greater than 7000

        int num1,num2;
        System.out.println("Enter 2 number's:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("You entered: "+num1+num2);
        /*
        if(num1>=100000 || num2>=100000)
        {
            try0
            {
                throw new MaxInputException();
            }
            catch (Exception e)
            {
                System.out.println("Exception: "+e);
            }
            System.exit(1);

        }


        System.out.println("Addition : "+add(num1,num2));
        System.out.println("Subtraction : "+sub(num1,num2));
        try
        {
            System.out.println("Division: "+div(num1,num2));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: "+e);
        }

        try
        {
            System.out.println("Multiplication: "+mul(num1,num2));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
    }
}
