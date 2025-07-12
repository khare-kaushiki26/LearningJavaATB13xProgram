package ex_10_Functions;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str;

//        Function which does not return anything is a void function
        /*
        1) Without parameter and without return type
        2) Without parameter but with return type
        3) With parameter and without return type
        4) With parameter and with return type
        * */
        sum();
        int mul = sum1();
        System.out.println(mul);
        sub(5,2);
        int result = multiply(23,45,67);
        System.out.println("The result of the multiplied values is " + result);
        System.out.println("Enter first numbers for division");
        int num1= sc.nextInt();
        System.out.println("Enter second numbers for division");
        int num2 = sc.nextInt();
        int result1= div (num1 , num2);
        System.out.println("The division result is " + result1);
    }
//     Without parameter and without return type
    static void sum(){
        int a = 5;
        int b = 4;
        int sum = a+b;
        System.out.println(sum);
    }
//    Without parameter but with return type
    static int sum1(){
        int x = 76;
        int y = 85;
        return(x*y);
    }
//     With parameter and without return type
    static void sub(int a , int b ){
        int dif = a-b;
        System.out.println("The difference is : "+  dif);
    }
//    With parameter and with return type
    static int multiply(int x, int y, int z){
        return (x*y*z);

    }
    static int div(int q, int w)
    {
        if (w==0){
            throw new ArithmeticException("The second number cannot be zero");
        }
            return (q/w);

    }
}

