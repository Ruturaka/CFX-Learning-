package folder.folder1.folder12;


class Calculator{

    
    public void calculate(int a,int b)
    {
        System.out.println("Your result is: "+a+b);
    }

}
class ScCalcultor{ 

    public void calculate(int a,int b)
    {
        System.out.println("Your result is: "+Math.sin(a+b));
    }
}
class HybridCalculator
{
    public void calculate(int a,int b)
    {
        System.out.println("Your result is: "+Math.sin(a+b));
        System.out.println("Yor result is: "+ a+b);
    }
}
public class Problem1
{
    // Create 3 classes Calculator. ScCalculator and
    // HybridCalculator & grp them into a package.
    protected int proInt=4;
    int defint=41;
    public static void main(String[] args)
    {
        System.out.println("I'm main method!");
    }
} 
