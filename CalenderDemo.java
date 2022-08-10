import java.util.Calendar;
import java.util.TimeZone;

public class CalenderDemo {
    public static void main(String[] args)
    {
        /*Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());*/

        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
