package Interface_in_java;

//ABSTRACT CLASS CAN HAVE COMPLETE FUNCTIONS BUT
// INTERFACE CANNOT HAVE COMPLETE FUNCTIONS UNLESS WE USE default as access modifier name for the interface function
public class interface_example {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(3,8);
        Square s = new Square();
        s.getArea(2,4);
    }
}
interface Polygon
{
    void getArea(int length, int breadth);
    default void print()
    {
        System.out.println("Hey this is a complete function inside the interface using default keyword");
    }
   // this is not allowed -- any function cannot be complete
   /* void test()
    {}
    */
}
class Square implements Polygon
{
    @Override
    public void getArea(int l , int b)
    {
        System.out.println("Area of the square : " + l*b);
    }
}
class Rectangle implements Polygon
{
    @Override
    public void getArea (int l, int b)
    {
        System.out.println("Area of the rectangle is " + l*b);
    }
}