package folder.folder1.folder2;
class c1 extends Problem1
{
    void problem2()
    {
        System.out.println(proInt);
        //System.out.println(defInt );
    }
}
public class Problem2   {

   //Use a built-in package in Java to write a class which displays
    //a message (by using sout) after taking input from the user.
    public static void main(String[] args)
    {
        System.out.println("I am main method of Problem2!");
        c1 c=new c1();
    }
}
