package ex_09_if_else_excercises;

import java.util.Scanner;
public class task_18_june_grade_calculator {
    public static void main(String[] args) {
        /*Write a program that calculates and displays the letter grade for a given numerical score
         (e.g., A, B, C, D, or F) based on the following grading scale:
         A: 90-100
         B: 80-89
         C: 70-79
         D: 60-69
         F: 0-59
         HERE WE ARE TAKING DECIMAL SCORE ALSO AND ROUNDING OFF BASIS ON THE DECIMAL VALUE
         AND THEN PRINTING THE GRADES ACCORDINGLY
         */

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numerical score : ");
        float score = sc.nextFloat();
        if(score >=0 && score <=100){
            if(score >=89.5 && score <=100.0)
            {
                System.out.println(" The grade is A");
            }
            else if (score >=79.5 && score <=89.4)
            {
                System.out.println("The grade is B");
            }
            else if ( score >=69.5 && score <=79.4)
            {
                System.out.println("The grade is C");
            }
            else if (score >=59.5 && score <= 69.4)
            {
                System.out.println("The grade is D");
            }
            else if (score >=0.0 && score <=59.4)
            {
                System.out.println(" The grade is F");
            }
        }
        else{
            System.out.println("Only positive integers accepted, please enter score between 0-100");
        }
    }
}
