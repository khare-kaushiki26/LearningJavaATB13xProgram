package Coding_test1;
import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("zero");
        }
        else if (num >0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
