package super_keyword;

public class super_example {
    public static void main(String[] args) {
        Animal a= new Dog();
    }
}
class Animal
{
    int a = 3;
    Animal()
    {
        System.out.println("Default Constructor");
    }
    void sound ()
    {
        System.out.println("This is animal class , and the sound is of an animal");
    }
}
class Dog extends Animal
{

    @Override
    void sound()
    {
        System.out.println("Dog barks");
        super.sound();
    }
    Dog()
    {
        //default constructor using super keyword can only be called in the default constructor of the child class
        super();
    }
    void print()
    {
        System.out.println(super.a);
    }
}
