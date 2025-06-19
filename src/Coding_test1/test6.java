package Coding_test1;

public class test6 {
    public static void main(String[] args) {
//        Create a program to find the largest of three numbers.
        int a = 9;
        int b = 10;
        int c = 99;
        int result=0;
        if (a>b) {
            if (a > c) {
                result = a;
            }
        }else if (b>c) result = b;
        else  result = c;
        System.out.println(result);
        }
    }

