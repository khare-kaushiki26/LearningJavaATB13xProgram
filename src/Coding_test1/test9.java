package Coding_test1;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
//         Write a program to create a simple calculator using switch statement.
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter two integers for calculation");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation to be peformed by chosing any one : Add, Subtract, Divide, Multiply, Modulus");
        String cal = sc.next().toLowerCase();

        switch (cal)
        {
            case "add":
                System.out.println(a+b);
                break;
            case "subtract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "divide":
                System.out.println(a/b);
                break;
            case "modulus":
                System.out.println(a%b);
                break;
        }
    }
}
