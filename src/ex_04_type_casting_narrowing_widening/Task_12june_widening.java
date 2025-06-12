package ex_04_type_casting_narrowing_widening;

public class Task_12june_widening {
    public static void main(String[] args) {
        double b;
        int a;
        a=100;
//                            Description: Convert int A =100 to double.
//        here we are converting into to double
//        since double > int , we need not mention forcefully.
//        It is widening as the smaller data type is getting converted to larger data type.
        b=a; // here the data type of int is converted to double without explicitly writing the expected data type

        System.out.println(b);
    }
}
