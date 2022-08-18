package codewithrutu;
import java.util.ArrayList;
import java.util.Date;

class Book
{
    protected String bName;
    protected String aName;

    Book(String bName, String aName)
    {
        this.bName = bName;
        this.aName = aname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    private ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}
public class RhLibrary {
    public static void main(String[] args)
    {
        //ArrayList<Integer> arrli = new ArrayList<Integer>();
        ArrayList<Book> books=new ArrayList<Book>();

    }
}
