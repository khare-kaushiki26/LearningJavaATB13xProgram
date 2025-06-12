package ex_04_type_casting_narrowing_widening;

public class Task_12_june_narrowing {
    public static void main(String[] args) {
//        Description: Casts a double to an int, cutting off decimals value.
//        here we are converting into to double
//        since double > int , we need not mention forcefully.
//        It is widening as the smaller data type is getting converted to larger data type.
        double b;
        int a;
        b=100.03;
        System.out.println(b);
        a=(int)b; // here the data type of int is converted to double without explicitly writing the expected data type
        System.out.println(a);
    }

}
