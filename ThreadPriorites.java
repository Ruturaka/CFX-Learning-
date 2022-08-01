package codewithrutu.thread;

class MyTh1 extends Thread{
    public MyTh1(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        while (true)
            System.out.println("Thankyou "+this.getName());
    }
}


public class ThreadPriorites
{
    public static void main(String[] args)
    {
        MyTh1 t1=new MyTh1("Ru1");
        MyTh1 t2=new MyTh1("Ru2");
        MyTh1 t3=new MyTh1("Ru3");
        MyTh1 t4=new MyTh1("Ru4");
        MyTh1 t5=new MyTh1("Ru5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();




    }
}
