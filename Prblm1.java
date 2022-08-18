package codewithrutu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prblm1 {
    public static void main(String[] args)
    {
        // Code to generate multiplication table of a given no. & write
        // it to a file.
        System.out.println("Enter a no. ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        try{
            FileWriter fileWriter = new FileWriter("Mulfile.txt");
            fileWriter.write("Multipliction table of -"+num+": ");
            for(int i=1;i<=10;i++)
            {
                fileWriter.write("\n"+num+"x"+i+"="+num*i+"\n");
            }
            fileWriter.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
