import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1. Create a array of 5 floats and calculate their sum
        /*float []array=new float[5];
        float sum=0f;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextFloat();
        }
        System.out.println(("You entered:"));
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println("sum="+sum);*/


        //2. Code to find out whether a given integer is present in an array or not
        /*float [] array={45.7f,67.8f,63.4f,99.2f,100.0f};
        float val;
        Scanner  sc=new Scanner(System.in);
        val=sc.nextFloat();
        boolean isInArray=false;

        for(float i:array)
        {
            if(i== val)
            {
                isInArray=true;
                break;
            }
            else
                continue;

        }
        int i;
        if(isInArray==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }*/
        //3. Find the avg of numbers in array
        /*float[] array = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : array) {
            sum += element;
        }
        System.out.println("the value of avg is: " + sum / array.length);*/

        //4. Code to add 2 matrices of size 2*3

        /*int mat1[][] = new int[2][3];
        int mat2[][] = new int[2][3];
        int res[][]= new int[2][3];
        System.out.println("Enter values for matrix 1:");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i<mat1.length; i++)
            for (int j = 0; j<mat1[i].length; j++)
                mat1[i][j] = sc1.nextInt();

        System.out.println("Enter values for matrix 2:");
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < mat2.length; i++)
            for (int j = 0; j< mat2[i].length; j++)
                mat2[i][j] = sc2.nextInt();

        System.out.println("Resultant sum of matrix is:");
       for (int i = 0; i < res.length; i++)
            for (int j = 0; j< res[i].length; j++)
                res[i][j] =mat1[i][j]+mat2[i][j];

        for (int i = 0; i < res.length; i++)
        {
            for (int j = 0; j < res[i].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }*/

        //5. Code to revere an array
        /*int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i< arr.length;i++)
            arr[i]= sc.nextInt();

        int j=0;
        i--;
        while(j<i)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
            i--;
        }
        System.out.println("After reversing: ");

        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");*/

        //6. Code to find the maximum element in an array
        /*int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i< arr.length;i++)
            arr[i]= sc.nextInt();

        int max=arr[0];
        i=0;
        while(i<arr.length)
        {
            if(max<=arr[i])
            {
                max=arr[i];
            }
            i++;
        }
        System.out.println("Max element of the array is: "+max);*/

        //7. Code to find the minimum element in an array
        /*int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i< arr.length;i++)
            arr[i]= sc.nextInt();

        int min=arr[0];
        i=0;
        while(i<arr.length)
        {
            if(min>=arr[i])
            {
                min=arr[i];
            }
            i++;
        }

        System.out.println("Minimum element of an array is: "+min);*/

        //8. Code to find whether an array is sorted or not
        boolean isSorted=true;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        for(int i=0;i< arr.length-1;i++)
            if(arr[i]>arr[i+1])
                isSorted=false;
        if(isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");



    }

}
