package ex_12_arrays_in_java;

public class copy_an_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] copy = new int[arr.length];
        System.arraycopy(arr,0,copy,0,arr.length);
        for (int i = 0; i<arr.length;i++){
            System.out.println(copy[i]);
        }

    }
}
