import java.util.Scanner;
import java.util.Random;

class GuessTheNumber
{
    private int rand;
    private int user;
    private int noOfguesses=0; // We can initialize class data members in Java & C++

    public GuessTheNumber()
    {
        Random r=new Random();
        rand=r.nextInt(100);

    }
    void takeUserInput()
    {
        System.out.println("Guess the number: ");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
    }
    public boolean isCorrect()
    {
        noOfguesses++;
        if(user==rand)
        {
            System.out.println("Your guess it right, it was "+rand);
            System.out.println("You guessed it right in "+noOfguesses+" attempts");
            return true;
        }
        else if(user<rand)
            System.out.println("It is greater than this");
        else
            System.out.println( "It is less than this");
        return false;
    }

}

public class Game
{
    public static void main(String[] args)
    {
        GuessTheNumber g=new GuessTheNumber();
        g.takeUserInput();

        boolean guess=g.isCorrect();
        while(guess==false)
        {
            g.takeUserInput();
            guess=g.isCorrect();
        }

    }
}
