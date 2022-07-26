package com.confluxsys;
import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        System.out.println("Enter your annual income in lakh: ");
        Scanner sc=new Scanner(System.in);
        int tax=0;
        int amt=sc.nextInt();
        if(amt>=250000 && amt<=500000)
            tax=5*amt/100;
        else if(amt>500000 && amt<=1000000)
            tax=20*amt/100;
        else if(amt>1000000)
            tax=30*amt/100;
        if(tax>0)
            System.out.println("Tax to be paid is: "+tax);
        else
            System.out.println("Tax is not applicable");
    }

}
