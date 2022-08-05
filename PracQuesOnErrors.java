package codewithrutu;
import java.util.Scanner;
 class MyException
 {
     @Override
     public String toString()
     {
        return "Value greater than 5";
     }
 }
public class PracQuesOnErrors  {

    public static void main(String[] args)
    {
        //1. Write a code to demonstrate syntax,logical and runtime errors
        //2. Write a code that prints "hahaha: during Arithmetic exception
        //and "hehehe" during an Illegal argument exception.
        //1.When Arguments out of range. For example, the percentag should lie
        //between 1 to 100. If the user entered 101 then an
        // IllegalArugmentExcpetion will be thrown.
        //2. When argument format is invalid. For example, if our method requires
        // date format like YYYY/MM/DD but if the user is passing YYYY-MM-DD.
        // Then our method can’t understand then IllegalArugmentExcpetion will
        // be thrown.
        //3.When a method needs non-empty string as a parameter but the null
        // string is passed.
        int a=-7;
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Hahaha");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Hehehe");
        }
    }
}
