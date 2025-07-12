package ex_12_arrays_in_java;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
// array sorting using built in functions
public class sorting_array_using_builtin_fn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Integer [] arr;
        System.out.println("Enter the size of the array ");
        int len = sc.nextInt();
        arr = new Integer[len];
        System.out.println("Enter the elements ");
        for(int i = 0;i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        // sorting in ascending order
        Arrays.sort(arr);
        for(int i = 0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //sorting in descending order
        Arrays.sort(arr,Comparator.reverseOrder());

        for(int i = 0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
