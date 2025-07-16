package ex_09_if_else_excercises;

import java.util.Scanner;
public class task_25_june_palindrome_number {
    // Check if a Number is a Palindrome. 1221
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        int num = num1;
        int rev= 0;
        while( num>0)
        {
            int mod = num %10;
            rev = (rev *10) + mod;
            num = num/10;
        }
        if (rev==num1)
        {
            System.out.println("The number is palindrome");

        }
        else {
            System.out.println("The number is not palindrome");
        }
    }

}

