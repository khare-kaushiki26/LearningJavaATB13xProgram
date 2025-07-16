package ex_09_if_else_excercises;

import java.util.Scanner;
/* Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
     Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/
public class Task_25_june_bonus_calculator {
    public static void bonus_calculator(double salary, double exp) {
        if (exp < 1.0) {
            System.out.println("Not eligible for bonus as experience is less than an year");
        } else if (exp>=1.0 && exp <= 3.0) {
            double bonus = salary + (salary * 0.05);
            System.out.println("Eligible for 5% bonus , the incremented salary is " + bonus);
        } else if (exp >= 4.0 && exp <= 6.0) {
            double bonus = salary + (salary * 0.1);
            System.out.println("Eligible for 10% bonus , the incremented salary is " + bonus);
        } else if (exp > 6.0) {
            double bonus = salary + (salary * 0.15);
            System.out.println("Eligible for 15% bonus , the incremented salary is " + bonus);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the salary and the experience");
        double salary = sc.nextDouble();
        double experience = sc.nextDouble();
        bonus_calculator(salary, experience);
    }
}
