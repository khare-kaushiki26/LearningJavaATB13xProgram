package Coding_test1;
import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
            for (j= 1;j<11;j++)
            {
                System.out.println(num +"X" + j + "=" + num*j);
        }
    }
}
