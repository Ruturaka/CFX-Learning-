import java.util.Random;
import java.util.Scanner;
import java.lang.*;

// An enum class
enum Rps
{
    Rock,
    Paper,
    Scissor;

}

class RockPaperScissor
{
    Rps rps;

    //constructor
    public RockPaperScissor(Rps rps) {
        this.rps = rps;
    }

    // Prints a line about what is selected using switch

    public int ItIs()
    {
        switch(rps)
        {
            case Rock:
                return 0;

            case Paper:
                return 1;

            case Scissor:
                return 2;
        }
        return -1;
    }

    //Driver Method
    public static void main(String[] args) {
        int i=1,c1=0,c2=0;

        while (i <= 5)
        {
            System.out.println("Round "+i+" starts:");
            System.out.println("Rutu enter Rock, Paper or Scissor: ");
            Scanner sc1=new Scanner(System.in);
            String str1=sc1.next();
            RockPaperScissor r1=new RockPaperScissor(Rps.valueOf(str1));

            int val1=r1.ItIs();
            Random ran=new Random();
            int val2=ran.nextInt(2);

            switch(val2)
            {
                case 0-> System.out.println("Computer chooses: Rock\n");

                case 1-> System.out.println("Computer chooses: Paper\n");

                case 2->System.out.println("Computer chooses: Scissor\n");
            }

            if(val1==0 && val2==1)
            {
                System.out.println("\nComputer is winner");
                c2++;
            }
            else if(val1==0 && val2==2)
            {
                System.out.println("\nRutu is winner");
                c1++;
            }
            else if(val1==1 && val2==0)
            {
                System.out.println("\nRutu is winner");
                c1++;
            }
            else if(val1==1 && val2==2)
            {
                System.out.println("\nComputer is winner");
                c2++;
            }
            else if(val1==2 && val2==0)
            {
                System.out.println("\nComputer is winner");
                c2++;
            }
            else if(val1==2 && val2==1)
            {
                System.out.println("\nRutu is winner");
                c1++;
            }
            else
                System.out.println("\nIt's a tie");
            i++;
        }
        System.out.println("\nRutu's score: "+c1);
        System.out.println("\nComputer's score: "+c2);

        if(c1>c2)
            System.out.println("Rutu is winner");
        else if(c1==c2)
            System.out.println("Its a tie");
        else
            System.out.println("Computer is winner");
    }
}
