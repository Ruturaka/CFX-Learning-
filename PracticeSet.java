package codewithrutu.Collections;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PracticeSet {
    public static void main(String[] args)
    {
        //1. Create a ArrayList & store names of 10 students inside it. Print it
        //using a enhanced for loop.
        /*ArrayList<String> names=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            String s=sc.nextLine();
            names.add(s);
        }
        System.out.println("You entered: ");
        for(String o:names)
            System.out.println(o);*/

        //2. Use the Date class in java to print time in the following format: 21:47:02
        Date d=new Date();
        System.out.println("Date - "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

         //3. Repeat 2 using the calendar class
       Calendar c=Calendar.getInstance();
       System.out.println("Calendar - "+c.get(Calendar.HOUR_OF_DAY)+":" +c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


        //4. Repeat 2 using the java.time API
        LocalTime t=LocalTime.now();
        System.out.println("LocalTime - "+t.getHour()+":"+t.getMinute()+":"+t.getSecond());

        //5. Repeat 2 using the java.time
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myDate=dt.format(df);
        System.out.println("DateTimeFormattter- "+myDate);

        //6. Create a set in java. Try to store duplicate elements inside this set and verify that only
        //one instance is stored.
        HashSet<String> hs=new HashSet();
        hs.add("Normal people");
        hs.add("Eat pray love");
        hs.add("Alchemist");
        hs.add("Do Epic Shit");
        hs.add("Normal people");
        System.out.println(hs);



    }
}
