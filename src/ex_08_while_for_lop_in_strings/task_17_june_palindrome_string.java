package ex_08_while_for_lop_in_strings;

import java.util.Scanner;
public class task_17_june_palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
//      System.out.println(str);
        String revstr = "";
        int len = str.length();
        char ch;
//      System.out.println(len);
        for (int i = len - 1; i >= 0; i--) {
            ch = str.charAt(i);
//            System.out.println(ch);
            revstr = revstr + ch;
        }
        if (revstr.equals(str)) {
            System.out.println("String '" + str + "' is palindrome");
        } else {
            System.out.println("String '" + str + "' is not palindrome");
        }
    }
}
