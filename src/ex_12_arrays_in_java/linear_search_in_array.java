package ex_12_arrays_in_java;

import java.util.Scanner;

public class linear_search_in_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length and then the array elements");
        int len = sc.nextInt();
        int index=0;
        int [] arr = new int[len];
        for(int i = 0; i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number that needs to be searched ");
        int num = sc.nextInt();
        for(int i = 0; i< arr.length;i++)
        {
            if (arr[i]==num)
            {
                System.out.println("Element found at position " + ++i);
            }
        }

    }
}
