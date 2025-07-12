package ex_12_arrays_in_java;

import java.util.Scanner;

public class Task_25June {
    public static void main(String[] args) {

        //Find Second Largest Number in an Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int [] arr  = new int [len];
        System.out.println("Enter the array elements");
        int temp;
        for (int i = 0; i< arr.length; i ++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i< arr.length; i ++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j]<arr[i])
                {
                    temp= arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("The second maximum number in the array is " + arr[arr.length-2]);
    }
}

