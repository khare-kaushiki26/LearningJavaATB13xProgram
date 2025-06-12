package ex_03_ternary_operator;

public class task12_june_Even_or_Odd {
    public static void main(String[] args) {
//        Description: Uses ternary to check whether a number is even or odd.
//        A = 19, update the value and check again A =20;

//        before updating :
        int a = 19;
        String result = (a%2==0)? "Even": "Odd";
        System.out.println(result);
//        after updating :
        a = 20;
        result = (a%2==0)? "Even": "Odd";
        System.out.println(result);
    }
}
