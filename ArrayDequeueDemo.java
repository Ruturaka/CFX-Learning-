package codewithrutu.Collections;
import java.util.*;

public class ArrayDequeueDemo {
    public static void main(String[] args)
    {
        //Deque<Object> deque=new ArrayDeque<Object>();
        Deque<String> dq=new LinkedList<String>();

        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");

        for (Iterator itr = dq.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        for (Iterator itr = dq.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
