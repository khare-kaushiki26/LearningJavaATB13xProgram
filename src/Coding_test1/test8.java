package Coding_test1;

import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
//        9. Create a program using switch statement to display day of the week.
        int week ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week between 1-7");
        week = sc.nextInt();
        switch (week)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
