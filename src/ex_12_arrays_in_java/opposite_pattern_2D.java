package ex_12_arrays_in_java;

import java.util.Scanner;
public class opposite_pattern_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number e.g n= 3");
        int n = sc.nextInt();
        /*  0,0 | 0,1 | 0,2
         *   1,0 | 1,1 | 1,2
         *   2,0 | 2,1 | 2,2
         *
         *   0,0 | 0,1 | @
         *   1,0 |  @  | @
         *    @  |  @  | @
         *
         *    */
        for (int i = 1; i <= n; i++)
        {
            for (int k =n; k > i; k--)
            {
                System.out.print(" ");
            }
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
