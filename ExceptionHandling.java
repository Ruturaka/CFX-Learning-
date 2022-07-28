import java.io.*;

class Parent1 {
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}

class Child1 extends Parent1 {
    @Override
        // no issue while throwing same exception
    void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }
}
class Child2 extends Parent1 {
    @Override
        // no issue while throwing subclass exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child2 m1()");
    }
}
class Child3 extends Parent1 {
    @Override
        // no issue while not throwing any exception
    void m1()
    {
        System.out.println("From child3 m1()");
    }
}
class Child4 extends Parent1 {
    @Override
        // compile-time error
        // issue while throwing parent exception
    void m1() throws Exception
    {
        System.out.println("From child4 m1()");
    }
}
class Parent {
    void m1()
    {
        System.out.println("From parent m1()");
    }

    void m2()
    {
        System.out.println("From parent  m2()");
    }
}

class Child extends Parent {
    @Override
        // no issue while throwing unchecked exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child m1()");
    }

    @Override
        // compile-time error
        // issue while throwing checked exception
        // what I learned is that we can remove this error if we write throw Exception in void m2() method in parent class
        // i.e in parent void m2() method -> void m2() throw Exception. Writing it like this removes compile time error
        // as according to Rule #2 : sub-class overriding method can throw same, sub-class exception.
    void m2() throws Exception
    {
        System.out.println("From child m2");
    }
}
public class ExceptionHandling {
    public static void main(String[] args)
    {


        //// Java Program to Illustrate Un-checked Exceptions
        /*
        int x=3,y=0;
        System.out.println(x/y);*/


        // Java Program to Illustrate Checked Exceptions
        // Where FileNotFoundException does not occur
        //FileNotFoundException is a subclass of IOException, we can just specify IOException
        // in the throws list and make the above program compiler-error-free.
        /* throws IOException
        {

            // Creating a file and reading from local repository
            FileReader file = new FileReader("C:\\test\\a.txt");

            // Reading content inside a file
            BufferedReader fileInput = new BufferedReader(file);

            // Printing first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            // Closing all file connections
            // using close() method
            // Good practice to avoid any memory leakage
            fileInput.close();
        }*/

        /*
        //Java Program to Illustrate Checked Exceptions
        //where FileNotFoundException occurred

        // Reading file from path in local directory
        FileReader file = new FileReader("C:\\test\\a.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() method
        fileInput.close();*/

        // 7. Overriding and Exception-Handling : Below are two rules to note when overriding methods related to
        // exception-handling.

        //Rule#1 : If the super-class overridden method does not throw an exception, subclass overriding method can only throws
        // the unchecked exception, throwing checked exception will lead to compile-time error.

        // Java program to demonstrate overriding when
        //superclass method does not declare an exception
        //( i used parent and child class


        //Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only
        // throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time
        // error. Also there is no issue if subclass overridden method is not throwing any exception.

        // Java program to demonstrate overriding when
        // superclass method does declare an exception

        //8. Overriding and abstract method: Abstract methods in an interface or abstract class are meant to be
        // overridden in derived concrete classes otherwise a compile-time error will be thrown.

        //9. Overriding and synchronized/strictfp method : The presence of synchronized/strictfp modifier with method
        // have no effect on the rules of overriding, i.e. it’s possible that a synchronized/strictfp method can
        // override a non synchronized/strictfp one and vice-versa.
    }
}
