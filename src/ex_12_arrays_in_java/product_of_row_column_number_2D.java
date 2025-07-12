package ex_12_arrays_in_java;

import java.util.Scanner;
public class product_of_row_column_number_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number n e.g n=3");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++)
        {
            for (int j = 0; j< n; j++)
            {
                System.out.print(i*j+ "|");
            }
            System.out.println();
        }
    }
}
