package ex_05_Increment_decrement_operator;

public class Tasks_june13_increment_operators {
    public static void main(String[] args) {
//        🔹 Program 1:
//
        int a = 5;
        int b = a++; // Dry run : value of a gets incremented after assignment to b , so final value of a is 6
        System.out.println("a:" +a + ", b : " +b );

//        🔹 Program 2

        int i = 1;
        i = i++ + ++i; // Dry run : i= 1 + 3 --->now i value increments to 2 and then to 3, so final value of i is 4
        System.out.println(i);

//        🔹 Program 3:
        int x = 5;
//      Dry run : 5+ 7 = 12 ----> because x++ increments value of x by 1 so it becomes 6 and then prefix operator again increments value by 1
        System.out.println(x++ + ++x);

//        🔹 Program 4:
         x = 5;
        System.out.println(++x); // prefix operator increments value of x by 1 before printing so x=6
        System.out.println(x++); // now the value of x is 6 and would be printed as 6 and after that it will be incremented to 7
        System.out.println(x);//now the value of x=7 so 7 would be printed

//        🔹 Program 5:
         a = 5;
         b = a++ + ++a; // 5+7 =12
        // Dry run :  value of a is incremented post , and then is incremented with prefix operator , which is why 5 +7
        System.out.println("a: " + a);//a=7 ---> latest value of a would be 7
        System.out.println("b: " + b);

//        🔹Program 6:
         x = 5;
         int y = x++ + ++x + x++ + ++x; // 5+7+7+9 = 28//
        System.out.println("x = " + x + ", y = " + y);// x=9 and y = 28
    }
}
