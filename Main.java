package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter km:");
        Scanner sc=new Scanner(System.in);
        int km=sc.nextInt();
        double m=km*0.621371;
        System.out.println(km+" km="+m+" miles");

    }
}
