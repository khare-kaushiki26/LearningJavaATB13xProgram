package ex_12_arrays_in_java;

import java.util.Scanner;

public class sum_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len= sc.nextInt();
        int [] arr =new int[len];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i< len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i< arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array elements is " + sum);
    }

}
