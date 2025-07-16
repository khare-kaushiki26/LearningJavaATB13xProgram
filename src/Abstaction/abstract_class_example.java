package Abstaction;

public class abstract_class_example {
    public static void main(String[] args) {
        Dog d= new Dog();
        Son s= new Son();
        s.loan();
       //  Father d1= new Father(); // This is abstract class which is why the object cannot be created
        Father f1= new Son();
        f1.loan();
        f1.giveloan();
    }
}
class Dog
{
    // This is a concrete class as this is not abstract and the object of this class can be created
    void sound()
    {
        System.out.println("Bark");
    }
}
abstract class Father
{
    // this is an abstract function
    abstract void loan();
    // this is a complete function
    void giveloan()
    {
        System.out.println("Got 50 lakh as loan");
    }
}
class Son extends Father{

    // this needs to be overridden because the method loan is incomplete in parent class as it is marked as abstract
    @Override
    void loan() {
        System.out.println("Son will have to pay the loan");
    }
}
