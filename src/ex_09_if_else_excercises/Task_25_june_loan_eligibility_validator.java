package ex_09_if_else_excercises;

import java.util.Scanner;
public class Task_25_june_loan_eligibility_validator {
    /*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
    * Take the below User info and store it into the variables:
              Age (integer)
              Salary (double or float)
              Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer.
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
             :- Check if the salary is a positive number.
             :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
             :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
             :- Max credit score threshold (e.g., 850).*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the Age , Salary and Credit Score");
        int age=sc.nextInt();
        double salary=sc.nextDouble();
        int credit_score=sc.nextInt();
        if (age<0|| salary <0 || credit_score<0)
            System.out.println("Invalid input , please enter positive numbers");
        else if (age<18 || age>=81 || salary <30000 || credit_score<650 || credit_score>850)
            System.out.println("Not eligible for loan. Please enter age between 18-80 years , salary above 30k and credit_score between 650-850");
        else if ((age>18 && age<80) && salary >30000 && (credit_score>650 && credit_score <850))
        {
            System.out.println("Eligible for loan");
        }
    }
}
