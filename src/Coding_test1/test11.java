package Coding_test1;

import java.util.Scanner;
public class test11 {
    public static void main(String[] args) {
//        Create a program to calculate factorial of a number using while loop.
        int factorial =1;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num ==0){ factorial = 1;}
        while (num > 0)
        {
            factorial = factorial * num;
            num --;
        }
        System.out.println(factorial);
    }
}
