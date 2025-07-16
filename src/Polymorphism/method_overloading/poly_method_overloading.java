package Polymorphism.method_overloading;

public class poly_method_overloading {
    public static void main(String[] args) {
        operation op=new operation();
        // THIS IS ALL COMPILE TIME POLYMORPHISM == METHOD OVERLOADING
        // METHOD OVERLOADING - METHODS OF SAME NAME BUT DIFFERENT NUMBER OF PARAMETERS
        op.add(2,3);
        String fname= op.add("kaushiki ", "khare");
        System.out.println(fname);
        op.add(2,3,2);
        double result= op.add(2.5,99.8);
        System.out.println(result);
        int z= op.add(90);
        System.out.println(z);

    }
}
class operation
{
    void add (int a, int b)
    {
        System.out.println(a+b);
    }
    void  add(int a , int b , int c)
    {
        System.out.println(a+b+c);
    }
    String add (String a, String b)
    {
        return a+b;
    }
    int add(int a)
    {
        int x=5;
        return  a+x;
    }
    double add(double a, double b)
    {
        return a+b;
    }
}
