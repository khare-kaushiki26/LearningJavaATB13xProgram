package ex_12_arrays_in_java;

import java.util.Arrays;

public class max_ele_in_array {
    public static void main(String[] args) {
// finding maximum element of the array
        int [] arr = {25,14,56,15,36,56,77,18,99,29,49};
        int max =arr[0];
        for(int i =0; i< arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        Arrays.sort (arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(max);
    }
}
