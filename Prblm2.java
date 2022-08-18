package codewithrutu;
import java.io.*;

public class Prblm2 {
    public static void main(String[] args) throws IOException {
        //Code to copy contents of 1 file to another

        // Creating two stream
        // one input and other output
        FileInputStream fis = null;
        FileOutputStream fos = null;

        // Try block to check for exceptions
        try {
            // Initializing both the streams with
            // respective file directory on local machine

            // Custom directory path on local machine
            fis = new FileInputStream(
                    "/Users/confluxsys/Documents/codewithrutu/FileHandlingDemo/Mul6.txt");

            // Custom directory path on local machine
            fos = new FileOutputStream(
                    "/Users/confluxsys/Documents/codewithrutu/FileHandlingDemo/output.txt");

            int c;

            // Condition check
            // Reading the input file till there is input
            // present
            while ((c = fis.read()) != -1) {
                // Writing to output file of the specified
                // directory
                fos.write(c);
            }

            // By now writing to the file has ended, so

            // Display message on the console
            System.out.println("copied the file successfully");
        }

        // Optional finally keyword but is good practice to
        // empty the occupied space is recommended whenever
        // closing files,connections,streams
        finally {
            // Closing the streams
            if (fis != null) {
                // Closing the fileInputStream
                fis.close();
            }
            if (fos != null) {
                // Closing the fileOutputStream
                fos.close();
            }
        }
    }
}
