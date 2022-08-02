package codewithrutu;

class MyThr1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thank youu!!");
            try
            {
                Thread.sleep(455);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThr2 extends Thread{

    @Override
    public void run(){
        while(true){
            System.out.println("Thread 2 for Chatting with her");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args)
    {
        MyThr1 t1=new MyThr1();
        MyThr2 t2=new MyThr2();
        t1.start();
       /* try
        {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }*/

        t2.start();
    }
}
