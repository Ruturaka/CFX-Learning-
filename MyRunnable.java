package codewithrutu;

class t1 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("Thread t1 is running");
    }
}
class t2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("Thread t2 is running");
    }
}
class t3 implements Runnable
{
    @Override
    public void run()
    {
            System.out.println("Thread t3 is running");
    }
}

public class MyRunnable
{
    public static void main(String[] args)
    {
        t1 obj1=new t1();
        Thread t=new Thread(obj1);
        t.start();

        Runnable bullet=new t2();
        Thread gun=new Thread(bullet,"rutu");
        gun.start();


        Runnable r1=new t3();
        Thread th3=new Thread(r1, "Kartik");
        th3.start();
        
        System.out.println("The id of the thread t1 is " + t.getId());
        System.out.println("The id of the thread t2 is " + gun.getId());
        System.out.println("The name of the thread t2 is " + gun.getName());
        System.out.println("The id of the thread t3 is: "+th3.getId());
        System.out.println("The name of thread t3 is: "+th3.getName());




    }
}
