package codewithrutu;
import java.io.*;


public class Prblm3 {
    public static void main(String[] args) throws IOException {
        //The following program copies the data of two files (source files) in a specified
        // file (target file). At the time of execution of this program,it takes the number of file
        // with their names that have to be copied. The last file is a target file that contains all
        // data of the given source files. The method copyfile() copies the contents of all given files
        // to a specific file. When all data are copied to specified file, it will display a message
        // "File copied" otherwise Exception is thrown and data will not be be copied.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of files that have to be copied:");
        int n = Integer.parseInt(bf.readLine());
        String fileName[] = new String[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter file name:");
            fileName[i] = bf.readLine();
        }

        for (int j=0; j<n-1; j++){
            copyfile(fileName[j],fileName[j+1]);
        }
        System.out.println("File copied.");
    }
    public static void copyfile(String srFile, String dtFile){
        try{
            File f1 = new File(srFile);
            File f2 = new File(dtFile);
            InputStream in = new FileInputStream(f1);
            //For Append the file.
            OutputStream out = new FileOutputStream(f2,true);

            //For Overwrite the file.
//  OutputStream out = new FileOutputStream(f2);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0){
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage() + " in the specified directory.");
            System.exit(0);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
