package ex_12_arrays_in_java;

public class min_ele_array {
    public static void main(String[] args) {
        int [] arr = {25,14,56,15,36,56,77,18,99,4,29,49};
        int min = arr[0];
        for (int i = 0; i < arr.length;i ++)
        {
            if (arr[i]< min) {
                min = arr[i];

            }
        }
        System.out.println(min);
    }
}
