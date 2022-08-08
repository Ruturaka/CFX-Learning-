package codewithrutu;
import java.util.Scanner;
import java.util.Arrays;

class PeopleLibrary
{
    private String b[];
    private int issueB[];
    private int returnB[];
    private int no;

    PeopleLibrary(int no)
    {
        this.no=no;
        issueB=new int [no];
        returnB=new int[no];
        b=new String[no];
    }
    public void takeInput()
    {

        System.out.println("Enter "+no+" books: ");

        for(int i=0;i<no;i++)
        {
            Scanner sc1=new Scanner(System.in);
            b[i]=sc1.nextLine();
        }
    }
    public void showAvailableBooks()
    {
        System.out.println("Available books");
        for(int i=0;i<no;i++)
        {
            if(issueB[i]==0)
                System.out.println(b[i]);
        }
    }
    public void addBook(String bname)
    {
        int i=0;
        while(!(b[i].equals("")) && i<no)
        {
            i++;
        }
        b[i]=bname;
    }
    public void issueBook(String bname)
    {
        int flag=0;
        for(int i=0;i<no;i++)
        {
            if(b[i].equals(bname))
            {
                issueB[i] = 1;
                flag=1;
                System.out.println("Your book is issued.");
                break;
            }
        }
        if(flag==0)
            System.out.println("Sorry the book u want to issue isn't available.");
    }
    public void returnBook(String bname)
    {
        for(int i=0;i<no;i++)
        {
            if(b[i].equals(bname))
            {
                returnB[i]=1;
                issueB[i]=0;
                System.out.println("Thanks for returning the book.");
                break;
            }
        }
    }
    public void issuedBooks()
    {
        System.out.println("Issued books are:");
        for(int i=0;i<no;i++)
        {
            if(issueB[i]==1)
                System.out.println(b[i]);
        }
    }
    public void showAllBooksStatus()
    {
        System.out.println("\nAll books status: ");
        System.out.printf("\nBook name\t\t\t\t\t\tIssue status\tReturn status");
        for(int i=0;i<no;i++)
        {
            //'-' flag : The result of the conversion is left-justified within the field.
            // The conversion is right-justified if this flag is not specified.
            //26,12 & 12 are width.
            System.out.printf("\n%-26s %12d %12d",b[i],issueB[i],returnB[i]);
        }
    }


}

public class Library {
    public static void main(String[] args)
    {

        //Question - You have to implement a library using Java class Library
        //Methods: issueBook, returnBook, addBook,showAvailableBooks
        //Properties: Array to store the available books,
        //Array to store the issued books.

        //String[] strAr3= new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("How many books you want to keep in library?");
        int no=sc.nextInt();
        PeopleLibrary pl=new PeopleLibrary(no);
        pl.takeInput();

        pl.showAvailableBooks();

        pl.addBook("The magic of thinking big");

        pl.issueBook("normal people");
        pl.issuedBooks();
        pl.returnBook("normal people");
        pl.issuedBooks();

        //pl.showAvailableBooks();

        pl.showAllBooksStatus();

    }
}
