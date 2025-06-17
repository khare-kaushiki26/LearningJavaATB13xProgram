package ex_07_for_loop;

import java.math.BigInteger;
import java.util.Scanner;
public class task_17_june_factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which factorial is to be calculated");

        if (!sc.hasNextInt())
            {
                System.out.println("Please enter only positive integers");
                return;
            }
        int num= sc.nextInt();
        int factorial = 1;

//        we initialize factorial with 1 because the initial value by which we will multiply to get factorial is 1

//        factorial of 0 is always 1
            if (num < 0) {
                System.out.println("Factorial of negative numbers cannot be calculated");

            } else if (num == 0) {
                System.out.println("The factorial of 0 is " + factorial);


            } else {
                for (int i = 1; i <= num; i++) {
                    factorial = factorial * i;
                }
                System.out.println("The factorial of " + num + " is " + factorial);

            }
        }
    }
