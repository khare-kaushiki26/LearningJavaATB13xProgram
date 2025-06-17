package ex_07_for_loop;

import java.util.Scanner;
import java.util.Random;

public class task_17_june_number_guessing_game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rd = new Random();
        int rdnum= rd.nextInt(100)+1;
//        System.out.println(rdnum);
        int guess;
        int attempts=0;
        System.out.println("Please enter a number");
//        int number = sc.nextInt();
        while (true)
        {
            guess= sc.nextInt();
            attempts ++;
            if (guess > rdnum){
                System.out.println("Number too high , please enter another guess");
            }
            else if (guess < rdnum) {
                System.out.println("Number too low, please enter another guess");
            }
            else{
                    System.out.println("Correct , the number matched and you cleared in " + attempts + " attempts");
                    break;
            }
        }
    }
}
