package Interface_in_java;

public class variables_of_interface {
    public static void main(String[] args) {
        add add= new add();
        add.sum();
        add.summation();
    }
}

abstract class ABC
{
    // HERE IN ABSTRACT CLASS , VARIABLE IS NOT FINAL , HENCE THE VALUE CAN BE CHANGED
    int a =100;
    void sum ()
    {
        System.out.println("Initial value of a " + a);
        a= a+10;
        System.out.println("The value is incremented by 10");
        System.out.println(a);
    }
}

interface XYZ
{
    // VALUE OF THE VARIABLE CANNOT BE CHANGED IN THE INTERFACE BECAUSE ALL THE VARIABLES OF AN INTERFACE ARE FINAL
    int a = 20;
    default void summation()
    {
        // VALUE OF a CANNOT BE CHANGED
        //a=a=10;
        System.out.println("Value cannot be changed as it is a variable of an interface");
        System.out.println(a);
    }
}
class add extends ABC implements XYZ{

}