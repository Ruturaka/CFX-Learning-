package codewithrutu;

@FunctionalInterface
interface LambdaExp{
    //void meth1(int a,int b);
    void meth2(int a);
}
public class LambdaExpDemo {
    public static void main(String[] args)
    {
       /* LambdaExp obj=(a, b) -> {
            System.out.println("Here we write definition of meth1 class: ");
            System.out.println("The value of a & b is "+a+", "+b);
        };
        obj.meth1(17,5);*/
        LambdaExp obj=(a)->{
            System.out.println("I am method 2 from this lambda " + a);
        };
        obj.meth2(6);
    }
}
