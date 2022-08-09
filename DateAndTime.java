package codewithrutu;

public class DateAndTime
{
    public static void main(String[] args)
    {
        /*
        Date in java is stored in the form of a long numer. This long
        number holds the number of miliseconds passed since 1 jan 1970.

        Java assumes that 1900 is the start year which means it calculates
        years passed since 1900 whenever We ask it for years passed .
        System current Time Millis () returns no of mili seconds passed.
        Once no. of ms are calculated, we can calculate minutes, seconds
         & years passed */
        System.out.println("No. of mili seconds passed since 1 jan 1970 :"+
                System.currentTimeMillis()+" ms");
        System.out.println("No. of yrs passed since 1900 is: "+
                System.currentTimeMillis()/1000/3600/24/365+" years");
    }
}
