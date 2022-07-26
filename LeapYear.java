import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        System.out.println("Enter a year: ");
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if(yr%400==0 || yr%4==0 && yr%100!=0)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}
