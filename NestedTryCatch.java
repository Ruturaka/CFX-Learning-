package codewithrutu;

import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args)
    {
        //Write a code that allows u to keep accessing an array until a valid index is given by user.

        boolean flag =true;
        int arr[]=new int[5];
        int ind;

        while(flag) {
            try {
                System.out.println("Welcome to Nested try-catch session.");
                System.out.println("Enter the value of index: ");
                Scanner sc = new Scanner(System.in);
                ind = sc.nextInt();
                try {
                    System.out.println("Your entered array index is walid" + arr[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception in level 2." + e);
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1:");
            }
        }
        System.out.println("Thanks for executing this code.");

    }
}
