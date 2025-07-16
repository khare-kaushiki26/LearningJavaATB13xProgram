package ex_09_if_else_excercises;

import java.util.Scanner;
public class Task_25_june_electricity_bill_calculator {
    /*
    * Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
    Implement Rate Structure:
    Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit*/
    public static double bill_calculator(double unit)
    {
        double bill=0;
        if (unit > 0 && unit <= 100) {
            bill = unit * 0.50;
        } else if (unit > 100 && unit <= 200) {
            bill = ((unit - 100) * 0.75) + (100 * 0.50);
        } else if (unit > 200 && unit <= 300) {
            bill = ((unit - 200) * 1.2) + (100 * 0.75) + (100 * 0.5);
        } else if (unit > 300) {
            bill = ((unit - 300) * 1.50) + (100 * 1.2) + (100 * 0.75) + (100 * 0.5);
        }
        return bill;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        double unit_numbers = sc.nextInt();
        double total = bill_calculator(unit_numbers);
        System.out.println(total);
    }
}
