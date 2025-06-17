package ex_08_while_for_lop_in_strings;

import java.util.Scanner;
public class task_17_june_vowels_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
//        System.out.println(str);
        char ch;
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }

        }
        System.out.println("Number of vowels in the string :" + vowels);
        System.out.println("Number of consonants in the string  :" + consonants);

    }
}
