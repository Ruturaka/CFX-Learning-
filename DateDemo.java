package codewithrutu.Collections;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //System.out.println("The maximum value of long is :"
        // + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : "+ System.currentTimeMillis());
        Date d=new Date();
        System.out.println("The current date is: "+d);

        //Date d1= new Date(16601074829267l);
        Date d2= new Date(32,8, 10);
        //System.out.println("The date calculated form miliseconds is : " + d1);

      //  System.out.println(d1.compareTo(d));



    }
}
