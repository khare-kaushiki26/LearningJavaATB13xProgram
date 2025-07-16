package Polymorphism.method_overriding;

// RULE 1 : METHOD OVERRIDING ALWAYS WORKS WITH 2 CLASSES
public class method_overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal
{
    void sound()
    {
        System.out.println("Default Sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Bark");
    }
}