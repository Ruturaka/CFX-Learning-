package codewithrutu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {
    public static void main(String[] args)
    {
        File myFile = new File("Ru_file2.txt");
        try {
            FileWriter fileWriter = new FileWriter("Ru_file2.txt");
            fileWriter.write("CodeWithRutu is one step solution for" +
                    " your all programming problems.\nKeep learning &" +
                    " Keep coding!!");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
