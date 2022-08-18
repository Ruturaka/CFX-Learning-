package codewithrutu;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.IOException;


public class Table2 {
    public static void main(String[] args)
    {
        // Code to generate multiplication table of 2
        int num=2;
        try{
            FileWriter fileWriter = new FileWriter("Mul2.txt");
            fileWriter.write("Multipliction table of - "+num+": ");
            for(int i=1;i<=10;i++)
            {
                fileWriter.write("\n"+num+"x"+i+"="+num*i+"\n");
            }
            fileWriter.write("\n\n");
            fileWriter.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
