package Coding_test1;

import java.util.Scanner;
public class test7 {
    public static void main(String[] args) {
//8. Write a program to check if a year is a leap year.
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the year :");
                int year = sc.nextInt();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    System.out.println("Leap year");
                }
                else
                {
                    System.out.println("Not a leap year");

                }
            }
        }

