package codewithrutu.thread;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    MyThread2(String name)
    {
        super(name);
    }
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class MultiThreading
{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2("Rutu");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());

        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());


    }
}