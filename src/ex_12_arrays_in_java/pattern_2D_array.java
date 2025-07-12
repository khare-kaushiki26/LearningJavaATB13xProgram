package ex_12_arrays_in_java;

import java.util.Scanner;
public class pattern_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n , e.g n=5");
        int n = sc.nextInt();
//        We are printing * till a condition where i = j but when j> i then it breaks and goes for other iteration
        for (int i =1;i<=n; i++)
        {
            for (int j =0; j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
