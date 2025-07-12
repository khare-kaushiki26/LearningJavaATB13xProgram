package ex_11_strings;

import java.util.Scanner;

public class vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        int vowels=0;
        int cons =0;
        str= str.toLowerCase();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c == 'a'|| c== 'e'||  c== 'i'|| c== 'o'|| c== 'u')
                vowels = vowels+1;
            else
                cons = cons +1;
        }
        System.out.println("Number of vowels : "+ vowels);
        System.out.println("Number of consonants : "+ cons);

    }
}
