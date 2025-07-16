package Abstaction;

public class real_example_abstraction {
    public static void main(String[] args) {
        wagonR w = new wagonR();
        w.drive();
    }
}
abstract class Engine
{
    abstract void startEngine();
    abstract void stopEngine();
}
class wagonR extends Engine
{
    @Override
    void startEngine()
    {
        System.out.println("Starting the engine of the car");
    }
    @Override
    void stopEngine()
    {
        System.out.println("Stopping the car");
    }
    void drive()
    {
        System.out.println("Alright , car is starting");
        startEngine();
        stopEngine();
    }
}