package codewithrutu.Collections;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTimeDemo {
    public static void main(String[] args)
    {
        LocalDate d= LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy -- E");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df);
        System.out.println(myDate);
        
    }
}
