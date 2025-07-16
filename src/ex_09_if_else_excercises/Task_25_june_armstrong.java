package ex_09_if_else_excercises;

import java.util.Scanner;
public class Task_25_june_armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        int num1=number;
        int num = number;
        //System.out.println(num);
        int mod=0;
        int digits=0;
        int arm=0;
        while(num>0)
        {
            mod = num % 10;
            digits++;
            num = num/10;
        }
        //System.out.println(digits);
        for(int i = 1;i<= digits; i++)
        {
            mod = num1%10;
            arm= arm +(int)Math.pow(mod,digits);
            num1 = num1/10;
        }
        if (number==arm)
        {
        System.out.println("Number is an armstrong number");
         }
        else
            System.out.println("Number is not an armstrong number");

    }

}
