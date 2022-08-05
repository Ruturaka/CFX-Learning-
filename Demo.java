package codewithrutu;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        //String[] strAr3= new String[3];
        String b[]=new String[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 5 books: ");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextLine();
        }
        System.out.println("You entered: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
    }

}
