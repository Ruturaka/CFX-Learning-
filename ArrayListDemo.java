package codewithrutu.Collections;
import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>(50);
        ArrayList<Integer> arr2=new ArrayList<>(30);
        System.out.println(arr.isEmpty());
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(1,55);
        arr.set(3,67);
        System.out.println("Element removed:" +arr.remove(4));
       // System.out.println(arr.isEmpty());
        System.out.println("size: "+arr.size());
        //System.out.println("iterator: "+arr.iterator());

       // arr.trimToSize();
        System.out.println("Arr: ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("Arr2: ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr2.get(i));
        }


    }
}
