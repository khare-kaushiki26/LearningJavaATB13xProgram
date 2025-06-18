package ex_09_if_else_excercises;

import java.util.Scanner;
public class task_18_june_char_is_vowel_or_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//        IF WE WANT TO TAKE CHARACTER FROM USER USING SCANNER , THEN WE NEED TO WRITE THE STATEMENT LIKE :
//        char ch = sc.next().charAt(0);
//        if not this way then simply sc.next() would not accept a character as it expects an entire string.
//        so the data type char would not work which is why we are using charAt(0)
//

        System.out.println("Please enter the character");
        char ch =sc.next().toLowerCase().charAt(0);

        if (ch =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u')
        {
            System.out.println("Its a vowel");

        }
        else
        {
            System.out.println("Not a vowel");
        }
    }
}
