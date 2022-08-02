package codewithrutu;

class GoodMorning extends Thread
{
    public void run()
    {
        /*while(true) {
            System.out.println("Good morning!!");
        }*/
    }
}
class Welcome extends Thread
{
    public void run()
    {
        while(true){
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome!!");
        }

    }
}
public class PracQueOnThread {
    public static void main(String[] args)
    {
        //1. Write a code to print "Good morning" & "welcome" continuously
        //on the screen in java using threads
        /*GoodMorning t1=new GoodMorning();
        Welcome t2=new Welcome();
        t1.start();
        t2.start(); */

        //2. Add a sleep method in welcome thread of question 1 to delay
        //the execution for 200ms.

       /* GoodMorning t1=new GoodMorning();
        Welcome t2=new Welcome();
        t1.start();
        t2.start();*/

        //3. Demonstrate getPriority & setPriority methods in Java Threads
        /*GoodMorning t1=new GoodMorning();
        Welcome t2=new Welcome();
        t1.setPriority(4);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        t1.start();
        //t2.start();*/

        //4. How do you get state of a given thread in Java
       /* System.out.println(t1.getState());*/


        //5. How do u get reference to the current variable in Java
        GoodMorning t1=new GoodMorning();
        System.out.println("Current Thread is: "+Thread.currentThread());
        System.out.println("State of current Thread "+Thread.currentThread().getState());
        System.out.println("Id of current Thread "+Thread.currentThread().getId());
        System.out.println("Priority of current Thread "+Thread.currentThread().getPriority());



    }
}
