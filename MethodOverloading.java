public class MethodOverloading
{
    /*static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }*/
    static int sum(int x,int ...arr) //here x is a cumpolsary argument
    {
        //Available as int arr[];
        int res=0;
        for(int i:arr)
          res+=i;
        return res;
    }
    public static void main(String[] args)
    {
        //System.out.println("Sum of nothing is: "+sum());
        System.out.println("Sum of number is: "+sum(8));
        System.out.println("sum of no.s is: "+sum(4,5));
        System.out.println("sum of no.s is: "+sum(4,5,6));
        System.out.println("sum of no.s is: "+sum(4,5,6, 8));

    }
}
