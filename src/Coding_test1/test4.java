package Coding_test1;

public class test4 {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(a);
        a= a++;
        System.out.println(a);
        int b =10;
        if (a>b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        boolean ans = (a>b) || (a==b);
        System.out.println(ans);
        boolean ans1 = a>b && a==b;
        System.out.println(ans1);
        System.out.println(a/b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
    }
}
