import java.util.Scanner;

public class MaxIndex
{
    public static void main(String[] args)
    {
        //3. Write a code that allows to keep accessing an array until a
        //valid index is given. If max retieves excceds 5 print "Error".

        int arr[]=new int[3];
        boolean flag=true;
        int max=0;
        int ind;
        Scanner sc=new Scanner(System.in);
        while(flag && max<5)
        {

            try{
                System.out.println("Enter value of index");
                ind=sc.nextInt();
                System.out.println(arr[ind]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
                max++;
            }
        }
        if(max>=5)
            System.out.println("Error");

    }
}
