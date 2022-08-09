package codewithrutu.Collections;
//import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(3);
        ll.add(4);
        ll.add(7);
        ll.add(5);
        LinkedList<Integer> ll2=new LinkedList<>();
        ll2.add(33);
        ll2.add(44);
        ll2.add(77);
        ll2.add(55);
        System.out.println("ll2: "+ll2);
        ll.addAll(3,ll2);

        /*for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }*/
        System.out.println("ll: "+ll);

        System.out.println("Linked list of names: ");
        LinkedList<String> names=new LinkedList<>();
        names.add("Rutu");
        names.add("umang");
        names.add("siddhi");
        names.add("jeet");
        names.add("kartik");
        names.addLast("Rishika");
        names.addFirst("Ankita");
       // names.removeLast();
        //names.remove("kartik");
        ll.clear();
        System.out.println("ll: "+ll);


        System.out.println("names: "+names);
    }
}
