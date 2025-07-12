package ex_11_strings;

import java.util.Scanner;
public class Task_24_june {
    /* ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
    Steps to Write the Program
    1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
    2️⃣ Take user input for the amount they want to withdraw.
    3️⃣ Check withdrawal conditions:
    The amount should be greater than zero.
    The amount should be a multiple of 100 (common ATM rule).
    The amount should not exceed the account balance.
    4️⃣ Deduct the amount from the balance if conditions are met.
    5️⃣ Display the updated balance or an error message if the withdrawal fails.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 10000;
        System.out.println("Enter the amount to be withdrawn : ");
        int deduct = sc.nextInt();
        if (deduct == 0 || (deduct % 100 != 0))
        {
            System.out.println("The amount to be withdrawn must be greater than zero and a multiple of 100");
        }
        if ((deduct%100 == 0) && deduct <amount)
        {
            System.out.println("The balance before withdrawal was : "+ amount);
            amount = amount - deduct;
            System.out.println("The updated balance after the withdrawal is : "+ amount);
        }
        if (deduct >amount)
        {
            System.out.println("Insufficient balance");
        }
    }
}

